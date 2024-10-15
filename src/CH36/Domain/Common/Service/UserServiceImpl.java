package CH36.Domain.Common.Service;

import java.util.HashMap;
import java.util.Map;

import CH36.Domain.Common.Dao.SessionDaoImpl;
import CH36.Domain.Common.Dao.UserDaoImpl;
import CH36.Domain.Common.Dao.ConnectionPool.ConnectionPool;
import CH36.Domain.Common.Dto.SessionDto;
import CH36.Domain.Common.Dto.UserDto;

public class UserServiceImpl implements UserService {

	//
	private UserDaoImpl userDaoImpl;
	private SessionDaoImpl sessionDaoImpl;
	
	private ConnectionPool connectionPool;
	
	//싱글톤 패턴 코드(추가해주세요 - )
	private UserServiceImpl() throws Exception{
		userDaoImpl = UserDaoImpl.getInstance();
		this.sessionDaoImpl = SessionDaoImpl.getInstance();
		
		this.connectionPool = ConnectionPool.getInstance();
		
	}
	
	private static UserServiceImpl instance;
	public static UserServiceImpl getInstance() throws Exception {
		if(instance==null)
			instance = new UserServiceImpl();
		return instance;
	}
	
	//CRUD
	//회원가입 함수명(1)
	@Override
	public boolean memberJoin(UserDto userDto) throws Exception {
		//비즈니스 유효성 체크 항목 고려
		return userDaoImpl.insert(userDto) > 0;
	}
	

	//로그인
	@Override
	public Map<String, Object> login(UserDto userDto, Integer sessionId) throws Exception {
		//TX Start
		Map<String,Object> returnValue=null;
		try {
				connectionPool.beginTransaction();
				returnValue = new HashMap();
				//로그인된 상태인지 확인(tbl_Session에서 session조회)
				SessionDto sessiondto = null;
				if(sessionId!=null) {
					sessiondto =  sessionDaoImpl.select(sessionId);		
				}else {
					sessiondto = sessionDaoImpl.select(userDto.getUsername());
				}
				
				if(sessiondto!=null) {
					returnValue.put("success", false);
					returnValue.put("message", "로그인된 상태입니다.");
					return returnValue;
				}
				
				//요청한 username 과 동일한 계정이 있는지확인(tbl_user)
				UserDto dbUserDto = userDaoImpl.select(userDto.getUsername());
				if(dbUserDto==null) {
					returnValue.put("success", false);
					returnValue.put("message", "계정이 존재하지 않습니다.");
					return returnValue;	
				}
				
				//요청한 password 가 db에 저장된 password와 동일한지 확인
				String pw = userDto.getPassword();
				String dbPw = dbUserDto.getPassword();
				if(!pw.equals(dbPw)) {
					returnValue.put("success", false);
					returnValue.put("message", "패스워드가 일치하지 않습니다.");
					return returnValue;		
				}
				
				//session객체 생성후 table 저장
				SessionDto sessionDto = new SessionDto();
				sessionDto.setUsername(userDto.getUsername());
				sessionDto.setRole(dbUserDto.getRole());
				sessionDaoImpl.insert(sessionDto);
				
				//sessionId를 반환
				SessionDto dbSessionDto = sessionDaoImpl.select(userDto.getUsername());
				returnValue.put("success", true);
				returnValue.put("message", "로그인 성공!");
				returnValue.put("sessionId", dbSessionDto.getSessionId());
				returnValue.put("role", dbSessionDto.getRole());			
				connectionPool.commitTransaction();
		}catch(Exception e) {
			connectionPool.rollbackTransaction();
			throw e;
		}
		return returnValue;
	}
	
	@Override
	public Map<String,Object> logout(int sessionId) throws Exception{
		//TX 처리할 것
		Map<String,Object> returnValue = null;
		try {
			
				connectionPool.beginTransaction(); //tx start
				returnValue = new HashMap();
				
				
				//1
				SessionDto sessionDto = sessionDaoImpl.select(sessionId);
				if(sessionDto==null) {
					returnValue.put("success", false);
					returnValue.put("message", "로그인상태가 아닙니다");
					return returnValue;
				}
			
				//2
				int result = sessionDaoImpl.delete(sessionId);
				if(result>0) {
					returnValue.put("success", true);
					returnValue.put("message", "로그아웃 완료!");	
				}
				
				
				connectionPool.commitTransaction(); //tx end
				
		
		}catch(Exception e) {
			connectionPool.rollbackTransaction();
			throw e;
		}
		
		return returnValue;
	}
	
	@Override
	public SessionDto getSession(int sessionId) throws Exception{
		return sessionDaoImpl.select(sessionId);
	}
	
	
	//회원수정(2)
	//회원탈퇴(3)
	//회원정보조회(4)
	//회원전체정보조회(5)

	//로그인 함수명(6 - )
	//로그아웃 함수명(7 - )
	//
	

}

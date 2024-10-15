package CH36.Domain.Common.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import CH36.Domain.Common.Dao.BookDao;
import CH36.Domain.Common.Dao.BookDaoImpl;
import CH36.Domain.Common.Dao.ConnectionPool.ConnectionPool;
import CH36.Domain.Common.Dto.BookDto;
import CH36.Domain.Common.Dto.SessionDto;

public class BookServiceImpl implements BookService {
	
	//BookDao 연결
	private BookDao bookDaoImpl;
	
	//UserService 연결
	private UserServiceImpl userServiceImpl;
	
	//ConnectionPool
	private ConnectionPool connectionPool;
	
	//싱글톤 패턴 처리코드
	private BookServiceImpl() throws Exception {
		System.out.println("[SERVICE] BookServiceImpl()..");
		bookDaoImpl = BookDaoImpl.getInstance();
		//TX
		this.connectionPool = ConnectionPool.getInstance();
		//
		this.userServiceImpl = userServiceImpl.getInstance();

	};
	private static BookService instance;
	public static BookService getInstance() throws Exception {
		if(instance==null)
			instance = new BookServiceImpl();
		return instance;
	}
	
	//도서등록
	@Override
	public Map<String,Object> bookRegistration(BookDto dto,int sessionId) throws Exception{

		Map<String,Object> returnValue = new HashMap();
		try {
			connectionPool.beginTransaction(); //tx start
			
			//
			SessionDto sessionDto =  userServiceImpl.getSession(sessionId);
			if(sessionDto==null) {
				returnValue.put("success", false);
				returnValue.put("message", "로그인이 필요한 서비스입니다.");	
			}else{
				
				String role = sessionDto.getRole(); 
				//ROLE_MEMBER인지 확인
				if(!"ROLE_MEMBER".equals(role)) {
					returnValue.put("success", false);
					returnValue.put("message", "사서계정권한이 필요합니다.");			
				}
				else {
					//사서권한 확인(ROLE_MEMBER)
					BookDto dbBookDto = bookDaoImpl.select(dto.getBookCode());
					if(dbBookDto!=null) {
						returnValue.put("success", false);
						returnValue.put("message", "동일 도서가 존재합니다.");					
					}else {
						
					  int result = bookDaoImpl.insert(dto);
					  if(result>0) {
							returnValue.put("success", true);
							returnValue.put("message", "도서등록 완료!"); 				  
					  }else {
							returnValue.put("success", false);
							returnValue.put("message", "도서등록 실패.. 관리자에게 문의하세요"); 		  
					  }
						
					  
					}
					
					
				}
				
			}
			
			
			
			
			connectionPool.commitTransaction(); //tx end
		
		}catch(Exception e) {
			connectionPool.rollbackTransaction();//
			throw e;
		}
		

		return returnValue;
	}
	
	
	
	//도서내용수정
	@Override
	public boolean bookUpdate(BookDto dto) throws Exception {
		
		
		
		
		return bookDaoImpl.update(dto) > 0;
	}
	//도서삭제
	@Override
	public boolean bookRemove(long bookCode) throws Exception {
		return bookDaoImpl.delete(bookCode) > 0;
	}
	//도서 조회(단건 - BookDto)
	@Override
	public BookDto getBook(long bookCode) throws Exception{
		return bookDaoImpl.select(bookCode);
	}
	//도서 조회(다건 - List<BookDto))
	@Override
	public List<BookDto> getBooks() throws Exception {
		return bookDaoImpl.select();
	}
	
	@Override
	public void txTests() throws Exception{
			
		try {
		connectionPool.beginTransaction();	//TX 시작
		BookDto dto1 = new BookDto(101010L,"a","a","a");
		BookDto dto2 = new BookDto(101011L,"a","a","a");
		BookDto dto3 = new BookDto(101012L,"a","a","a");	//오류발생 !
		BookDto dto4 = new BookDto(101013L,"a","a","a");
		bookDaoImpl.insert(dto1);
		bookDaoImpl.insert(dto2);
		bookDaoImpl.insert(dto3);
		bookDaoImpl.insert(dto4);
		connectionPool.commitTransaction();
		}catch(Exception e) {
			connectionPool.rollbackTransaction();
			throw e;
		}
		
	}
	
	
	

}

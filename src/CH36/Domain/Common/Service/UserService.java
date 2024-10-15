package CH36.Domain.Common.Service;

import java.util.Map;

import CH36.Domain.Common.Dto.SessionDto;
import CH36.Domain.Common.Dto.UserDto;

public interface UserService {

	//CRUD
	//회원가입 함수명(1)
	boolean memberJoin(UserDto userDto) throws Exception;

	//로그인
	Map<String, Object> login(UserDto userDto, Integer sessionId) throws Exception;

	Map<String, Object> logout(int sessionId) throws Exception;

	SessionDto getSession(int sessionId) throws Exception;

}
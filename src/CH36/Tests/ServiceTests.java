package CH36.Tests;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.Dto.BookDto;
import CH36.Domain.Common.Dto.UserDto;
import CH36.Domain.Common.Service.BookService;
import CH36.Domain.Common.Service.BookServiceImpl;
import CH36.Domain.Common.Service.UserService;
import CH36.Domain.Common.Service.UserServiceImpl;

class ServiceTests {

//	@Test
//	void bookServiceImpl_1() throws Exception {
//		BookServiceImpl service = BookServiceImpl.getInstance();
//		boolean isSuccess =  
//		service.bookRegistration(new BookDto(1122L,"이것이C언어다","오렌지미디어","121212"));
//		System.out.println("도서 등록여부 : " + isSuccess);	
//	}
	
	@Test
	void bookServiceImpl_2() throws Exception {
		BookService service = BookServiceImpl.getInstance();
		List<BookDto> list =  service.getBooks();
		list.forEach(el->System.out.println(el));	
	}
	
	@Test
	void userServiceImpl_login()throws Exception {
		UserService service = UserServiceImpl.getInstance();
		UserDto dto = new UserDto();
		dto.setUsername("member1");
		dto.setPassword("111");
		Map<String,Object> response = service.login(dto, null);
		for(String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}
	
	@Test
	void userServiceImpl_logout()throws Exception {
		UserService service = UserServiceImpl.getInstance();
		
		//로그인
//		UserDto dto = new UserDto();
//		dto.setUsername("aaa");
//		dto.setPassword("1234");
//		Map<String,Object> response = service.login(dto, null);
//		for(String key : response.keySet()) {
//			System.out.println(key + " : " + response.get(key));
//		}
		//로그아웃 처리
		Map<String,Object> response = service.logout(6);
		for(String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}
	
	@Test
	void bookServiceImpl_session() throws Exception {
		BookService service = BookServiceImpl.getInstance();
		Map<String,Object> response =  
		service.bookRegistration(new BookDto(1122L,"이것이C언어다","오렌지미디어","121212"),8);
		for(String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
	}
	
	
}






package CH36.Tests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import CH36.Controller.FrontController;
import CH36.Domain.Common.Dto.BookDto;
import CH36.Domain.Common.Dto.UserDto;

class ControllerTests {

	@Test
	void FcControllerTests() {
		//요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		//전달할 파라미터 준비
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		//params.put("service", "add");
		//요청사항 전달
		fc.execute(params);	
	}
	@Test
	void FcControllerTests_2() {
		//요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		//전달할 파라미터 준비
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		//요청사항 전달
		fc.execute(params);	
	}
	@Test
	void FcControllerTests_3() {
		//요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		//전달할 파라미터 준비
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		params.put("bookDto", new BookDto(342124L,"","한빛미디어","1234"));
		//요청사항 전달
		Map<String,Object> rValue = fc.execute(params);	
		boolean isSuccess = (Boolean)rValue.get("success");
		String message = (String)rValue.get("message");
		System.out.println("성공여부 : " + isSuccess);
		System.out.println("message : " + message);	
	}

	@Test
	void FcControllerTests_4() {
		//요청사항 받을 FC 생성
		FrontController fc = new FrontController();
		//전달할 파라미터 준비
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/book");
		params.put("serviceNo", 1);
		params.put("bookDto", new BookDto(99599L,"자바의정석","한빛미디어","1234"));
		//요청사항 전달
		Map<String,Object> rValue = fc.execute(params);	
		//확인
		boolean isSuccess = (Boolean)rValue.get("success");
		String message = (String)rValue.get("message");
		Exception ex = (Exception)rValue.get("exception");
		System.out.println("성공여부 : " + isSuccess);
		System.out.println("message : " + message);	
		System.out.println("exception : " + ex);	
	}
	
	@Test
	void UserControllerTest_1() {
		FrontController fc = new FrontController();
		Map<String,Object> params = new LinkedHashMap();
		params.put("endPoint", "/user");	//서비스 유형 
		params.put("serviceNo", 1);	//회원가입요청 번호
		params.put("userDto", new UserDto("bbb","1234","ROLE_USER",false));

		Map<String,Object> result =  fc.execute(params);
		System.out.println("isSuccess : " + result.get("success"));
		System.out.println("message : " + result.get("message"));
		System.out.println("exception : " + result.get("exception"));
		
	}
	
	@Test
	void UserControllerTest_login() {
		FrontController fc = new FrontController();
		Map<String,Object> params = new LinkedHashMap();
		params.put("endPoint", "/user");	//서비스 유형 
		params.put("serviceNo", 6);	//회원가입요청 번호
		params.put("userDto", new UserDto("ddd","111","-",false));

		Map<String,Object> result =  fc.execute(params);
		for(String key : result.keySet()) {
			System.out.println(key + " : " + result.get(key));
		}
		
	}
	
	@Test
	void BookControllerTest_add() {
		FrontController fc = new FrontController();
		Map<String,Object> params = new LinkedHashMap();
		params.put("endPoint", "/book");	//서비스 유형 
		params.put("serviceNo", 1);			//회원가입요청 번호
		params.put("bookDto", new BookDto(9999,"도서명도서명","출판사출판사","111-222"));
		params.put("sessionId",8);
		Map<String,Object> result =  fc.execute(params);
		for(String key : result.keySet()) {
			System.out.println(key + " : " + result.get(key));
		}
	}
	
	
}





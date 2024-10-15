package CH36.Controller;

import java.util.HashMap;
import java.util.Map;

import CH36.Domain.Common.Dto.BookDto;
import CH36.Domain.Common.Service.BookService;
import CH36.Domain.Common.Service.BookServiceImpl;

public class BookController implements SubController {

// 	API DOCUMENT
//	Endpoint 	serviceNo		parameter		return
//	/book 		add(1)			BookDto			boolean
//	/book 		update(2)		BookDto			boolean
//	/book 		delete( 3)		BookDto			boolean
//	/book 		select(4)		bookCode		BookDto		
//	/book 		selectAll(5)	x->(변경예정)		List<BookDto>
	
	//예외처리함수
	public Map<String,Object> ExceptionHandler(Exception e){
		Map<String,Object> exMap = new HashMap();
		exMap.put("success", false);
		exMap.put("message", e.getMessage());
		exMap.put("exception", e);
		return exMap;
	}
	
	private BookService bookServiceImpl;
	public BookController(){
		try {
			bookServiceImpl = BookServiceImpl.getInstance();
		} catch (Exception e) {
			
			ExceptionHandler(e);
			
		}
	}
			
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] BookController execute()...");
		//파라미터 받기 
		Integer serviceNo =(Integer)params.get("serviceNo");
		BookDto bookDto = (BookDto)params.get("bookDto");
		Integer sessionId =(Integer)params.get("sessionId");
		
		//뷰전달 변수
		Map<String, Object> returnValue = new HashMap();
			
		try {		
			switch(serviceNo) {
				case 1 :	//add
					System.out.println("[SC] BookController add...");
					//유효성 확인(Data)
					if(!isValid(bookDto,sessionId)) {
						//유효성 체크 실패시 처리
						returnValue.put("success", false);
						returnValue.put("message", "도서 등록 실패");
						return returnValue;
					}

					System.out.println("[SC] BookController dto : " + bookDto);
					//서비스 요청
					Map<String,Object> tmp =  bookServiceImpl.bookRegistration(bookDto,sessionId);
					
					//뷰로 전달
					boolean isAdded = (Boolean)tmp.get("success");
					returnValue = tmp;
		
					break;
					
					
				case 2 :	//update
					System.out.println("[SC] BookController update...");
					break;
				case 3 : 	//delete
					System.out.println("[SC] BookController delete...");
					break;	
				case 4 : 	//select
					System.out.println("[SC] BookController select...");
					break;
				case 5 : 	//selectAll
					System.out.println("[SC] BookController selectAll...");
					break;
				default : 
					break;
	
			}
		}catch(Exception e) {
			return  ExceptionHandler(e);
			
		}
	
		return returnValue;
	}
	

	private boolean isValid(BookDto bookDto, Integer sessionId) {
		// TODO Auto-generated method stub
		return true;
	}

	private boolean isValid(BookDto dto) {
		if(dto.getBookCode()==0)
			return false;
		else if ( dto.getBookName().trim()==null || dto.getBookName().trim().equals("") )
			return false;
		
		return true;
	}

}


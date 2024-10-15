package CH36.Tests;

import java.util.List;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.Dao.BookDao;
import CH36.Domain.Common.Dao.BookDaoImpl;
import CH36.Domain.Common.Dao.SessionDaoImpl;
import CH36.Domain.Common.Dao.UserDaoImpl;
import CH36.Domain.Common.Dto.BookDto;
import CH36.Domain.Common.Dto.SessionDto;
import CH36.Domain.Common.Dto.UserDto;

class DaoTests {

	
	@Test
	void BookDaoConnect() throws Exception{
		BookDao dao=BookDaoImpl.getInstance();
	}
	@Test
	void BookDaoInsert() throws Exception{
		BookDao dao=BookDaoImpl.getInstance();
		dao.insert(new BookDto(1,"이것이리눅스다","한빛미디어","111-111"));
	}
	@Test
	void BookDaoUpdate() throws Exception{
		BookDao dao=BookDaoImpl.getInstance();
		dao.update(new BookDto(1,"이것이자바다","한빛미디어","222-222"));
	}
	@Test
	void BookDaoDelete() throws Exception{
		BookDao dao=BookDaoImpl.getInstance();
		dao.delete(1);
	}
	@Test
	void BookDaoSelect() throws Exception{
		BookDao dao=BookDaoImpl.getInstance();
		List<BookDto> list = dao.select();
		list.forEach(dto->System.out.println(dto));		
	}
	@Test
	void BookDaoSelect2() throws Exception{
		BookDao dao=BookDaoImpl.getInstance();
		BookDto dto =  dao.select(30000002453014L);
		System.out.println(dto);
	}
	@Test
	void UserDaoInsert() throws Exception{
		UserDaoImpl dao = UserDaoImpl.getInstance();
		int result = dao.insert(new UserDto("ddd","111","ROLE_USER",false));
		System.out.println("계정 INSERT 성공여부 : " + result);
	}
	
	@Test
	void BookDaoTest_Pool() throws Exception {
			BookDao dao = BookDaoImpl.getInstance();
			dao.insert(new BookDto(8777L,"a","a","a"));

	}
	
	@Test
	void UserDaoTest_Pool() throws Exception {
			UserDaoImpl dao = UserDaoImpl.getInstance();
			dao.insert(new UserDto("eee","123","ROLE_USER",false));
	}
	
	@Test
	void SessionTest_Insert() throws Exception{
		SessionDto session = new SessionDto(2,"user2","ROLE_USER"); 
		SessionDaoImpl dao = SessionDaoImpl.getInstance();
		dao.insert(session);
		System.out.println(dao.select(1));
	}
	@Test
	void SessionTest_Delete() throws Exception{
		SessionDaoImpl dao = SessionDaoImpl.getInstance();
		dao.delete(2);
	}
	@Test
	void UserDaoTest_Select() throws Exception{
		UserDaoImpl dao = UserDaoImpl.getInstance();
		UserDto dto = dao.select("ddd");
		System.out.println(dto);
	}
	
	
}

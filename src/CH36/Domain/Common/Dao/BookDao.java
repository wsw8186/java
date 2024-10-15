package CH36.Domain.Common.Dao;

import java.util.List;

import CH36.Domain.Common.Dto.BookDto;

public interface BookDao {

	//CRUD 
	List<BookDto> select() throws Exception;

	BookDto select(long bookCode) throws Exception;

	int insert(BookDto dto) throws Exception;

	int update(BookDto dto) throws Exception;

	int delete(long bookCode) throws Exception;

}
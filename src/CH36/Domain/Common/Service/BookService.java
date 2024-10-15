package CH36.Domain.Common.Service;

import java.util.List;
import java.util.Map;

import CH36.Domain.Common.Dto.BookDto;

public interface BookService {

	//도서등록
	Map<String, Object> bookRegistration(BookDto dto, int sessionId) throws Exception;

	//도서내용수정
	boolean bookUpdate(BookDto dto) throws Exception;

	//도서삭제
	boolean bookRemove(long bookCode) throws Exception;

	//도서 조회(단건 - BookDto)
	BookDto getBook(long bookCode) throws Exception;

	//도서 조회(다건 - List<BookDto))
	List<BookDto> getBooks() throws Exception;

	void txTests() throws Exception;

}
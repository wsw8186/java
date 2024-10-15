package Test;

public class BookDto {
	private Long bookCode;
	private String bookName;
	private String publisher;
	private String isbn;
	//getter and setter
	//toString
	//constructor
	
	public Long getBookCode() {
		return bookCode;
	}
	public void setBookCode(Long bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public BookDto() {}
	
	public BookDto(Long bookCode, String bookName, String publisher, String isbn) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.publisher = publisher;
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "BookDto [bookCode=" + bookCode + ", bookName=" + bookName + ", publisher=" + publisher + ", isbn="
				+ isbn + "]";
	}
	
	
}

package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Test.BookDto;

public class 문제2 {
	
	//DB CONN DATA
	private static String id = "root";
	private static String pw = "1234";
	private static String url = "jdbc:mysql://localhost:3306/tmpdb";
	
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	public static void conn() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Sucess...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static List<BookDto> selectAll() throws SQLException{
			
		List<BookDto> list = new ArrayList();
		
		pstmt = conn.prepareStatement("select * from tbl_book");
		rs = pstmt.executeQuery();
		
		BookDto dto=null;
		if(rs!=null) {
			while(rs.next()) {
				dto = new BookDto();
				dto.setBookCode(rs.getLong("bookCode"));
				dto.setBookName(rs.getString("bookName"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setIsbn(rs.getString("isbn"));
				
				list.add(dto);
			}
		}
		
		pstmt.close();
		rs.close();
		
		return list;
	}
	public static BookDto select(Long bookCode)  throws SQLException{
		
		pstmt = conn.prepareStatement("select * from tbl_book where bookCode=?");
		pstmt.setLong(1, bookCode);
		rs = pstmt.executeQuery();
		
		BookDto dto=null;
		if(rs!=null) {
			
			if(rs.next()) {
				dto = new BookDto();
				dto.setBookCode(rs.getLong("bookCode"));
				dto.setBookName(rs.getString("bookName"));
				dto.setPublisher(rs.getString("publisher"));
				dto.setIsbn(rs.getString("isbn"));
			}
			
		}
		
		pstmt.close();
		rs.close();
		
		return dto;
	}
	public static int insertBook(BookDto bookDto)  throws SQLException{
		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
		pstmt.setLong(1,bookDto.getBookCode());
		pstmt.setString(2, bookDto.getBookName());
		pstmt.setString(3, bookDto.getPublisher());
		pstmt.setString(4, bookDto.getIsbn());
		
		int result =  pstmt.executeUpdate();
		
		pstmt.close();
		
		return result;	
	}
	public static int updateBook(BookDto bookDto)  throws SQLException{
		
		pstmt = conn.prepareStatement("update tbl_book set bookName=?,publisher=?,isbn=? where bookCode=?");
		pstmt.setString(1, bookDto.getBookName());
		pstmt.setString(2, bookDto.getPublisher());
		pstmt.setString(3, bookDto.getIsbn());
		pstmt.setLong(4,bookDto.getBookCode());
		
		int result =  pstmt.executeUpdate();
		
		pstmt.close();
		
		return result;
	}
	public static int deleteBook(Long bookCode)  throws SQLException{
		
		pstmt = conn.prepareStatement("delete from tbl_book where bookCode=?");
		pstmt.setLong(1,bookCode);
		
		int result =  pstmt.executeUpdate();
		
		pstmt.close();
	
		return result;
		
	}

	public static void main(String[] args) throws SQLException {
		try {
			//DBConn
			conn();		
			//Tx start
			conn.setAutoCommit(false);
			//Insert	
			insertBook(new BookDto(1L,"도서명1","출판사명1","isbn-1"));
			insertBook(new BookDto(2L,"도서명2","출판사명2","isbn-2"));
			insertBook(new BookDto(3L,"도서명3","출판사명3","isbn-3"));
			//SelectAll
			List<BookDto> allBook =  selectAll();
			System.out.println("selectAll : ");
			allBook.forEach(el->System.out.println(el));	
			//Select
			BookDto dto = select(1L);
			System.out.println("select : " + dto);
			//Update
			dto.setBookName("수정도서명-2");
			dto.setPublisher("수정출판사명-2");
			int r1 = updateBook(dto);
			if(r1>0)
				System.out.println("수정완료 : " + r1);	
			//Delete
			int r2 = deleteBook(2L);
			if(r2>0)
				System.out.println("삭제완료 : " + r2);
			//Tx End
			conn.commit();
			conn.close();
		}catch(Exception e) {
			//Tx RollbackAll
			conn.rollback();
		
		}

	}

}
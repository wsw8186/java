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
			Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL JDBC 드라이버 로드
			System.out.println("Driver Loading Sucess"); // 드라이버 로드 성공 메시지
			conn = DriverManager.getConnection(url,id,pw); // DB 연결
			System.out.println("DB CONNECTED"); // DB 연결 성공 메시지
		}catch(Exception e){
			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
		}
	}
	public static List<BookDto> selectAll() throws SQLException{
			
		List<BookDto> list = new ArrayList(); // 책 정보를 저장할 리스트 생성
		
		pstmt = conn.prepareStatement("select * from tbl_book"); // 모든 책 정보를 조회하는 SQL 쿼리
		rs = pstmt.executeQuery(); // 쿼리 실행
		
		BookDto dto=null; // BookDto 객체 초기화
		if(rs!=null) { // rs이 null이 아닌지 확인하여, null이 아닐 경우에만 처리 진행
			while(rs.next()) { // 결과 집합의 다음 행으로 이동
				dto = new BookDto(); // 새로운 BookDto 객체 생성
				dto.setBookCode(rs.getLong("bookCode")); // 책 코드 설정
				dto.setBookName(rs.getString("bookName")); // 책 이름 설정
				dto.setPublisher(rs.getString("publisher")); // 출판사 설정
				dto.setIsbn(rs.getString("isbn")); // ISBN 설정
				
				list.add(dto); // 리스트에 추가
			}
		}
		
		pstmt.close(); // PreparedStatement 닫기
		rs.close(); // ResultSet 닫기

		
		return list; // 모든 책 정보가 담긴 리스트 반환
	}
	public static BookDto select(Long bookCode)  throws SQLException{
		
		pstmt = conn.prepareStatement("select * from tbl_book where bookCode=?");  // 특정 책 정보를 조회하는 SQL 쿼리
		pstmt.setLong(1, bookCode); // 책 코드 파라미터 설정
		rs = pstmt.executeQuery(); // 쿼리 실행
		
		BookDto dto=null; // BookDto 객체 초기화
		if(rs!=null) { // rs이 null이 아닌지 확인하여, null이 아닐 경우에만 처리 진행
			
			if(rs.next()) {// 결과 집합의 다음 행으로 이동
				dto = new BookDto(); // 새로운 BookDto 객체 생성
				dto.setBookCode(rs.getLong("bookCode")); // 책 코드 설정
				dto.setBookName(rs.getString("bookName")); // 책 이름 설정
				dto.setPublisher(rs.getString("publisher")); // 출판사 설정
				dto.setIsbn(rs.getString("isbn")); // ISBN 설정
			}
			
		}
		
		pstmt.close(); // PreparedStatement 닫기
		rs.close(); // ResultSet 닫기
		
		return dto; // 조회된 책 정보가 담긴 dto 반환
	}
	public static int insertBook(BookDto bookDto)  throws SQLException{
		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)"); // 책 정보를 추가하는 SQL 쿼리
		pstmt.setLong(1,bookDto.getBookCode()); // 책 코드 설정
		pstmt.setString(2, bookDto.getBookName()); // 책 이름 설정
		pstmt.setString(3, bookDto.getPublisher()); // 출판사 설정
		pstmt.setString(4, bookDto.getIsbn()); // ISBN 설정
		
		int result =  pstmt.executeUpdate(); // 쿼리 실행 및 결과 반환
		
		pstmt.close(); // PreparedStatement 닫기
		
		return result;	 // 결과로 나온 수 반환
	}
	public static int updateBook(BookDto bookDto)  throws SQLException{
		
		pstmt = conn.prepareStatement("update tbl_book set bookName=?,publisher=?,isbn=? where bookCode=?"); 
		// 책 정보를 수정하는 SQL 쿼리
		pstmt.setString(1, bookDto.getBookName()); // 책 이름 설정
		pstmt.setString(2, bookDto.getPublisher()); // 출판사 설정
		pstmt.setString(3, bookDto.getIsbn()); // ISBN 설정
		pstmt.setLong(4,bookDto.getBookCode()); // 책 코드 설정
		 
		int result =  pstmt.executeUpdate(); // 쿼리 실행 및 결과 반환
		
		pstmt.close(); // PreparedStatement 닫기
		
		return result; // 결과로 나온 수 반환
	}
	public static int deleteBook(Long bookCode)  throws SQLException{
		
		pstmt = conn.prepareStatement("delete from tbl_book where bookCode=?"); // 책 정보를 삭제하는 SQL 쿼리
		pstmt.setLong(1,bookCode); // 책 코드 파라미터 설정
		
		int result =  pstmt.executeUpdate(); // 쿼리 실행 및 결과 반환
		
		pstmt.close(); // PreparedStatement 닫기ㄴ
	
		return result; // 결과로 나온 수 반환
		
	}

	public static void main(String[] args) throws SQLException {
		try {
			//DBConn
			conn();		
			//Tx start
			conn.setAutoCommit(false); // 트랜잭션 시작
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
			conn.commit(); // 트랜잭션 커밋
			conn.close(); // DB 연결 종료
		}catch(Exception e) {
			//Tx RollbackAll
			conn.rollback(); // 오류 발생 시 트랜잭션 롤백
			conn.close(); // DB 연결 종료
		
		}

	}

}
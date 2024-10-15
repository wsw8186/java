package Ch23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C08Tx {
	
	public static void main(String[] args) {
		
		//DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/bookdb";
		
		//JDBC참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
			
			//
			conn.setAutoCommit(false); // autoCommit 비활성화
			pstmt =  conn.prepareStatement("insert into tbl_user values('a','1','R',false)");
			pstmt.executeUpdate();
			pstmt =  conn.prepareStatement("insert into tbl_user values('b','1','R',false)");
			pstmt.executeUpdate();
			pstmt =  conn.prepareStatement("insert into tbl_user values('a','1','R',false)");
			pstmt.executeUpdate();
			pstmt =  conn.prepareStatement("insert into tbl_user values('d','1','R',false)");
			pstmt.executeUpdate();
			conn.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			
			try {
				conn.close();
				conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}






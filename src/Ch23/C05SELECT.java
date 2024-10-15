package Ch23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C05SELECT {

	public static void main(String[] args) {
		
		
		//DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/testdb";
		//JDBC참조변수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		//
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Sucess...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
			
			//
			pstmt = conn.prepareStatement("SELECT * FROM tbl_std");
			
			//
			rs = pstmt.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					System.out.println(rs.getString(1)+ " ");
					System.out.println(rs.getInt(2)+ " ");
					System.out.println(rs.getString(3)+ " ");
					System.out.println();
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
			try {rs.close();}catch(SQLException e){e.printStackTrace();}
			try {pstmt.close();}catch(SQLException e){e.printStackTrace();}
			try {conn.close();}catch(SQLException e){e.printStackTrace();}
		}
	}

}

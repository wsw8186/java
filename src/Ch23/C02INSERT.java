package Ch23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C02INSERT {

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
			pstmt = conn.prepareStatement("insert into tbl_std values(?,?,?)");
			pstmt.setString(1, "홍길동");
			pstmt.setInt(2, 55);
			pstmt.setString(3, "대구");
			
			int result = pstmt.executeUpdate();//DML(INSERT , UPDATE, DELETE)
			if(result>0) {
				System.out.println("INSERT 성공!");
			}else {
				System.out.println("INSERT 실패!");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

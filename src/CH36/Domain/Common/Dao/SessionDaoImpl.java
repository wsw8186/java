package CH36.Domain.Common.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CH36.Domain.Common.Dao.ConnectionPool.ConnectionItem;
import CH36.Domain.Common.Dao.ConnectionPool.ConnectionPool;
import CH36.Domain.Common.Dto.SessionDto;

public class SessionDaoImpl {
	
	//ConnectionPool
	private ConnectionPool connectionPool;
	
	//
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//싱글톤 패턴 코드 삽입
	private SessionDaoImpl() throws SQLException { 
		this.connectionPool = ConnectionPool.getInstance();
	}
	private static SessionDaoImpl instance;
	public static SessionDaoImpl getInstance() throws SQLException {
		if(instance==null)
			instance = new SessionDaoImpl();
		return instance;
	}
	//CRUD Function - table(tbl_session)생성
	public int insert(SessionDto dto) throws Exception {
		//Connection Pool code
		ConnectionItem connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();
		
		pstmt = conn.prepareStatement("insert into tbl_session values(?,?,?)");
		pstmt.setInt(1,dto.getSessionId());
		pstmt.setString(2, dto.getUsername());
		pstmt.setString(3, dto.getRole());

		int result =  pstmt.executeUpdate();
		
		//자원제거
		pstmt.close();
		//Connection Pool code
		connectionPool.releaseConnection(connItem);
		
		return result;
	}
	public SessionDto select(int sessionId) throws Exception {
		//Connection Pool code
		ConnectionItem connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();
		
		pstmt = conn.prepareStatement("select * from tbl_session where sessionId=?");
		pstmt.setInt(1, sessionId);
		
		rs = pstmt.executeQuery();
		SessionDto dto=null;
		if(rs!=null) {
			if(rs.next()) {
				dto = new SessionDto();
				dto.setSessionId(sessionId);
				dto.setUsername(rs.getString("username"));
				dto.setRole(rs.getString("role"));
			}
			
		}
		
		//Connection Pool code
		connectionPool.releaseConnection(connItem);
		
		rs.close();
		pstmt.close();
		
		return dto;
		
	}
	public SessionDto select(String username) throws Exception {
		//Connection Pool code
		ConnectionItem connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();
		
		pstmt = conn.prepareStatement("select * from tbl_session where username=?");
		pstmt.setString(1, username);
		
		rs = pstmt.executeQuery();
		SessionDto dto=null;
		if(rs!=null) {
			if(rs.next()) {
				dto = new SessionDto();
				dto.setSessionId(rs.getInt("sessionId"));
				dto.setUsername(rs.getString("username"));
				dto.setRole(rs.getString("role"));
			}
			
		}
		
		//Connection Pool code
		connectionPool.releaseConnection(connItem);
		
		rs.close();
		pstmt.close();
		
		return dto;
		
	}
	public int delete(int sessionId) throws Exception {
		//Connection Pool code
		ConnectionItem connItem = connectionPool.getConnection();
		Connection conn = connItem.getConn();
		
		pstmt = conn.prepareStatement("delete from tbl_session where sessionId=?");
		pstmt.setInt(1, sessionId);
		
		int result = pstmt.executeUpdate();
		
		pstmt.close();
		
		//Connection Pool code
		connectionPool.releaseConnection(connItem);
		
		return result;
	}
	
	
	
	
}

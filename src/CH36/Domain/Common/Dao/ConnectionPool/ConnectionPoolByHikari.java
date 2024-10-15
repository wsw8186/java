package CH36.Domain.Common.Dao.ConnectionPool;


import java.sql.Connection;
import java.sql.SQLException;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.mysql.cj.jdbc.MysqlXADataSource;
import com.zaxxer.hikari.HikariDataSource;



public class ConnectionPoolByHikari {

	private final int size=10;
	private String url="jdbc:mysql://localhost:3306/bookDB";
	private String id="root";
	private String pw="1234";
	
	private HikariDataSource  dataSource;
	//TX
    private AtomikosDataSourceBean xaDataSource;

	//싱글톤 패턴
	private ConnectionPoolByHikari() {
//		HikariConfig config = new HikariConfig();
//		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		config.setJdbcUrl(url);
//		config.setUsername(id);
//		config.setPassword(pw);
//		//Size
//		config.setMaximumPoolSize(size);
//		
//		this.dataSource = new HikariDataSource(config);
		//TX
		initXaDataSource();
	};
	
	private static ConnectionPoolByHikari instance;
	public static ConnectionPoolByHikari getInstance() {
		if(instance==null)
			instance = new ConnectionPoolByHikari();
		return instance;
	}
	
//	public Connection getConnection() throws SQLException {
//		return dataSource.getConnection();
//	}
	
	
	 //TX XADataSource 초기화
    private void initXaDataSource() {
        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
        mysqlXaDataSource.setUrl(url);
        mysqlXaDataSource.setUser(id);
        mysqlXaDataSource.setPassword(pw);

        xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(mysqlXaDataSource);
        xaDataSource.setUniqueResourceName("XA_MySQL");
        xaDataSource.setMaxPoolSize(size);
    }
	
    // Atomikos XA DataSource를 통해 커넥션을 반환
    public Connection getConnection() throws SQLException {
        return xaDataSource.getConnection();
    }
	
}

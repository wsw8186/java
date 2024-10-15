package CH36.Domain.Common.Service.Tx;

import java.sql.Connection;
import java.sql.SQLException;

import javax.transaction.UserTransaction;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.jdbc.AtomikosDataSourceBean;

import CH36.Domain.Common.Dao.ConnectionPool.ConnectionPoolByHikari;
 

//<dependency>
//<groupId>com.atomikos</groupId>
//<artifactId>transactions-jta</artifactId>
//<version>5.0.8</version> <!-- 적절한 버전으로 변경 가능 -->
//</dependency>
//<dependency>
//<groupId>com.atomikos</groupId>
//<artifactId>transactions-jdbc</artifactId>
//<version>5.0.8</version> <!-- 적절한 버전으로 변경 가능 -->
//</dependency>


public class TransactionManager {

    private ConnectionPoolByHikari pool;
    private UserTransaction userTransaction;

    // 싱글톤 패턴으로 트랜잭션 매니저 관리
    private static TransactionManager instance;

    private TransactionManager() {
        pool = ConnectionPoolByHikari.getInstance(); // HikariCP 커넥션 풀 사용
        userTransaction = new UserTransactionImp(); // Atomikos 트랜잭션 매니저 사용
        
    }

    public static TransactionManager getInstance() {
        if (instance == null) {
            instance = new TransactionManager();
        }
        return instance;
    }

    // 트랜잭션 시작
    public void begin() throws Exception {
        userTransaction.begin();
        
        System.out.println("Transaction started");
    }

    // 트랜잭션 커밋
    public void txCommit() throws Exception {
        userTransaction.commit();
        System.out.println("Transaction committed");
    }

    // 트랜잭션 롤백
    public void txRollback() throws Exception {
        userTransaction.rollback();
        System.out.println("Transaction rolled back");
    }

    // 커넥션 반환
    public Connection getConnection() throws SQLException  {
        return pool.getConnection();
    }
    
    //TX
    // Atomikos XA DataSource 설정
    private AtomikosDataSourceBean xaDataSource;
}

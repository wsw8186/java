package CH36.Tests;

import org.junit.jupiter.api.Test;

import CH36.Domain.Common.Service.BookService;
import CH36.Domain.Common.Service.BookServiceImpl;

class TxTests {

	@Test
	void Tx_1() throws Exception {
		
		BookService service = BookServiceImpl.getInstance();
		service.txTests();
	
	}


}

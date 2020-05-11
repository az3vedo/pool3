package pool3.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

import org.junit.jupiter.api.Test;
import pool3.Cash;
class Cash_test {

	@Test
	void test() {
		Cash bill = new Cash(null, "conta de luz", "outgoing", 300.0);
		assertEquals(-300.0, bill.getAmount());
	}

}

package pool3.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pool3.Report;

class Report_test {

	@Test
	void test() {
		Report report = new Report("2020-04-02","2020-02-02");
		String period = report.getPeriod();
		
// Testing getPeriod() and class Constructor
		assertEquals(period,"2020-04-02 - 2020-02-02");
	}

}

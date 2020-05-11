package pool3;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
	public Report gerarRelatorio(String start, String end, ArrayList<Cash> list) {
		Report newReport = new Report(start,end);
		for (Cash item : list) {
			newReport.addBalance(item.getAmount());
		}
		return newReport;
	}
	
	public static void main(String[] args) {
		
	}
	
	private static Date dateParser(String date_string) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {
		date = (Date) formatter.parse(date_string);
		}catch (Exception e){
			e.printStackTrace();
		}
		return date;
	}
	
	
}

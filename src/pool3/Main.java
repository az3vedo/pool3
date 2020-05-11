package pool3;

import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Login> login = new ArrayList<Login>();  
		addUser(scan, login);
		System.out.println(login.get(0).getUser());
	}
	public static void addUser(Scanner scan, ArrayList<Login> login) {
		System.out.print("\n User: ");
		String user = scan.nextLine();
		System.out.print("\n Password: ");
		String password = scan.nextLine();	
		Login l = new Login(user, password);
		login.add(l);
		}
	public void checkLogin() {
	}
	public Report gerarRelatorio(String start, String end, ArrayList<Cash> list) {
		Report newReport = new Report(start,end);
		for (Cash item : list) {
			newReport.addBalance(item.getAmount());
		}
		return newReport;
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

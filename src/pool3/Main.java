package pool3;

<<<<<<< HEAD
import pool3.Cash;
import java.util.*;
=======
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
>>>>>>> branch 'master' of https://github.com/az3vedo/pool3

public class Main {
<<<<<<< HEAD
	
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
		
=======
	public Report gerarRelatorio(String start, String end, ArrayList<Cash> list) {
		Report newReport = new Report(start,end);
		for (Cash item : list) {
			newReport.addBalance(item.getAmount());
		}
		return newReport;
>>>>>>> branch 'master' of https://github.com/az3vedo/pool3
	}
<<<<<<< HEAD

}
=======
	
	public static void main(String[] args) {
		Cash cash = new Cash(dateParser("08-05-2020"), "conta de luz", "outgoing", 300.0);
		ArrayList<Cash> money = new ArrayList<Cash>();
		money.add(cash);
		
		System.out.println(cash.getDate());
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
>>>>>>> branch 'master' of https://github.com/az3vedo/pool3

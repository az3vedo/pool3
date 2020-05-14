package pool3;

import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
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
	public static Report createReport(String start, String end, ArrayList<Cash> list) {
		Report newReport = null;
				try {
					newReport = new Report(start,end);
					for (Cash item : list) {
					  Double amount = item.getAmount();
						newReport.addBalance(amount);
					}
				} catch (NullPointerException e) {e.printStackTrace();}
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
	
	public static boolean checkLogin(ArrayList<Login> login) {
    Login p = new  Login("Ale123", "123");
    for(Login l : login) {
        if(l.equals(p)) {
            return true;
        } else continue;

    }
    return false;
}
	
}

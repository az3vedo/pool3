package pool3;

import java.util.*;

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
		
}
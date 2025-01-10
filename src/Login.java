import java.util.Scanner;

public class Login {
	public static void login() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Username :");
		String user = sc.next();
		System.out.println("Enter Password :");
		String password = sc.next();
		
		if(user.equals("Shreyash")) {
			if(password.equals("SHRE2004")) {
				System.out.println("Login Successfull!");
			return;}
		}
		System.out.println("Login Failed!");
		System.exit(0);
		
		
	}

}

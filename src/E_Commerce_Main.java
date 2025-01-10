import java.io.IOException;
import java.util.Scanner;

import main.product.ProductManagement;
import user.main.UserManagement;

public class E_Commerce_Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("#####<<<<<Welcome to E-Commerce Webpage>>>>>#####");
		Login.login();
		
		while(true) {
			System.out.println("What would u like to do today!?");
			System.out.println("1. Product Management");
			System.out.println("2.User Management");
			System.out.println("3.Quitiing The Interface!");
			
			int option =  sc.nextInt();
			if(option == 1) {
				ProductManagement.productManagement();
			}else if(option == 2) {
				UserManagement.userManagement();
			}else if(option == 3) {
				System.out.println("Quitting the interface!");
				break;
			}else {
				System.out.println("Invalid option Selected");
			}
		}sc.close();
	}
}

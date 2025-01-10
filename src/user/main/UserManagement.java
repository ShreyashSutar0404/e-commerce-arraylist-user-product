package user.main;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManagement {
	public static void userManagement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<<<<<<<<<<<<<<Welcome to User Management >>>>>>>>>>>>>>");
		ArrayList<User> userList = new ArrayList<>();
		
		while(true) {
			System.out.println("1. Add User");
            System.out.println("2. Update User");
            System.out.println("3. Search User");
            System.out.println("4. Remove User");
            System.out.println("5. Print Saved User List");
            System.out.println("9. Quit User Management");
            
            int option = sc.nextInt();
            
            if(option == 1) {
            	User user = new User();
            	System.out.println("Enter user name :");
            	user.UserName = sc.next();
            	System.out.println("Enter E-mail Id :");
            	user.email = sc.next();
            	System.out.println("Enter Password :");
            	user.Password = sc.next();
            	userList.add(user);
            }else if(option == 2) {
            	System.out.println("To be implemannted!");
            }else if(option == 3) {
            	System.out.println("Enter user Name to search for :");
            	String searchName = sc.next();
            	boolean found = false;
            	
            	for(User user : userList) {
            		if(user.UserName.equals(searchName)) {
            			System.out.println("User Found!");
            			System.out.println("Username :"+user.UserName);
            			System.out.println("E-mail :"+user.email);
            			System.out.println("password :"+user.Password);
            			found = true;
            			break;
            		}
            	}if(!found) {
            		System.out.println("Uer not found!");
            	}
            }else if(option == 4) {
            	System.out.println("Enter Uer to delete:");
            	String deleteName = sc.next();
            	boolean found = false;
            	
            	for(int i=0 ;i<userList.size();i++) {
            		User user = userList.get(i);
            		if(user.UserName.equals(deleteName)) {
            			userList.remove(i);
            			found = true;
            			System.out.println("The Provided username" +deleteName+ " Has been removed Successfully!");
            			break;
            		}
            		
            	}if(!found) {
            		System.out.println("The user u are looking for doesnot exist!");
            	}
            	
            }else if(option == 5) {
            	for(User data : userList) {
            		System.out.println("Username :"+data.UserName);
            		System.out.println("E-Mail ID :"+data.email);
            		System.out.println("Passsword :"+data.Password);
            	}
            }else if(option == 6) {
            	System.out.println("To be implemented!");
            }else if(option == 9) {
            	System.out.println("Quitting the interface!");
            	break;
            }else {
            	System.out.println("Invalid option selected!");
            }
			
		}
		
 		
	}

}

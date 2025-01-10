package main.product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
	public static void productManagement() {
	Scanner sc = new Scanner(System.in);
	System.out.println("<<<<<<<<<<<<<<<<<<<Welcome to Product Management >>>>>>>>>>");
	ArrayList <Product> productList = new ArrayList<>();
	
	while(true) {
		System.out.println("1.Add Product");
		System.out.println("2.Update Product");
		System.out.println("3.Search Product");
		System.out.println("4.Delete Product");
		System.out.println("5.Display Products");
		System.out.println("9.Quitting the Interface");
		
		int option = sc.nextInt();
		
		if(option == 1) {
			Product product = new Product();
			System.out.println("Enter Product Name :");
			product.productName = sc.next();
			System.out.println("Enter Quantity of the product :");
			product.Quantity = sc.next();
			System.out.println("Enter Price of the product :");
			product.price = sc.next();
			productList.add(product);
		}else if(option == 2) {
			System.out.println("To be implemented");
		}else if(option == 3) {
			System.out.println("Enter Product name to search :");
			String searchName = sc.next();
			boolean found = false;
			
			for (Product product : productList) {
				if(product.productName.equals(searchName)) {
					System.out.println("Product Found!");
					System.out.println("The product Name is :"+product.productName);
					System.out.println("The Quantity is :"+product.Quantity);
					System.out.println("The Product Price is :"+product.price);
					found = true;
					break;
				}
			}if(!found) {
				System.out.println("Product Not Found!");
			}
		}else if(option == 4) {
			System.out.println("Enter Product Name to delete :");
			String deleteName = sc.next();
			boolean found = true;
			
			for(Product product :productList) {
			if(product.productName.equals(deleteName)) {
				productList.remove(product);
				found = true;
				System.out.println("Product"+deleteName+"Has been Removed!");
				break;
			}
			}if(!found) {
				System.out.println("Product To delete is not found!");
			}
		}else if(option == 5) {
			for(Product data : productList) {
				System.out.println("Product Name :"+ data.productName);
				System.out.println("Product Quantity" +data.Quantity);
				System.out.println("Product Price Each :"+data.price);
			}
    		}else if (option == 6){
    			
    		}else if(option == 9) {
    		
				System.out.println("Quitting the interface!");
				break;
				
				}else {System.out.println("Invalid option selected!");}
	}
	
	
	
	}
	
}

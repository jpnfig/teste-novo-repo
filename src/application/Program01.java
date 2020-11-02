package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product01;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		Product product = new Product();
//		System.out.println(product.name);
//		System.out.println(product.price);
//		System.out.println(product.quantity);
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
//		product.name = sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Price: ");
//		product.price = sc.nextDouble();
		double price = sc.nextDouble();
//		System.out.print("Quantity in stock: ");
//		product.quantity = sc.nextInt();
//		int quantity = sc.nextInt();
//		Product product = new Product(name, price, quantity);
		Product01 product = new Product01(name, price);
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200);
		System.out.println("Updated price: " + product.getPrice());
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Update data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Update data: " + product);
		sc.close();
	}
}

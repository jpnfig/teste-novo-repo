package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product03;
import entities.UsedProduct;

public class Program28 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product03> list = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product03 prod = new ImportedProduct(name, price, customsFee);
				list.add(prod);
			}else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product03 prod = new UsedProduct(name, price, manufactureDate);
				list.add(prod);
			}else {
				Product03 prod = new Product03(name, price);
				list.add(prod);
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:" );
		for(Product03 prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}
}

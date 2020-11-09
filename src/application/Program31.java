package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program31 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				TaxPayer taxpayer = new Individual(name, anualIncome, healthExpenditures);
				list.add(taxpayer);
			}else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				TaxPayer taxpayer = new Company(name, anualIncome, numberOfEmployees);
				list.add(taxpayer);
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for(TaxPayer taxpayer : list) {
			System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.tax()));
			sum += taxpayer.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f" , sum);
		sc.close();
	}
}

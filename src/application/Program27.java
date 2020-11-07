package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee03;
import entities.OutsourcedEmployee;

public class Program27 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee03> list = new ArrayList<>();
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (resp == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
//				Employee03 emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
//				Employee03 emp = new Employee03(name, hours, valuePerHour);
				list.add(new Employee03(name, hours, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee03 emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}
}
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		student.Name = sc.nextLine();
		student.N1 = sc.nextDouble();
		student.N2 = sc.nextDouble();
		student.N3 = sc.nextDouble();
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", student.FinalGrade() );
		System.out.println(student.Result());
		if (student.FinalGrade()<60.0) {
			System.out.printf("MISSING %.2f POINTS", student.Missing());
		}
		sc.close();
	}
}

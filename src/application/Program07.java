package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double cotacao = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double valor = sc.nextDouble();
		System.out.printf("Amount to be paid in reais =  %.2f%n", CurrencyConverter.valorPago(cotacao, valor));
		sc.close();
	}
}

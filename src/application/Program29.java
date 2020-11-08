package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account02;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program29 {

	public static void main(String[] args) {
		
//		Exemplo usando a class principal (Account02) como Abstrata (abstract):
//		
//		Account02 acc1 = new Account02(1001, "Alex", 1000.0);
//		Account02 acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//		Account02 acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		
		Locale.setDefault(Locale.US);
		List<Account02> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		
		for(Account02 acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for(Account02 acc : list) {
			acc.deposit(10.0);
		}
		for(Account02 acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}

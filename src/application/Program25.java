package application;

import entities.Account02;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program25 {

	public static void main(String[] args) {
		
		Account02 acc1 = new Account02(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		Account02 acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		Account02 acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}
}

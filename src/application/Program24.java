package application;

import entities.Account02;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program24 {

	public static void main(String[] args) {
		
		Account02 acc= new Account02(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		//UPCASTING:
		Account02 acc1 = bacc;
		Account02 acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account02 acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		//DOWNCASTING:
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		//Erro em tempo de execução:
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}

package entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double valor) {
		balance += valor;
	}
	public void withdraw(double valor) {
		balance -= valor + 5.0;
	}
	public String toString() {
		return "Account " 
				+ accountNumber
				+ ", Holder: " 
				+ accountHolder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}

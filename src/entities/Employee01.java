package entities;

public class Employee01 {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	public void IncreaseSalary(double percentage) {
		grossSalary = grossSalary + ((percentage / 100.0) * grossSalary);
	}
}

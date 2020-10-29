package entities;

public class Student {
	public String Name;
	public double N1;
	public double N2;
	public double N3;
	
	public double FinalGrade() {
		return N1 + N2 + N3;
	}
	public String Result() {
		double result = N1 + N2 + N3;
		if (result >= 60.0) {
			return "PASS";
		}else {
			return "FAILED";
		}
	}
	public double Missing() {
		return 60.0 - FinalGrade();
	}
}

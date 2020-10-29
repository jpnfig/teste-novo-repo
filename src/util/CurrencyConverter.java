package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double valorPago(double cotacao, double valor) {
		return cotacao * valor * (1.0 + IOF);
	}
}

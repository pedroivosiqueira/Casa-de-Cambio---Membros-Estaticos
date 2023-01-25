package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cambio;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do Dólar? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		double quantity = sc.nextDouble();
		
		double result = Cambio.enchange(dollarPrice, quantity);
		
		System.out.printf("Valor a ser pago em Reais = %.2f", result);
		
		sc.close();

	}

}

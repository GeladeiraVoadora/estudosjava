package estudos.exercicios;

import java.util.Locale;

public class Atv01 {

	public static void main(String[] args) {
		
		//Variáveis
		String product01 = "Computer";
		String product02 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price01 = 2100.0;
		double price02 = 650.50;
		double measure = 53.234567;
		
		//O que será escrito na tela
		System.out.println("Products:");
		System.out.printf("%s, which price is %.2f %n%s, which price is %.2f%n%n",product01, price01, product02, price02);
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		//Set locale from where you want
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

	}

}

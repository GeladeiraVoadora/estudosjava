package estudos_Udemy;

import java.util.Locale;

public class VariaveisPrint {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int idade = 32;
		double x = 1.7234587;
		String nome = "Luís";
		
		System.out.println("Olá Mundo");
		System.out.println("Bom dia!");
		System.out.println("y = " + idade);
		System.out.println("x = " + x);
		System.out.printf("Resuldado é %.2f metros%n", x);
		System.out.printf("%s tem %d anos de idade, e tem %.2f" + "m de altura.%n", nome, idade, x);

	}

}

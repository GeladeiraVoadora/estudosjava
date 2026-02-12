package estudos_Udemy.testes;

import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        String palavra = "Olá";
        String palavra2 = "Mundo";

        System.out.println(y);
        System.out.println(palavra + palavra2);
        System.out.println(palavra+" "+palavra2);
        System.out.println(x);
        //string formatada
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f\n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f\n", x);
        System.out.printf("%s, tudo bem? Durante %d anos dei a volta ao %S, e gastei %f milhões de dolares.%n", palavra, y, palavra2, x);
    }
}

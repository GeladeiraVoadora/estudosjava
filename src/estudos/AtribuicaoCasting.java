package estudos;

public class AtribuicaoCasting {
	public static void main(String[] args){
		int a, b;
		double resultado;
		double x;
		
		a = 2;
		b = 3;
		resultado = b/a;
		System.out.println(resultado);
		// agora usando o casting (conversão)
		resultado = (double) b/a;
		System.out.println(resultado);
		
		x = 3.88;
		a = (int) x;
		System.out.println();
		System.out.println(x);
		System.out.println(a);
	}

}

package cursoDeFeriasUPE.br.upe.reforco;

import java.util.Random;

public class Maquina {

	Random rand;

	// INGREDIENTES
	private double cafe;
	private double leite;
	private double chocolate;
	private double agua;

	// CREDITOS
	private double credito;

	// STATUS
	private boolean statusMoedor;
	private boolean statusBombaAgua;
	private boolean statusAquecedor;
	private boolean statusDosador;
	private boolean statusDispensadorCopo;

	private Receita espresso;
	private Receita longo;
	private Receita pingado;
	
	public Maquina() {
		this.rand = new Random();
		
		this.statusMoedor = this.rand.nextInt(10) > 0;
		this.statusBombaAgua = this.rand.nextInt(10) > 0;
		this.statusAquecedor = this.rand.nextInt(10) > 0;
		this.statusDosador = this.rand.nextInt(10) > 0;
		this.statusDispensadorCopo = this.rand.nextInt(10) > 0;
		
		this.espresso = new Receita("Café Espresso", 40, 40, 0, 0, 0.5);
		this.longo = new Receita("Café longo", 80, 40, 0, 0, 0.5);
		this.pingado = new Receita("Café Pingado", 40, 40, 20, 0, 1);
	}

	public boolean estaOK() {
		boolean status = (this.statusAquecedor && this.statusBombaAgua && this.statusDispensadorCopo
				&& this.statusDosador && this.statusMoedor);
		return status;
	}

	public void depositaCredito(double valor) {
		double novoCredito = this.credito + valor;
		this.credito = novoCredito;
	}

	public void prepararBebida(int opcaoBebida) {
		//ENCONTRAR A RECEITA DA BEBIDA
		Receita receita = null;
		if(opcaoBebida == 1) {
			receita = this.espresso;
		} else if (opcaoBebida == 2){
			receita = this.longo;
		} else if (opcaoBebida == 3){
			receita = this.pingado;
		}
		//PREPARAR A BEBIDA
		
		//DEBITAR O CREDITO
		this.credito -= receita.getPreco();
		
		//INFORMAR QUE A PREPARAÇÃO TERMINOU
		System.out.printf("Preparação do %s terminada.%n", receita.getNome());
		
	}

}

package cursoDeFeriasUPE.br.upe.reforco;

public class Receita {

	//ATRIBUTOS
	private String nome;
	private double qtdCafe;
	private double qtdLeite;
	private double qtdAgua;
	private double qtdChocolate;

	private double preco;
	
	// CONSTRUTOR
	public Receita (String nome, double qtdAgua, double qtdCafe, double qtdChocolate, double qtdLeite, double preco) {
		this.setNome(nome);
		this.qtdAgua = qtdAgua;
		this.qtdCafe = qtdCafe;
		this.qtdChocolate = qtdChocolate;
		this.qtdLeite = qtdLeite;
		this.preco = preco;
	}

	// GETS E SETS
	public double getQtdCafe() {
		return qtdCafe;
	}

	public void setQtdCafe(double qtdCafe) {
		this.qtdCafe = qtdCafe;
	}

	public double getQtdLeite() {
		return qtdLeite;
	}

	public void setQtdLeite(double qtdLeite) {
		this.qtdLeite = qtdLeite;
	}

	public double getQtdAgua() {
		return qtdAgua;
	}

	public void setQtdAgua(double qtdAgua) {
		this.qtdAgua = qtdAgua;
	}

	public double getQtdChocolate() {
		return qtdChocolate;
	}

	public void setQtdChocolate(double qtdChocolate) {
		this.qtdChocolate = qtdChocolate;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

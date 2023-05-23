package cursoDeFeriasUPE.br.upe.reforco;

public class PedidoCafe {

	// ROTINA PARA LIGAR A MAQUINA
	// validar agua
	// validar moedor
	// validar dosador
	// validar aquecedor

	// ROTINA PARA RECEBER DINHEIRO

	// ROTINA PARA PEDIR BEBIDA

	public static void main(String[] args) {

		Maquina maquina = new Maquina();

		if (maquina.estaOK()) {
			System.out.println("Máquina ligada e funcionando.");

			maquina.depositaCredito(1.0);

			maquina.prepararBebida(1);

		} else {
			System.out.println("Máquina fora de serviço.");
		}
		;

		// checar a maquina

		// receber dinheiro

		// preparar bebida
	};
}

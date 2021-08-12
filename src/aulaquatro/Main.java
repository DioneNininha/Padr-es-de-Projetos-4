package aulaquatro;

/**
 * 
 * @author Dione
 *
 */
public class Main {

	public static void main(String[] args) {

		FabricaNike fabricaNike = new FabricaNike();
		CamisasEsportivas camisa1 = fabricaNike.criarCamisa();

		camisa1.exibirFabrProduto();

		FabricaAdidas fabricaAdidas = new FabricaAdidas();
		CamisasEsportivas camisa2 = fabricaAdidas.criarCamisa();

		camisa2.exibirFabrProduto();

		FabricaPuma fabricaPuma = new FabricaPuma();
		CamisasEsportivas camisa3 = fabricaPuma.criarCamisa();

		camisa3.exibirFabrProduto();

		FabricaUmbro fabricaUmbro = new FabricaUmbro();
		CamisasEsportivas camisa4 = fabricaUmbro.criarCamisa();

		camisa4.exibirFabrProduto();

		FabricaKappa fabricaKappa = new FabricaKappa();
		CamisasEsportivas camisa5 = fabricaKappa.criarCamisa();

		camisa5.exibirFabrProduto();

	}
}

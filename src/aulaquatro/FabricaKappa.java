package aulaquatro;

/**
 * 
 * @author Dione
 *
 */

public class FabricaKappa implements FabrProdEsportivos {

	@Override
	public CamisasEsportivas criarCamisa() {

		return new CamBrasil();
	}
}
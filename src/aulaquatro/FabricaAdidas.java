package aulaquatro;

/**
 * 
 * @author Dione
 *
 */

public class FabricaAdidas implements FabrProdEsportivos {

	@Override
	public CamisasEsportivas criarCamisa() {

		return new CamVasco();
	}
}
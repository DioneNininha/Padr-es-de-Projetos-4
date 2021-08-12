package aulaquatro;

/**
 * 
 * @author Dione
 *
 */
public class FabricaPuma implements FabrProdEsportivos {

	@Override
	public CamisasEsportivas criarCamisa() {

		return new CamFluminense();
	}
}

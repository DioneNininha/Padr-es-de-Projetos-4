package aulaquatro;

/**
 * 
 * @author Dione
 *
 */
public class FabricaNike implements FabrProdEsportivos {

	@Override
	public CamisasEsportivas criarCamisa() {

		return new CamBotafogo();
	}
}
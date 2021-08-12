package aulaquatro;

/**
 * 
 * @author Dione
 *
 */
public class FabricaUmbro implements FabrProdEsportivos {

	@Override
	public CamisasEsportivas criarCamisa() {

		return new CamFlamengo();
	}
}

package negocio;

import java.util.Random;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Sorteador
 */
@Stateless
public class Sorteador implements SorteadorLocal {

	public int getNumero() {
		Random gerador = new Random();
		return gerador.nextInt(10);
	}

}

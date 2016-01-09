package negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class SorteadorMemoria
 */
@Stateful
public class SorteadorMemoria implements SorteadorMemoriaLocal {
	@EJB
	private SorteadorLocal sorteador;
	private List<Integer> numeros;
	
	public SorteadorMemoria() {
        numeros = new ArrayList<Integer>();
    }

	public int getNumero() {
		int valor = sorteador.getNumero();
		numeros.add(valor);
		return valor;
	}

	public List<Integer> getNumeros() {
		return Collections.unmodifiableList(numeros);
	}

}

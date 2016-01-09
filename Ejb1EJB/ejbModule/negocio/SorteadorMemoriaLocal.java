package negocio;

import java.util.List;

import javax.ejb.Local;

@Local
public interface SorteadorMemoriaLocal {
	int getNumero();
	List<Integer> getNumeros();
}

package web;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import negocio.SorteadorMemoriaLocal;

@ManagedBean
@SessionScoped
public class PaginaDaSorteBean {
	@EJB
	private SorteadorMemoriaLocal sorteador;
	
	public int getNumero() {
		return sorteador.getNumero();
	}

	public List<Integer> getNumeros() {
		return sorteador.getNumeros();
	}
}

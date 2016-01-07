package web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AloMundo {
	private String saudacao;

	public AloMundo() {
		saudacao = "Al�, Mundo!";
	}
	
	public String getSaudacao() {
		return saudacao;
	}

	public void setSaudacao(String saudacao) {
		this.saudacao = saudacao;
	}
}
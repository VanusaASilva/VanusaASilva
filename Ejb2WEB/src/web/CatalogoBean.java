package web;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import negocio.CatalogoRemote;
import negocio.Produto;

@ManagedBean
@SessionScoped
public class CatalogoBean {
	private Produto produto;
	private List<Produto> produtos;
	@EJB
	private CatalogoRemote catalogo;
	
	public CatalogoBean() {
		produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		if(produtos == null) {
			produtos = catalogo.listarTodos();
		}
		return produtos;
	}

	public String salvar() {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Produto alterado com sucesso!", "Produto: " + produto.getCodigo());
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return "index";
	}
}

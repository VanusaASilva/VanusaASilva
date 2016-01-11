package web;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import entidades.Autor;
import negocio.AutorDAO;
import negocio.DAOAutorException;

@ManagedBean
@RequestScoped
public class InserirBean {
	private Autor autor;
	@EJB
	private AutorDAO autorDao;
	
	public InserirBean() {
		autor = new Autor();
		autor.setPrimeiroNome("Nome");
		autor.setUltimoNome("Sobrenome");
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void inserir() {
		if(autor != null){
			try{
				autorDao.criar(autor.getPrimeiroNome(), autor.getUltimoNome());
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Autor inserido com sucesso", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);				
			}catch(DAOAutorException e){
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Falha de insercao", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			}
		}
	}
}

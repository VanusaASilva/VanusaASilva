package web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import negocio.Cliente;

@ManagedBean
@RequestScoped
public class DadosBean {
	private Cliente cliente = new Cliente();
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
}

package negocio;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface CatalogoRemote {
	void adicionar(Produto umProduto);
	List<Produto> listarTodos();
}

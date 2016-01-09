package negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class Catalogo
 */
@Stateful
public class Catalogo implements CatalogoRemote {
	private List<Produto> produtos;

	public Catalogo() {
        produtos = new ArrayList<Produto>();
    }

	@PostConstruct
	public void inicializar() {
		produtos.add(new Produto(1, "Apontador", 1.95));
		produtos.add(new Produto(2, "Caneta", 2.5));
		produtos.add(new Produto(3, "Borracha", 0.85));
	}
	
	public void adicionar(Produto umProduto) {
		produtos.add(umProduto);
	}

	public List<Produto> listarTodos() {
		return Collections.unmodifiableList(produtos);
	}

}

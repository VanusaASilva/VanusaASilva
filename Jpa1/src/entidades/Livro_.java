package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-08T22:33:08.694-0200")
@StaticMetamodel(Livro.class)
public class Livro_ {
	public static volatile SingularAttribute<Livro, Integer> codigo;
	public static volatile SingularAttribute<Livro, String> titulo;
	public static volatile SingularAttribute<Livro, Integer> ano;
	public static volatile SingularAttribute<Livro, Editora> editora;
	public static volatile CollectionAttribute<Livro, Autor> autores;
}

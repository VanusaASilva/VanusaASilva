package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-01-11T11:24:08.667-0200")
@StaticMetamodel(Editora.class)
public class Editora_ {
	public static volatile SingularAttribute<Editora, Integer> codigo;
	public static volatile SingularAttribute<Editora, String> nome;
	public static volatile CollectionAttribute<Editora, Livro> livros;
}

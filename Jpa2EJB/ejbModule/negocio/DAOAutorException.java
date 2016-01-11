package negocio;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class DAOAutorException extends Exception {
	public DAOAutorException(){
		super();
	}
	public DAOAutorException(String mensagem) {
		super(mensagem);
	}
	public DAOAutorException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}

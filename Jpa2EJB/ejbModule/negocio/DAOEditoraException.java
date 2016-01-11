package negocio;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class DAOEditoraException extends Exception {
	public DAOEditoraException(){
		super();
	}
	public DAOEditoraException(String mensagem) {
		super(mensagem);
	}
	public DAOEditoraException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}

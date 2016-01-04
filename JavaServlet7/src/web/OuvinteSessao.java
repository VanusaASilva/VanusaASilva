package web;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class OuvinteSessao
 *
 */
public class OuvinteSessao implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public OuvinteSessao() {
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  {
    	System.err.println("sessao criada");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.err.println("sessao encerrada");
    }
	
}

package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LeitorSessao
 */
public class LeitorSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String nome = "";
		try {
			HttpSession sessao = request.getSession();
			Object valor = sessao.getAttribute("nome");
			if(valor != null) {
				nome = (String)valor;
			}
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet LeitorSessao</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Alô " + nome + "!</h1>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			if(out != null) {
				out.close();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

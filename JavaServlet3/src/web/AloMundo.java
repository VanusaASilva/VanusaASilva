package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AloMundo
 */
public class AloMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String[] nomes = null;
		try {
			nomes = request.getParameterValues("nomes");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet AloMundo</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Alô:</h1>");
			out.println("<p>");
			for(String nome : nomes) {
				out.println(nome + "<br />");
			}
			out.println("</p>");
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

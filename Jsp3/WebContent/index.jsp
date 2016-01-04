<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Exemplo 3</title>
</head>
<body>
	<%
	String[] dados = request.getParameterValues("ide");
	if(dados != null) {
		out.println("<h2>Dados selecionados:</h2>");
		for(String s : dados) {
			out.println(s + "<br/>");
		}
	}
	 %>
	 <h2>Selecione uma ou mais IDEs:</h2>
	 <form action="index.jsp" method="post">
	 	<select name="ide" size="3" multiple="multiple">
	 		<option>Eclipse</option>
	 		<option>NetBeans</option>
	 		<option>Visual Studio</option>
	 		<option>Notepad</option>
	 	</select>
	 	<input type="submit" value="Enviar" name="btEnviar"/>
	 </form>
</body>
</html>
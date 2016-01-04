<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="usuario" class="beans.Usuario" scope="session" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página 2</title>
</head>
<body>
	<h2>Alô <jsp:getProperty property="nome" name="usuario"/> outra vez!</h2>
	<p>Clique <a href="fim.jsp">aqui</a> para sair</p>	
</body>
</html>
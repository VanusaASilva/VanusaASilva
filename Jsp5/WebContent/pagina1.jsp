<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="usuario" class="beans.Usuario" scope="session" />
<jsp:setProperty name="usuario" param="nome" property="nome"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página 1</title>
</head>
<body>
	<h2>Alô <jsp:getProperty property="nome" name="usuario"/>!</h2>
	<p>Siga em <a href="pagina2.jsp">frente</a></p>
</body>
</html>
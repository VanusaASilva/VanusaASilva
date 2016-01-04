<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="usuario" class="beans.Usuario" />
<jsp:setProperty property="nome" name="usuario" value="${param.nome}"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Exemplo 3</title>
</head>
<body>
	<form action="index.jsp" method="post">
		<p>Nome:<input type="text" name="nome"/></p>
		<input type="submit" value="Ok" name="btOk"/>
	</form>
	<p>Nome = ${usuario.nome}</p>
</body>
</html>
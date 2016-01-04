<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Exemplo 2</title>
</head>
<body>
	<%
		Date hoje = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
	 %>
	 <p>A data atual do servidor é:
	 	<%= formato.format(hoje)%>
	 </p>
</body>
</html>
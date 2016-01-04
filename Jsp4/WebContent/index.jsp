<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="formatador" class="beans.FormatadorDatas">
	<jsp:setProperty name="formatador" property="formato" value="dd/MM/yyyy"/>
</jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Exemplo 4</title>
</head>
<body>
	<p>A data atual do servidor é:
		<jsp:getProperty property="data" name="formatador"/>
	</p>
</body>
</html>
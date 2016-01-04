<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jstl Exemplo 4</title>
</head>
<body>
	 <h2>Selecione uma ou mais IDEs:</h2>
	 <form action="index.jsp" method="post">
	 	<select name="ides" size="3" multiple="multiple">
	 		<option>Eclipse</option>
	 		<option>NetBeans</option>
	 		<option>Visual Studio</option>
	 		<option>Notepad</option>
	 	</select>
	 	<input type="submit" value="Enviar" name="btEnviar"/>
	 </form>
	<c:if test="${!empty paramValues.ides}">
		<p>Valores selecionados:</p>
		<c:forEach items="${paramValues.ides}" var="selecao">
			<c:out value="${selecao}"/><br/>
		</c:forEach>
	</c:if>
</body>
</html>
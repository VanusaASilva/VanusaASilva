<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:view>
<html>
<head>
  <title>Jsf Exemplo 1 com JSP</title>
</head>
<body>
<h3>Saudação</h3>
<p><h:outputText value="#{aloMundo.saudacao}" /></p>
</body>
</html>
</f:view>

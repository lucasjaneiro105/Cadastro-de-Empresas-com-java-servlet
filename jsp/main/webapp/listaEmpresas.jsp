<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List, br.com.alura.projetoweb.servlet.Empresa"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard TagLib</title>
</head>
<body>

<c:if test = "${not empty empresa}" >
    Empresa ${ empresa } cadastrada com sucesso!
</c:if>




    lista de empresas: <br />


<ul>
   <c:forEach items="${empresas}" var="empresa">
   
         <li>
         ${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> 
         <a href="/projetoweb/mostraEmpresa?id=${empresa.id }">editar</a>
          <a href="/projetoweb/RemoverEmpresa?id=${empresa.id }">remover</a>
         
         </li>
        </c:forEach>

</ul>
</body>
</html>
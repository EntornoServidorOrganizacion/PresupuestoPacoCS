<%-- 
    Document   : index
    Created on : 3 nov. 2018, 15:55:34
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/normalizer.css">
        <link rel="stylesheet" type="text/css" href="CSS/estilo.css">
    </head>
    <body>
        <%@include file = "../INC/cabecera.jsp" %>
        <div id="menuJSP">
            <h1>Menú</h1>
            <p><a href="JSP/index.jsp">- JSPStandar -</a></p>
            <p><a href="JSPEL/index.jsp">- JSPEL -</a></p>
        </div>
        <footer>
            <p>&copy;2018. Paco Correa Sánchez</p>
        </footer>
    </body>
</html>

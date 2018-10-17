<%-- 
    Document   : verCuota
    Created on : 15 oct. 2018, 17:44:57
    Author     : paco
--%>

<%@page import="es.albarregas.beans.EdificioBeans"%>
<%@page import="es.albarregas.beans.ContenidoBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../CSS/normalizer.css">
        <link rel="stylesheet" type="text/css" href="../CSS/estilo.css">

    </head>
    <body>
        <%@include file = "../INC/cabecera.jsp" %>
        <div id="principal">

            <h1>La prima de edificio es de: <%=request.getAttribute("primaE")%>€</h1>
            <br>
            <h1>La prima de contenido es de: <%=request.getAttribute("primaC")%>€</h1>

        </div>
        <%@include file = "../INC/footer.jsp" %>
    </body>
</html>


<%-- 
    Document   : index
    Created on : 31 oct. 2018, 17:34:26
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../CSS/normalizer.css">
        <link rel="stylesheet" type="text/css" href="../CSS/estilo.css">
        <title>JSPEL</title>
    </head>
    <body>
        <%@include file = "../INC/cabecera.jsp" %>
        <div id="principal">

            <form action="../Eleccion" method="post">


                <h1>Elija su seguro de confianza</h1>
                <p>Por favor, elija que desea asegurar (marque uno sólo o los dos en las casillas)</p>
                <br>
                <p>¿Qué tipo de seguro desea?</p>
                <input name="check1" value="ckEdificio" type="checkbox" checked="checked" />Seguro de edificios
                <br>
                <input name="check2" value="ckContenido" type="checkbox" checked="checked" />Seguro de contenido
                <br><br>
                <button type="submit" name="enviar" value="Enviar"/>Enviar


            </form>

        </div>

        <%@include file = "../INC/footer.jsp" %>
    </body>
</html>

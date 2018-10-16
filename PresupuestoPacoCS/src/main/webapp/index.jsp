<%-- 
    Document   : index
    Created on : 15 oct. 2018, 17:38:36
    Author     : paco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/normalizer.css">
        <link rel="stylesheet" type="text/css" href="CSS/estilo.css">
        <title>Seguros Correa</title>
    </head>
    <body>
        <%@include file = "../INC/cabecera.jsp" %>
        <img id="imagenCabecera" src="IMAGE/imagenCabecera.png">
        <div id="principal">

            <form action="Eleccion" method="post">


                <h1>Elija su seguro de confianza</h1>
                <p>Por favor, elija que desea asegurar (marque uno sólo o los dos en las casillas)</p>
                <br>
                <p>¿Qué tipo de seguro desea?</p>
                <input name="check" value="ckEdificio" type="checkbox" checked="checked" />Seguro de edificios
                <br>
                <input name="check" value="ckContenido" type="checkbox" checked="checked" />Seguro de contenido
                <br><br>
                <button type="submit" name="enviar" value="Enviar"/>Enviar


            </form>

        </div>

        <%@include file = "../INC/footer.jsp" %>

    </body>
</html>

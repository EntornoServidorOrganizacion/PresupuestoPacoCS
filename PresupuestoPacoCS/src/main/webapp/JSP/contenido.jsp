<%-- 
    Document   : Contenido
    Created on : 15 oct. 2018, 17:43:49
    Author     : paco
--%>

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

            <form action="<%=request.getContextPath()%>/Contenido" method="post">


                <h1>Detalle de la póliza de contenidos</h1>
                <p>Proporcione la información que necesitamos para hacer los cálculos y pulse enviar</p>
                <br>
                <table border="1">
                    <tr>
                        <td>Cubrir daños accidentales: </td>
                        <td>Cantidad que quiere asegurar: </td>
                        <td>Franquicia: </td>
                        
                    </tr>

                    <tr>
                        <td>
                            <input class="checkboxtext" type="checkbox" name="daniosAccidentales"/>
                        </td>
                        
                        <td><select name="cantidadAsegurar" value="">
                                <option value="10000" selected>10.000</option>
                                <option value="20000">20.000</option>
                                <option value="30000">30.000</option>
                                <option value="40000">40.000</option>
                                <option value="50000">50.000</option>
                            </select>
                        </td>
                        <td>
                            <input type="radio" checked/>Ninguna<br/>
                            <input type="radio"/>500<br/>
                            <input type="radio"/>1.000
                        </td>
                        
                    </tr>
                </table>
                <br><br>
                <button type="submit" name="enviar" value="Enviar"/>Enviar


            </form>

        </div>
        
        <%@include file = "../INC/footer.jsp" %>
    </body>
</html>

<%-- 
    Document   : verCuota
    Created on : 15 oct. 2018, 17:44:57
    Author     : paco
--%>

<%@page import="es.albarregas.models.CalcularCuota"%>
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

    <%

        HttpSession sesion = request.getSession();
        EdificioBeans edificio = (EdificioBeans) sesion.getAttribute("edificio");
        ContenidoBeans contenido = (ContenidoBeans) sesion.getAttribute("contenido");
        String mh;
        String siOno;
        String franquicia;
        double total = 0;
    %>


    <body>
        <%@include file = "../INC/cabecera.jsp" %>
        <div id="principal">
            <%
                if (edificio != null) {
                    total = total + edificio.getPrima();
            %>
            <h1>Seguro de edificio</h1>
            <p>- Tipo de edificio: <%=edificio.getTipoVivienda()%></p>
            <p>- Número de habitaciones: <%=edificio.getNumHabitaciones()%></p>
            <p>- Fecha de construcción: <%=edificio.getAnioCons()%></p>
            <%
                if (edificio.getTipoCons().startsWith("mad")) {
                    mh = "Madera";
                } else {
                    mh = "Hormigón";
                }

            %>
            <p>- Tipo de construcción: <%=mh%></p>
            <p>- Valor estimado del mercado: <%=edificio.getValorMercado()%>€</p>
            <%
                if (contenido != null) {
            %>
            <p><small>(Total del seguro del edificio: <%=Math.round(edificio.getPrima() * 100.0) / 100.0%>€)</small></p>

            <%
                }
            %>
            <br/>
            <%
                }
                if (edificio != null && contenido != null) {
            %>
            <hr/>
            <%
                }
            %>

            <%
                if (contenido != null) {
                    total = total + contenido.getPrima();
            %>
            <h1>Seguro de contenido</h1>
            <%
                if (contenido.isDaniosAcc() == true) {
                    siOno = "Sí";
                } else {
                    siOno = "No";
                }
            %>
            <p>- Cubrir daños accidentales: <%=siOno%></p>
            <p>- Cantidad que se quiere asegurar: <%=contenido.getCantidadAse()%>€</p>
            <%
                if (contenido.getFranquicia() == 0) {
                    franquicia = "Ninguna";
                } else {
                    franquicia = Integer.toString(contenido.getFranquicia()) + "€";
                }
            %>
            <p>- Franquicia: <%=franquicia%></p>
            
            <%
                if (edificio != null) {
            %>
            <p><small>(Total del seguro del contenido: <%=Math.round(contenido.getPrima() * 100.0) / 100.0%>€)</small></p>

            <%
                }
            %>
            
            <br/>

            <%
                }
            %>

            <h2>El TOTAL de su seguro es de: <%=Math.round(total * 100.0) / 100.0%>€</h2>
            <button id="botonMenu" type="submit" name="menu" value="Menu"><a id="enlaceMenu" href="<%=request
                    .getContextPath()%>/index.jsp">Menú</a> </button>
        </div>
        <%
            //invalidar sesión para que el resultado siempre se muestre correcto
            sesion.invalidate();
        %>
        <%@include file = "../INC/footer.jsp" %>
    </body>
</html>


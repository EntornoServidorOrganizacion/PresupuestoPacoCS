<%-- 
    Document   : verCuota
    Created on : 31 oct. 2018, 17:34:58
    Author     : paco
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="edificio" scope="session" class="es.albarregas.beans.EdificioBeans"/>
<jsp:useBean id="contenido" scope="request" class="es.albarregas.beans.ContenidoBeans"/>
<jsp:useBean id="eleccion" scope="session" class="es.albarregas.beans.EleccionBeans"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/normalizer.css">
        <link rel="stylesheet" type="text/css" href="CSS/estilo.css">
        <title>Cuota JSPEL</title>
    </head>
    <body>
        <div id="principal">
            
            <%----------Edificio--------------%>
            <c:if test='${sessionScope.eleccion.edificio}'>

                <h1>Seguro de edificio</h1>
                
                <ul>
                    
                    <li>Tipo de edificio: ${sessionScope.edificio.tipoVivienda}</li>
                    <li>Número de habitaciones: ${sessionScope.edificio.numHabitaciones}</li>
                    <li>Fecha de construcción: ${sessionScope.edificio.anioCons}</li>

                    
                    
                    <%--Pintar en pantalla madera u hormigón--%>
                    <c:set var="mh" scope = "session" value="madera"/>
                    <c:if test='${sessionScope.edificio.tipoCons != "madera"}'>
                        <c:set var="mh" scope = "session" value="hormigón"/>
                    </c:if>
                    <li>Tipo de construcción: ${mh}</li>

                    
                    
                    <li>Valor estimado del mercado: ${sessionScope.edificio.valorMercado}€</li>
                    
                </ul>
                <br/>
                
                <%--Si también hay seguro por contenido, mostrar la cantidad de cada seguro por separado--%>
                <c:if test='${sessionScope.eleccion.contenido}'>
                    <p><small>(Total del seguro del edificio:${sessionScope.edificio.prima}€)</small></p>
                </c:if>
                    
                    
            </c:if><%--FIN Edificio--%>

            
            
            
            <%--Línea divisoria de seguros--%>  
            <c:if test='${sessionScope.eleccion.edificio && sessionScope.eleccion.contenido}'>
                <hr/>
            </c:if>
                
                
                
                
                
                
                
            <%---------Contenido-----------------%>
            <c:if test='${sessionScope.eleccion.contenido}'>
                
                <h1>Seguro de contenido</h1>
                
                <ul>
                    
                    <%--Pintar en pantalla madera u hormigón--%>
                    <c:set var="mh" scope = "session" value="madera"/>
                    <c:if test='${sessionScope.edificio.tipoCons != "madera"}'>
                        <c:set var="mh" scope = "session" value="hormigón"/>
                    </c:if>

                    
                    
                    <%--Pintar en pantalla si o no--%>
                    <c:set var="siOno" scope = "request" value="no"/>
                    <c:if test='${requestScope.contenido.daniosAcc}'>
                        <c:set var="siOno" scope = "request" value="si"/>
                    </c:if>
                    <li>Cubrir daños accidentales: ${siOno}</li>



                    <li>Cantidad que se quiere asegurar: ${requestScope.contenido.cantidadAse}€</li>



                    <%--Evaluar valor de la franquicia--%>
                    <c:set var="franquicia" scope = "request" value='${requestScope.contenido.franquicia}'/>
                    <c:choose>

                        <c:when test = '${franquicia == "0"}'>
                            <c:set var="franquicia" scope = "request" value='Ninguna'/>
                        </c:when>

                        <c:when test = '${franquicia == "500"}'>
                            <c:set var="franquicia" scope = "request" value='500€'/>
                        </c:when>

                        <c:when test = '${franquicia == "1.000"}'>
                            <c:set var="franquicia" scope = "request" value='1000€'/>
                        </c:when>

                    </c:choose>
                    <li>Franquicia: ${franquicia}</li>




                </ul>
                <br/>
                <%--Si también hay seguro por edificio, mostrar la cantidad de cada seguro por separado--%>
                <c:if test='${sessionScope.eleccion.edificio}'>
                    <p><small>(Total del seguro del contenido: ${requestScope.contenido.prima}€)</small></p>
                </c:if>
                    
            </c:if><%--FIN Contenido--%>
            
            
            
            
            <h2>El TOTAL de su seguro es de: ${sessionScope.edificio.prima + requestScope.contenido.prima}€</h2>
            
            <button id="botonMenu" type="submit" name="menu" value="Menu"><a id="enlaceMenu" href="index.jsp">Menú</a> </button>
        </div>
        <%
            //invalidar sesión para que el resultado siempre se muestre correcto
            HttpSession sesion = request.getSession();
            sesion.invalidate();
        %>
    </body>
</html>

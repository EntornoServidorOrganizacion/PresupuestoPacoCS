/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.beans.EdificioBeans;
import es.albarregas.beans.EleccionBeans;
import es.albarregas.models.CalcularCuota;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author paco
 */
@WebServlet(name = "Edificio", urlPatterns = {"/Edificio"})
public class Edificio extends HttpServlet {


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /**
         * se llama al modelo CalcularCuota y para finalizar se comprueba 
         * si se ha elegido la opción contenido en el Bean Eleccion. 
         * En el caso de que se haya elegido mostraremos el formulario 
         * donde se piden los datos del contenido y en caso contrario se visualizará la vista verCuota.
         */
        HttpSession sesion = request.getSession();
        EleccionBeans eleccion = new EleccionBeans();
        String url = null;
        //pasarlo por sesión
        EdificioBeans edificio = new EdificioBeans();

        //introducir datos donde corresponde
        edificio.setTipoVivienda(request.getParameter("tipoEdificio"));
        edificio.setNumHabitaciones(Integer.parseInt(request.getParameter("habitaciones")));
        edificio.setAnioCons(Integer.parseInt(request.getParameter("fechaConstruccion")));
        edificio.setTipoCons(request.getParameter("tipoCons"));
        edificio.setValorMercado(Double.parseDouble(request.getParameter("valorMercado")));
        //CUOTA
        edificio.setPrima(CalcularCuota.primaEdificio(edificio));
        
        //Obtenemos el objeto  de eleccion en la sesión
        //si contenido (boolean) es true, nos dirige a su formulario (contenidoo.jsp)
        eleccion = (EleccionBeans) sesion.getAttribute("eleccion");
        
        if(eleccion.isContenido()){
            url = "JSPEL/contenido.jsp";
        } else{
            url = "JSPEL/verCuota.jsp";
        }
        
        //ponemos en sesión 
        sesion.setAttribute("edificio", edificio);
 
        //redirigimos a la url a la que se desea ir
        request.getRequestDispatcher(url).forward(request,response);
    }


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

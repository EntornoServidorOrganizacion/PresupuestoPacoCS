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
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
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
        
        //Atributos necesarios, recogida de datos
        String tipoVivienda = request.getParameter("tipoEdificio");
        int numHabitaciones = Integer.parseInt(request.getParameter("habitaciones"));
        int anioCons = Integer.parseInt(request.getParameter("fechaConstruccion"));
        String tipoCons = request.getParameter("tipoCons");
        int valorMercado = Integer.parseInt(request.getParameter("valorMercado"));
        
        //introducir datos donde corresponde
        edificio.setTipoVivienda(tipoVivienda);
        edificio.setNumHabitaciones(numHabitaciones);
        edificio.setAnioCons(anioCons);
        edificio.setTipoCons(tipoCons);
        edificio.setValorMercado(valorMercado);
        //CUOTA
        edificio.setPrima(CalcularCuota.primaEdificio(edificio));
        
        //Obtenemos el objeto miEleccion de la sesion para saber si hay que pedir los datos de contenidos o no
        eleccion = (EleccionBeans) sesion.getAttribute("eleccion");
        //si contenido (boolean) es true, nos dirige a su formulario (contenidoo.jsp)
        if(eleccion.isContenido()){
            url = "JSP/contenido.jsp";
        } else{
            url = "JSP/verCuota.jsp";
        }
        
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

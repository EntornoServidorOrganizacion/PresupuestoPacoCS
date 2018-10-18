/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.beans.ContenidoBeans;
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
@WebServlet(name = "Contenido", urlPatterns = {"/Contenido"})
public class Contenido extends HttpServlet {

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
        //pasarlo por petición
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

        HttpSession sesion = request.getSession();
        EleccionBeans eleccion = new EleccionBeans();
        String url = "JSP/verCuota.jsp";
        ContenidoBeans contenido = new ContenidoBeans();

        int cantidadAse = Integer.parseInt(request.getParameter("cantidadAsegurar"));
        int franquicia = Integer.parseInt(request.getParameter("radio"));
        
        //introducir datos donde corresponde
        if (request.getParameter("daniosAccidentales") != null) {
            contenido.setDaniosAcc(true);
        } else {
            contenido.setDaniosAcc(false);
        }

        contenido.setCantidadAse(cantidadAse);
        contenido.setFranquicia(franquicia);
        //CUOTA
        contenido.setPrima(CalcularCuota.primaContenido(contenido));

        //Obtenemos el objeto  de eleccion en la sesión
        eleccion = (EleccionBeans) sesion.getAttribute("eleccion");

        //pasamos por sesión el objeto de ContenidoBeans 
        sesion.setAttribute("contenido", contenido);

        //redirigimos a la url a la que se desea ir
        request.getRequestDispatcher(url).forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String
            getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

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

        String url = "JSPEL/verCuota.jsp";
        ContenidoBeans contenido = new ContenidoBeans();


        //introducir datos donde corresponde
        if (request.getParameter("daniosAccidentales") != null) {
            contenido.setDaniosAcc(true);
        } else {
            contenido.setDaniosAcc(false);
        }

        contenido.setCantidadAse(Double.parseDouble(request.getParameter("cantidadAsegurar")));
        contenido.setFranquicia(Double.parseDouble(request.getParameter("radio")));
        //CUOTA
        contenido.setPrima(CalcularCuota.primaContenido(contenido));

        //pasamos por peticion el objeto de ContenidoBeans 
        request.setAttribute("contenido", contenido);

        //redirigimos a la url a la que se desea ir
        request.getRequestDispatcher(url).forward(request, response);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.beans.EleccionBeans;
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
@WebServlet(name = "Eleccion", urlPatterns = {"/Eleccion"})
public class Eleccion extends HttpServlet {

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
        String url = null;
        EleccionBeans eleccion = new EleccionBeans();
        HttpSession sesion = request.getSession();
        boolean edificio = false;
        boolean contenido = false;

        //volver al index si los dos checkbox están desmarcados
        if (request.getParameter("check1") == null && request.getParameter("check2") == null) {
            url = "JSPEL/index.jsp";
        } else {
            //comprobar los checkbox por separado
            //checkbox de edificio 
            if (request.getParameter("check1") != null) {
                edificio = true;
                url = "JSPEL/edificio.jsp";
            } else {
                edificio = false;
            }

            //checkbox de contenido.
            if (request.getParameter("check2") != null) {
                contenido = true;
            } else {
                contenido = false;
            }
        }

        //modificar los atributos del beans EleccionBeans
        eleccion.setEdificio(edificio);
        eleccion.setContenido(contenido);
        
        
        //si uno de los dos no está seleccionado, se irá al formulario correspondiente
        if(eleccion.isEdificio() && !eleccion.isContenido()){ 
            url = "JSPEL/edificio.jsp";
        } else if(!eleccion.isEdificio() && eleccion.isContenido()){
            url = "JSPEL/contenido.jsp";
        }

        //pasamos por sesión el objeto de EleccionBeans 
        sesion.setAttribute("eleccion", eleccion);

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Asignaciones;
import modelo.Departamentos;
import modelo.Gerencias;
import modelo.Requerimientos;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "cerrar_req", urlPatterns = {"/cerrar_req"})
public class cerrar_req extends HttpServlet {

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

        Gerencias ger = new Gerencias();
        ArrayList<Gerencias> lista = new ArrayList<Gerencias>();
        lista = ger.consultarGerencias();
        request.setAttribute("lista", lista);

        Departamentos dep = new Departamentos();
        ArrayList<Departamentos> list = new ArrayList<Departamentos>();
        list = dep.consultarDepartamentos();
        request.setAttribute("list", list);

        Asignaciones asi = new Asignaciones();
        ArrayList<Asignaciones> lis = new ArrayList<Asignaciones>();
        lis = asi.consultarAsignaciones();
        request.setAttribute("lis", lis);
        
         
        Requerimientos req;
        req = new Requerimientos();
        ArrayList<Requerimientos> li = new ArrayList<Requerimientos>();
        li = req.consultarRequerimiento();

        request.setAttribute("li", li);
        
        
        request.getRequestDispatcher("/cerrar.jsp").forward(request, response);

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import conexion.*;
import modelo.*;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "controlador", urlPatterns = {"/login"})
public class login extends HttpServlet {
    Connection con = null;
    
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            boolean ok = false;
         
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("pass");
           
            con = Conexion.getConexion();
            String consulta = "select * from usuarios where usuario = ? and pass = ?";
            ResultSet rs = null;
            PreparedStatement st = null;
            st = con.prepareStatement(consulta);
            st.setString(1, usuario);
            st.setString(2, password);
            rs = st.executeQuery();
 
           
            while(rs.next()){
                
                ok = true;
               
            }
 
            if(ok){
                
                request.getRequestDispatcher("/menu.jsp").forward(request, response);
            }else{
                
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }
            out.close();
        } catch (SQLException ex) {
        }
    }   

  

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Requerimientos {
    private int id;
    private String gerencia;
    private String departamento;
    private String asignacion;
    private String encargado;
    private String requerimiento;

    public Requerimientos(int id, String gerencia, String departamento, String asignacion, String encargado, String requerimiento) {
        this.id = id;
        this.gerencia = gerencia.toUpperCase();
        this.departamento = departamento.toUpperCase();
        this.asignacion = asignacion.toUpperCase();
        this.encargado = encargado.toUpperCase();
        this.requerimiento = requerimiento.toUpperCase();
    }
    

    public Requerimientos() {
    }

    public Requerimientos(String gerencia, String departamento, String asignacion, String encargado,String requerimiento) {
        this.gerencia = gerencia.toUpperCase();
        this.departamento = departamento.toUpperCase();
        this.asignacion = asignacion.toUpperCase();
        this.encargado = encargado.toUpperCase();
        this.requerimiento = requerimiento.toUpperCase();
    }

    public Requerimientos(String gerencia, String departamento, String asignacion) {
        this.gerencia = gerencia;
        this.departamento = departamento;
        this.asignacion = asignacion;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(String asignacion) {
        this.asignacion = asignacion;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }
    
    public boolean ingresarRequerimiento(){
            boolean ok=false;
            Conexion conex=new Conexion();
            
            
            try {
            String sql="insert into requerimientos(gerencia, departamento, asignacion, encargado, requerimiento) values(?,?,?,?,?)";
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            st.setString(1, gerencia);
            st.setString(2, departamento);
            st.setString(3, asignacion);
            st.setString(4, encargado);
            st.setString(5, requerimiento);
            st.executeUpdate();
            ok=true;
            conex.desconectar();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            
        }
    return ok;
    }
    
     public ArrayList consultarRequerimiento(){
        
         
         
         
            ArrayList li=new ArrayList();
            Conexion conex=new Conexion();
            
            
            String sql="select * from requerimientos ";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                li.add(new Requerimientos(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getString(3),
                                       rs.getString(4),
                                       rs.getString(5),
                                       rs.getString(6)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return li;
    }
    
     public ArrayList cerrarRequerimiento(){
        
            ArrayList lista=new ArrayList();
            Conexion conex=new Conexion();
            String sql="delete from requerimientos where id = ? ";
         try {   
            conex.conectar();
            PreparedStatement st=(PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                lista.add(new Requerimientos(rs.getInt(1),
                                       rs.getString(2),
                                       rs.getString(3),
                                       rs.getString(4),
                                        rs.getString(5),
                                       rs.getString(6)));
               
            }
             conex.desconectar();
        } catch (ClassNotFoundException ex) { 
        } catch (SQLException ex) {
            
        }
         return lista;
    }
}

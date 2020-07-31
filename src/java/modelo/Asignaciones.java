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

/**
 *
 * @author Usuario
 */
public class Asignaciones {

    private int id;
    private String nombre;

    public Asignaciones() {
    }

    public Asignaciones(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Asignaciones> consultarAsignaciones() {

        ArrayList lis = new ArrayList();
        Conexion conex = new Conexion();
        String sql = "SELECT * FROM asignaciones";
        try {
            conex.conectar();
            PreparedStatement st = (PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lis.add(new Asignaciones(rs.getInt(1),
                        rs.getString(2)));

            }
            conex.desconectar();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {

        }
        return lis;
    }      
}

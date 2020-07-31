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
public class Encargados {

    private int id;
    private String nombre;
    private int id_gerencia;

    public Encargados() {
    }

    public Encargados(int id, String nombre, int id_gerencia) {
        this.id = id;
        this.nombre = nombre;
        this.id_gerencia = id_gerencia;
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

    public int getId_gerencia() {
        return id_gerencia;
    }

    public void setId_gerencia(int id_gerencia) {
        this.id_gerencia = id_gerencia;
    }

    public ArrayList<Encargados> consultarEncargados() {

        ArrayList li = new ArrayList();
        Conexion conex = new Conexion();
        String sql = "SELECT * FROM encargados";
        try {
            conex.conectar();
            PreparedStatement st = (PreparedStatement) conex.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                li.add(new Encargados(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3)));

            }
            conex.desconectar();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {

        }
        return li;
    }
}

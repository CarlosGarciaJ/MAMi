/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conn.Conn;
import Modelo.EPS;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Carlos Garcia
 */
public class DaoEPS extends EPS {

    Conn conn = new Conn();
    int id;

    public int insertar(String NombreEntidad, String NIT, String NombreContacto, String CorreoContacto,
            String Telefono, String Direccion, String Ciudad) {
        try {
            id += 1;
            String sql = "INSERT INTO entidades VALUES (" + id + " , '" + NombreEntidad + "' ,'" + NIT + "','" + NombreContacto + "','" + CorreoContacto + "','"
                    + Telefono + "','" + Direccion + "','" + Ciudad + "')";
            System.out.println("sql=" + sql);
            conn.insertar(sql);
            conn.getCon().close();
            return 1;
        } catch (SQLException ex) {
            System.out.println("ex = " + ex.getMessage());
            return -1;
        }
    }

    public int Obtener_Secuencia() {
        try {
            int id1 = 0;
            String sql = "select count(*) from entidades";
            ResultSet rs;
            if ((rs = conn.consultar(sql)).next()) {
                id1 = Integer.parseInt(rs.getString(1));
            }
            return id1;
        } catch (SQLException ex) {
            System.out.println("ex = " + ex.getMessage());
        }
        return 0;
    }
}

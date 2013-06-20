/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conn.Conn;
import Modelo.Recordatorios;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cristian David
 */
public class DaoRecordatorios extends Recordatorios{
    
    Conn conn = new Conn();

    public int insertar(String IdMama, String FechaCita, String FechaEnvio, String Mensaje, String Asunto) {
        try {
            int id=Obtener_Secuencia();
            String sql = "INSERT INTO recordatorios VALUES (" + id + " , '" + IdMama + "', '" + FechaCita + "', '" + FechaEnvio + "', '" + Mensaje + "', '" + Asunto + "')";
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
            String sql = "select count(*) from recordatorios";
            ResultSet rs;
            if ((rs = conn.consultar(sql)).next()) {
                id1 = Integer.parseInt(rs.getString(1));
            }
            return id1;
        } catch (SQLException ex) {
            System.out.println("ex = " + ex.getMessage());
            System.out.println("error secuencia");
        }
        return 0;
    }    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conn.Conn;
import Modelo.MenProgramado;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cristian david
 */
/***public class DaoMenProgramado extends MenProgramado{
    Conn conn = new Conn();
    int id;

    public int insertar(String Id, String Semana, String Mensaje, String Tipo) {
        try {
            id += 1;
            String sql = "INSERT INTO MensajesProgramados VALUES (" + Id + " , '" + Semana + "' ,'" + Mensaje + "','" + Tipo + "')";
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
            String sql = "select count(*) from MensajesProgramados";
            ResultSet rs;
            if ((rs = conn.consultar(sql)).next()) {
                id1 = Integer.parseInt(rs.getString(1));
            }
            return id1;
        } catch (SQLException ex) {
            System.out.println("ex = " + ex.getMessage());
        }
        return 0;
    }   ***/ 
    
public class DaoMenProgramado extends MenProgramado {

    Conn conn = new Conn();
    int id;

    public int insertar(String Semana, String Mensaje) {
        try {
            id += 1;
            String sql = "INSERT INTO mensajesprogramados VALUES (" + id + " , '" + Semana + "' ,'" + Mensaje + "')";
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
            String sql = "select count(*) from mensajesprogramados";
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

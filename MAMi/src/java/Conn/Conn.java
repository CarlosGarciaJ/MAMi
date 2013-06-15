package Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carlos Garcia
 */
public class Conn {

    ResultSet res = null;
    private Connection con = null;
    Statement st = null;
    String driver = "org.postgresql.Driver";
    String url = "jdbc:postgresql://127.0.0.1:5432/MAMi";
    String userDB = "postgres";
    String passDB = "admin";

    public Conn() {
        conectar();
    }

    public int conectar() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo cargal el driver :-( " + driver);
            return -1;
        }
        try {
            con = DriverManager.getConnection(url, userDB, passDB);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la conexion :-(");
            return -2;
        }
        System.out.println("conectado");
        return 1;
    }

    public SQLException insertar(String sql) {
        try {
            st = getCon().createStatement();
            System.out.println("1");
            st.execute(sql);
            System.out.println("2");
            st.close();
            System.out.println("ingresado con exito");
            return null;
        } catch (SQLException e) {
            return e;
        }
    }

    public SQLException eliminar(String sql) {
        try {
            st = getCon().createStatement();
            st.execute(sql);
            st.close();
            return null;
        } catch (SQLException e) {
            return e;
        }
    }

    public ResultSet consultar(String sql) {
        try {
            st = getCon().createStatement();
            res = st.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }
        return res;
    }

    public Connection getCon() {
        return con;
    }
}

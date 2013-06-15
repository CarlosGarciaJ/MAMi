package DAO;

import Conn.Conn;
import Modelo.Mama;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Carlos Garcia
 */
public class DaoMama extends Mama {

    Conn conn = new Conn();
    int id;

    public int insertar(String NombreMama, String ApellidoMama, String DI, String Direccion, String Municipio, String Barrio, String TelefonoFijo,
            String Celular, String Correo, String Estrato, String Sisben, String NivelSisben, String EPS, String NombreEPS, String NivelEscolaridad,
            String EstadoCivil, String CabezaDeHogar, String NombreAcompanante, String ApellidoAcompanante, String ParentezcoAcompanante,
            String CelularAcompanante, String GravidadEmbarazo, String FechaParto, String NivelRiesgoEmba, String Patologias) {
        try {
            id += 1;
            String sql = "INSERT INTO Mamas VALUES (" + id + " , '" + NombreMama + "' ,'" + ApellidoMama + "','" + DI + "','" + Direccion + "','"
                    + Municipio + "','" + Barrio + "','" + TelefonoFijo + "','" + Celular + "','" + Correo + "','" + Estrato + "','" + Sisben + "','"
                    + NivelSisben + "','" + EPS + "','" + NombreEPS + "','" + NivelEscolaridad + "','" + EstadoCivil + "' ,'"
                    + CabezaDeHogar + "','" + NombreAcompanante + "','" + ApellidoAcompanante + "','" + ParentezcoAcompanante + "','"
                    + CelularAcompanante + "','" + GravidadEmbarazo + "','" + FechaParto + "','" + NivelRiesgoEmba + "','" + Patologias + "' )";
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
            String sql = "select count(*) from Mamas";
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

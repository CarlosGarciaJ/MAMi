<%-- 
    Document   : prcFormularioMamas
    Created on : Jun 2, 2013, 3:04:28 PM
    Author     : Carlos Garcia
--%>

<%@page import="DAO.DaoMama"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>prcRegistroMamas</title>
    </head>
    <body>
        <%
            String NombreMama = request.getParameter("Nombre");
            String ApellidoMama = request.getParameter("Apellido");
            String DI = request.getParameter("DI");
            String Direccion = request.getParameter("Direccion");
            String Municipio = request.getParameter("Municipio");
            String Barrio = request.getParameter("Barrio");
            String TelefonoFijo = request.getParameter("Fijo");
            String Celular = request.getParameter("Celular");
            String Correo = request.getParameter("Email");
            String Estrato = request.getParameter("Estrato");
            String Sisben = request.getParameter("Sisben"); // Es un boolean donde se pregunta si tiene o no sisben
            String NivelSisben = request.getParameter("NivelSisben");
            String EPS = request.getParameter("EPS");// Es un boolean donde se pregunta si tiene o no EPS
            String NombreEPS = request.getParameter("NombreEPS");
            String NivelEscolaridad = request.getParameter("NivelEscolaridad");
            String EstadoCivil = request.getParameter("EstadoCivil");
            String CabezaDeHogar = request.getParameter("CabezaDeHogar");// Es un boolean donde se pregunta si es cabeza de hogar o no
            String NombreAcompanante = request.getParameter("NombreAcompa");
            String ApellidoAcompanante = request.getParameter("ApellidoAcompa");
            String ParentezcoAcompanante = request.getParameter("ParentezcoAcompa");
            String CelularAcompanante = request.getParameter("CelularAcompa");
            String GravidadEmbarazo = request.getParameter("GravidadEmbarazo");
            String FechaParto = request.getParameter("FechaParto");//Fecha probable de parto
            String NivelRiesgoEmba = request.getParameter("NivelRiesgoEmba");//EJ: Bajo, Medio, Alto
            String Patologias = request.getParameter("Patologias");

            DAO.DaoMama DAO = new DaoMama();
            if (DAO.insertar(NombreMama, ApellidoMama, DI, Direccion, Municipio, Barrio, TelefonoFijo, Celular, Correo, Estrato, Sisben, NivelSisben,
                    EPS, NombreEPS, NivelEscolaridad, EstadoCivil, CabezaDeHogar, NombreAcompanante, ApellidoAcompanante, ParentezcoAcompanante,
                    CelularAcompanante, GravidadEmbarazo, FechaParto, NivelRiesgoEmba, Patologias) == 1) {
        %>

        <script>
            alert('¡Registrado con éxito!');
            document.location = '../Vista/JSP/RegistroMamas.html';
        </script>

        <%        } else {%>
        <script>
            alert('¡El Registro Falló!. Por favor inténtalo de nuevo.');
            document.location = '../Vista/JSP/RegistroMamas.html';
        </script>
        <%}%>
    </body>
</html>

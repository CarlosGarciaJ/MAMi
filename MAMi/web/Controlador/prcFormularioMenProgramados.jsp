<%-- 
    Document   : prcFormularioMensajesProgramados
    Created on : Jun 16, 2013, 3:04:28 PM
    Author     : Cristian David Ch.
--%>

<%@page import="Modelo.MenProgramado"%>
<%@page import="DAO.DaoMenProgramado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>prcRegistroMensajesProgramados</title>
    </head>
    <body>
        <%
            String Semana = request.getParameter("Semana");
            String Mensaje = request.getParameter("Mensaje");

            DAO.DaoMenProgramado DAO = new DaoMenProgramado();
            if (DAO.insertar(Semana, Mensaje) == 1) {
        %>

        <script>
            alert('¡Registrado con éxito!');
            document.location = '../Vista/JSP/RegistroMenProgramados.html';
        </script>

        <%        } else {%>
        <script>
            alert('¡El Registro Falló!. Por favor inténtalo de nuevo.');
            document.location = '../Vista/JSP/RegistroMenProgramados.html';
        </script>
        <%}%>
    </body>
</html>

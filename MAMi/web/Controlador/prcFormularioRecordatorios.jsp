<%-- 
    Document   : prcFormularioRecordatorios
    Created on : Jun 19, 2013, 3:04:28 PM
    Author     : Cristian David Ch.
--%>

<%@page import="Modelo.Recordatorios"%>
<%@page import="DAO.DaoRecordatorios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>prcRegistroRecordatorios</title>
    </head>
    <body>
        <%
            String IdMama = request.getParameter("IdMama");
            String FechaCita = request.getParameter("FechaCita");
            String FechaEnvio = request.getParameter("FechaEnvio");
            String Mensaje = request.getParameter("Mensaje");
            String Asunto = request.getParameter("Asunto");

            DAO.DaoRecordatorios DAO = new DaoRecordatorios();
            if (DAO.insertar(IdMama, FechaCita, FechaEnvio, Mensaje, Asunto) == 1) {
        %>

        <script>
            alert('¡Registrado con éxito!');
            document.location = '../Vista/JSP/RegistroRecordatorios.html';
        </script>

        <%        } else {%>
        <script>
            alert('¡El Registro Falló!. Por favor inténtalo de nuevo.');
            document.location = '../Vista/JSP/RegistroRecordatorio.html';
        </script>
        <%}%>
    </body>
</html>

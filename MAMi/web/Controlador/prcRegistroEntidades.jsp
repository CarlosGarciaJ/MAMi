<%-- 
    Document   : prcFormularioMamas
    Created on : Jun 18, 2013, 3:04:28 PM
    Author     : Carlos Garcia
--%>

<%@page import="DAO.DaoEPS"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>prcRegistroEntidades</title>
    </head>
    <body>
        <%
            String NombreEntidad = request.getParameter("NombreEntidad");
            String NIT = request.getParameter("NIT");
            String NombreContacto = request.getParameter("NombreContacto");
            String CorreoContacto = request.getParameter("CorreoContacto");
            String Telefono = request.getParameter("Telefono");
            String Direccion = request.getParameter("Direccion");
            String Ciudad = request.getParameter("Ciudad");
            
            DAO.DaoEPS DAO = new DaoEPS();
            if (DAO.insertar(NombreEntidad, NIT, NombreContacto, CorreoContacto, Telefono, Direccion, Ciudad) == 1) {
        %>

        <script>
            alert('¡Registrado con éxito!');
            document.location = '../index.jsp';
        </script>

        <%        } else {%>
        <script>
            alert('¡El Registro Falló!. Por favor inténtalo de nuevo.');
            document.location = '../Vista/JSP/RegistroMamas.html';
        </script>
        <%}%>
    </body>
</html>

<%-- 
    Document   : Login
    Created on : 24/05/2013, 06:36:28 PM
    Author     : Juan David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../CSS/ResetCSS.css">
        <title>Login</title>
    </head>
    <body>
        <form action="../../Controlador/prcLogin.jsp">
            <table>
                <tr><td><label>Usuario: </label></td><td><input type="text" id="Input_Usuario" class="Input_Login" name="Usuario" required autofocus></td></tr><br>
                <tr><td><label>Contrase&ncaron;a: </label></td><td><input type="password" id="Input_Password" class="Input_Login" name="Contrasena" required></td></tr><br>
                <tr><td><input type="submit" value="Ingresar"></td></tr>
            </table>
        </form>
    </body>
</html>

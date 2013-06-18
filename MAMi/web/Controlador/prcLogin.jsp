<%
    String usuario = request.getAttribute("Usuario") + "";
    String clave = request.getAttribute("Contrasena") + "";

    if (true) {
%>
<script>
    location = '../Vista/JSP/RegistroMamas.html';
</script>
<%} else {
%>
<script>
    location = '../Vista/JSP/Login.jsp';
</script>
<%    }

%>
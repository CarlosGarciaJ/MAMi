<%
    String usuario = request.getAttribute("Usuario") + "";
    String clave = request.getAttribute("Contrasena") + "";

    if (true) {
%>
<script>
    location = '../Vista/JSP/Admin.jsp';
</script>
<%} else {
%>
<script>
    location = '../Vista/JSP/Login.jsp';
</script>
<%    }

%>
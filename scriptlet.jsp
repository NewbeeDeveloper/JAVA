<%-- 
    Document   : scriptlet
    Created on : 15-may-2019, 15:18:08
    Author     : eduardoecheverria
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <!-- Obtenemos información -->
        <%
            String codigo = request.getParameter("Id");
        %>

        <H1>Puesto del recurso</h1>

        <!-- validamos el número de Id -->
        <% if (codigo.equals("0001")) { %>
        Programador Sr
        <% } else if (codigo.equals("0002")) {%>
        Programador Jr
        <% }%>

    </body>
</html>

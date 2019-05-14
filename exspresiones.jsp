<%-- 
    Document   : espresiones
    Created on : 14-may-2019, 10:20:57
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
        <h1>Recepción de parámetros</h1>
        
        Id de Sesi&oacute;n: <%= session.getId() %>
        
        <br><br>
        
        Par&aacute;metro: <%= request.getParameter("dato") %>
        
    </body>
</html>

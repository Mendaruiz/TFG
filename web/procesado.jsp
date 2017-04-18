<%-- 
    Document   : procesado.jsp
    Created on : 16-feb-2017, 12:02:30
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Nombre: <%= request.getParameter("nombre")%></p>
        <p>Apellido: <%= request.getParameter("email") %></p>
                
    </body>
    
    <a href="redirect.jsp">inicio</a>
</html>

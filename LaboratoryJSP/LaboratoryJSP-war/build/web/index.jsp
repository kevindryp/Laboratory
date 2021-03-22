<%-- 
    Document   : index
    Created on : 19/03/2021, 12:10:34 PM
    Author     : Usuario
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
        <form name="name input form" action="response.jsp">
            <input type="text" name="name" />
            <input type="date" name="date" max="2021-12-31"/>
            <input type="submit" value="enviar"/>
        </form>
    </body>
</html>

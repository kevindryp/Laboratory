<%-- 
    Document   : response
    Created on : 19/03/2021, 12:25:12 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <jsp:useBean id="mybean" scope="session" class="co.edu.unipiloto.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />  
        <jsp:setProperty name="mybean" property="date"/>
        <jsp:setProperty name="mybean" property="hour"/>
        <jsp:setProperty name="mybean" property="age"/>
        
        <c:set var = "hora" scope= "session" value='${mybean.hour}'/>
        <c:choose>
            
            <c:when test ="${hora >= '00:00' && hora <= '11:59'}">
                <h1>Buenos Días <jsp:getProperty name="mybean" property="name" />.</h1>
                <h2>Hora: <c:out value="${hora}"/></h2>
                <p> Fecha de nacimiento: <jsp:getProperty name="mybean" property="date" /> </p>
                <p> Edad: <jsp:getProperty name="mybean" property="age" /> años</p>
            </c:when>
            
            <c:when test ="${hora >= '12:00' && hora <= '18:59'}">
                <h1>Buenas Tardes <jsp:getProperty name="mybean" property="name" />.</h1>
                <h2>Hora: <c:out value="${hora}"/></h2>
                <p> Fecha de nacimiento: <jsp:getProperty name="mybean" property="date" /> </p>
                <p> Edad: <jsp:getProperty name="mybean" property="age" /> años</p>
            </c:when>
            
            <c:when test ="${hora >= '19:00' && hora <= '23:59'}">
                <h1>Buenas Noches <jsp:getProperty name="mybean" property="name" />.</h1>
                <h2>Hora: <c:out value="${hora}"/></h2>
                <p> Fecha de nacimiento: <jsp:getProperty name="mybean" property="date" /> </p>
                <p> Edad: <jsp:getProperty name="mybean" property="age" /> años</p>
            </c:when>
           
        </c:choose>
    </body>    
        
</html>

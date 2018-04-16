<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <%
        double cuota1=Double.valueOf("cuota1");
        double cuota2=Double.valueOf("cuota2");
        double cuota3=Double.valueOf("cuota3");
        double cuota4=Double.valueOf("cuota4");
        System.out.println("LA SUMA DE " +cuota1+ " + " +cuota2+ " + " +cuota3+ " + " +cuota4+ " + ");
        %>
        <a href="home.jsp">Volver</a>
    </body>
</html>

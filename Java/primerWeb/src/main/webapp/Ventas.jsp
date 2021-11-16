
<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            Scanner escaner = new Scanner(System.in);
            String nombre = escaner.nextLine();
        %>
        <h1>Hello <%=nombre%></h1>
    </body>
</html>

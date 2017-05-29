<%-- 
    Document   : Login
    Created on : 28-may-2017, 19:55:43
    Author     : cristianooliveira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Honda Chile</title>
    </head>
    <body>
 <html xmlns="imagenes/logohonda2.png">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Centrado de imagen - psdahtmlpasoapaso.com</title>
<style type="text/css">
img {
width: 580px;
height: 390px;
margin-top: -195px;
margin-left: -290px;
left: 50%;
top: 50%;
position: absolute;
}
</style>
</head>
 
<body>
<img src="imagenes/logohonda2.png" width="580" height="390" />
</body>
</html>
        <%!String error;%>
        <%
            try
            {
            String error = request.getSession().getAttribute("error").toString();
            
            if(error!=null)
            {
            %>
        <h1>welcome!! <%=error%></h1>
        <%
            }
            else
            {
        %>
        <h1>welcome!!</h1>
        <%
            }
            }
catch(NullPointerException ex)
{
%>
        <h1>welcome!!</h1>
        <%
}
            %>
        
        <form action="ServletLogin" method="POST">
        
        <table border="1">
            <thead>
                <tr>
                    <th>Usuario</th>
                    <th>Contraseña</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="text" name="btnUser" placeholder="Ingresar usuario" required=""/></td>
                    <td><input type="password" name="txtPass" placeholder="Ingrese contraseña"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="btnIngresar" value="Ingresar"/></td>
                </tr>
            </tbody>
        </table>
</form>
    </body>
</html>

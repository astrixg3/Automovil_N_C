

<%@page import="modelo.Producto"%>
<%@page import="controlador.MantenedorProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>vehiculos</title>
    </head>
    <body>
        <%!String usu;%>
        <%
            try {
                usu = request.getSession().getAttribute("usuario").toString();
                if (usu == null) {
                    response.sendRedirect("index.jsp");
                }
            } catch (NullPointerException ex) {
                response.sendRedirect("index.jsp");
            }
        %>
        <h1>bienvenido <%=usu%></h1>
        <form action="ServletLogin">
            <input type="submit" name="btnIngresar" value="Salir"/>
        </form>

        <form action="ServletMantenedor">
            <table border="1">
                <tbody>
                    
               
<html xmlns="imagenes/fondo.png">
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
<img src="imagenes/fondo.png" width="580" height="390" />
</body>
</html>

                    <tr>
                        <td>modelo</td>
                        <td><input type="text" name="txtModelo" required="" placeholder="ingresa modelo"/></td>
                    </tr>
                    <tr>
                        <td>Precio</td>
                        <td><input type="number" min="0" name="txtPrecio" required="" placeholder="ingresa el precio"/></td>
                    </tr>
                    <tr>
                        <td>numchasis</td>
                        <td><input type="text" name="txtNumchasis" required="" placeholder="ingresa numero de chasis"/></td>
                    </tr
                    <tr>
                        <td>Cantidad</td>
                        <td><input type="number" min="1" name="txtCantidad" required="" placeholder="ingrese Cantidad"/></td>
                    </tr>
                    <tr>
                        <td>fecha</td>
                        <td><input type="date" name="txtFecha"/></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" name="btnEnviar" value="Agregar"/>

            <% try {
                    MantenedorProducto mantePro = (MantenedorProducto) request.getSession().getAttribute("mante");
                    if (mantePro == null) {
                        mantePro = new MantenedorProducto();
                        request.getSession().setAttribute("mante", mantePro);
                    }
            %>
            <select name="cbxCodigo">
                <%
                    for (Producto tmp : mantePro.devolver()) {
                %>
                <option value="<%=tmp.getCodigo()%>"><%=tmp.getCodigo()%></option>
                <%
                    }

                %>
            </select>
            <%                } catch (Exception ex) {

                }
            %>
           
            <input type="submit" name="btnEnviar" value="Modificar"/>
            <input type="submit" value="ImprimirBoleta" name="btnEnviar" id="btnEnviar" />

        </form>
        <form action="ServletMantenedor">
            <input type="submit" name="btnEnviar" value="Mostrar"/>
        </form>
        <form action="modelos.jsp">
            <input type="submit" name="btnEnviar" value="modelos">   
            <br>
        </form>
            </body>
            </html>














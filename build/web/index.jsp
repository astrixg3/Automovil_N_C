<%-- 
    Document   : Home
    Created on : 28-may-2017, 20:31:28
    Author     : cristianooliveira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Menu Desplegable</title>
  <style type="text/css">
   
   * {
    margin:0px;
    padding:0px;
   }
   
   #header {
    margin:auto;
    width:500px;
    font-family:Arial, Helvetica, sans-serif;
   }
   
   ul, ol {
    list-style:none;
   }
   
   .nav > li {
    float:left;
   }
   
   .nav li a {
    background-color:#000;
    color:#fff;
    text-decoration:none;
    padding:10px 12px;
    display:block;
   }
   
   .nav li a:hover {
    background-color:#434343;
   }
   
   .nav li ul {
    display:none;
    position:absolute;
    min-width:140px;
   }
   
   .nav li:hover > ul {
    display:block;
   }
   
   .nav li ul li {
    position:relative;
   }
   
   .nav li ul li ul {
    right:-140px;
    top:0px;
   }
   
  </style>
 </head>
 <body>
  <div id="header">
   <ul class="nav">
    <li><a href="/Automovil_N_C/index.jsp">Inicio</a></li>
    <li><a href="/Automovil_N_C/modelos.jsp">Modelos</a>
     <ul>
      <li><a href="">Hatchback</a></li>
      <li><a href="">Sedan</a></li>
      <li><a href="">Deportivos</a></li>
      <li><a href="">SUV</a>
       <ul>
        <li><a href="">Submenu1</a></li>
        <li><a href="">Submenu2</a></li>
        <li><a href="">Submenu3</a></li>
        <li><a href="">Submenu4</a></li>
       </ul>
      </li>
     </ul>
    </li>
    <li><a href="">Development Team</a></li>
    <li><a href="/Automovil_N_C/Contacto/eMail.jsp">Contacto</a></li>
    <li><a href="/Automovil_N_C/Login.jsp">Intranet</a></li>
   </ul>
  </div>
</html>

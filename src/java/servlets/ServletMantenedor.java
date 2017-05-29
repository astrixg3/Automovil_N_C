/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controlador.MantenedorProducto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Producto;

/**
 *
 * @author PabloNote
 */
@WebServlet(name = "ServletMantenedor", urlPatterns = {"/ServletMantenedor"})
public class ServletMantenedor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try {
                String usuario = request.getSession().getAttribute("usuario").toString();
                if (usuario != null) {
                    String opcion = request.getParameter("btnEnviar");

                    if (opcion.equals("Agregar")) {

                        MantenedorProducto mantePro = (MantenedorProducto) request.getSession().getAttribute("mante");
                        if (mantePro == null) {
                            mantePro = new MantenedorProducto();
                            request.getSession().setAttribute("mante", mantePro);
                        }
                        String nombre = request.getParameter("txtModelo");
                        String precio = request.getParameter("txtPrecio");
                        String talla = request.getParameter("txtNumchasis");
                        String cantidad = request.getParameter("txtCantidad");
                        String fecha = request.getParameter("txtFecha");

                        Producto productito = new Producto(nombre, fecha,
                                talla, Integer.parseInt(precio), Integer.parseInt(cantidad));
                        int resultado = mantePro.agregar(productito);
                        if (resultado == 1) {
                            request.getSession().setAttribute("mante", mantePro);
                            out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head>");
                            out.println("<title>Accion Agregar</title>");
                            out.println("</head>");
                            out.println("<body>");
                            out.println("<h1>Se Agrego!!!</h1>");
                            out.println("</body>");
                            out.println("</html>");

                            out.println("<center><form action=\"index.jsp\">\n"
                                    + "            <input type=\"submit\" value=\"Cerrar Sesión\" name=\"entrar\" id=\"login\"/>\n"
                                    + "        </form></center> ");
                            out.println("<center><form action=\"mantenedor.jsp\">\n"
                                    + "            <input type=\"submit\" value=\"volver\" name=\"volver\" entrar=\"login\"/>\n"
                                    + "        </form></center> ");

                        } else if (resultado == 2) {
                            out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head>");
                            out.println("<title>Accion Agregar</title>");
                            out.println("</head>");
                            out.println("<body>");
                            out.println("<h1>Problemas al generar el codigo!!!</h1>");
                            out.println("</body>");
                            out.println("</html>");
                        } else {
                            out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head>");
                            out.println("<title>Accion Agregar</title>");
                            out.println("</head>");
                            out.println("<body>");
                            out.println("<h1>Problemas al agregar, comuniquese con el admin!!!</h1>");
                            out.println("</body>");
                            out.println("</html>");
                        }

                    } else if (opcion.equals("Mostrar")) {
                        MantenedorProducto mantePro = (MantenedorProducto) request.getSession().getAttribute("mante");
                        if (mantePro == null) {
                            mantePro = new MantenedorProducto();
                            request.getSession().setAttribute("mante", mantePro);
                        }
                        out.println("<center><form action=\"index.jsp\">\n"
                                + "            <input type=\"submit\" value=\"Cerrar Sesión\" name=\"entrar\" id=\"login\"/>\n"
                                + "        </form></center> ");
                        out.println("<center><form action=\"mantenedor.jsp\">\n"
                                + "            <input type=\"submit\" value=\"volver\" name=\"volver\" entrar=\"login\"/>\n"
                                + "        </form></center> ");
                        out.println("<!DOCTYPE html>");
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Mostrar</title>");
                        out.println("</head>");
                        out.println("<body>");
                        for (Producto tmp : mantePro.devolver()) {

                            out.println("<h1>Producto</h1>");
                            out.println("<h3>Codigo " + tmp.getCodigo() + "</h3>");
                            out.println("<h3>Nombre " + tmp.getNombre() + "</h3>");
                            out.println("<h3>Talla " + tmp.getTalla() + "</h3>");
                            out.println("<h3>Cantidad " + tmp.getCantidad() + "</h3>");
                            out.println("<h3>Precio " + tmp.getPrecio() + "</h3>");
                            out.println("<h3>Fecha " + tmp.getFecha() + "</h3>");
                            out.println("<br>");

                        }
                        out.println("</body>");
                        out.println("</html>");

                    } else if (opcion.equals("Modificar")) {
                        MantenedorProducto mantePro = (MantenedorProducto) request.getSession().getAttribute("mante");
                        if (mantePro == null) {
                            mantePro = new MantenedorProducto();
                            request.getSession().setAttribute("mante", mantePro);
                        }
                        String nombre = request.getParameter("txtCodigo");
                        String precio = request.getParameter("txtPrecio");
                        String talla = request.getParameter("txtNumchasis");
                        String cantidad = request.getParameter("txtCantidad");
                        String fecha = request.getParameter("txtFecha");

                        Producto productito = new Producto(nombre, fecha,
                                talla, Integer.parseInt(precio), Integer.parseInt(cantidad));
                        String codigo = request.getParameter("cbxCodigo");
                        productito.setCodigo(codigo);
                        int resultado = mantePro.modificar(productito);
                        if (resultado == 1) {
                            request.getSession().setAttribute("mante", mantePro);
                            out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head>");
                            out.println("<title>Accion Modificar</title>");
                            out.println("</head>");
                            out.println("<body>");
                            out.println("<h1>Se Modifico!!!</h1>");
                            out.println("</body>");
                            out.println("</html>");

                            out.println("<center><form action=\"index.jsp\">\n"
                                    + "            <input type=\"submit\" value=\"Cerrar Sesión\" name=\"entrar\" id=\"login\"/>\n"
                                    + "        </form></center> ");
                            out.println("<center><form action=\"mantenedor.jsp\">\n"
                                    + "            <input type=\"submit\" value=\"volver\" name=\"volver\" entrar=\"login\"/>\n"
                                    + "        </form></center> ");

                        } else {
                            out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head>");
                            out.println("<title>Accion Modificar</title>");
                            out.println("</head>");
                            out.println("<body>");
                            out.println("<h1>Problemas al modificar, comuniquese con el admin!!!</h1>");
                            out.println("</body>");
                            out.println("</html>");
                        }
                    }
                    if (opcion.equals("ImprimirBoleta")) {
                        MantenedorProducto mantePro = (MantenedorProducto) request.getSession().getAttribute("mante");
                        if (mantePro == null) {
                            mantePro = new MantenedorProducto();
                            request.getSession().setAttribute("mante", mantePro);
                        }
                        out.println("<!DOCTYPE html>");
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Boleta</title>");
                        out.println("<div id=\"ContenedorTitulos\">");
                        out.println("</head>");
                        out.println("<body>");

                        out.println("</div>");
                        for (Producto tmp : mantePro.devolver()) {
                            out.println("<div id=\"ContenedorMostrar\">");
                            out.println("<font color=\"black\">");
                            out.println("<center>");
                            out.println("<h3>modelo: " + tmp.getNombre() + " codigo: " + tmp.getCodigo() + " n° chasis: " + tmp.getTalla() + " precio: " + tmp.getPrecio() + "</h3>");

                            out.println("</div>");
                            out.println("</center>");
                        }
                        out.println("</body>");
                        out.println("</html>");

                        out.println("<center><form action=\"index.jsp\">\n"
                                + "            <input type=\"submit\" value=\"Cerrar Sesión\" name=\"entrar\" id=\"login\"/>\n"
                                + "        </form></center> ");
                        out.println("<center><form action=\"mantenedor.jsp\">\n"
                                + "            <input type=\"submit\" value=\"volver\" name=\"volver\" entrar=\"login\"/>\n"
                                + "        </form></center> ");
                    }

                } else {
                    request.getSession().setAttribute("error", "error en la variable sesion");
                    response.sendRedirect("index.jsp");
                }
            } catch (NullPointerException ex) {
                request.getSession().setAttribute("error", "error en la variable sesion");
                response.sendRedirect("index.jsp");
            }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletMantenedor</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletMantenedor at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

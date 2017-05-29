package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String error;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Honda Chile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <html xmlns=\"imagenes/logohonda2.png\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Centrado de imagen - psdahtmlpasoapaso.com</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("img {\n");
      out.write("width: 580px;\n");
      out.write("height: 390px;\n");
      out.write("margin-top: -195px;\n");
      out.write("margin-left: -290px;\n");
      out.write("left: 50%;\n");
      out.write("top: 50%;\n");
      out.write("position: absolute;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write(" \n");
      out.write("<body>\n");
      out.write("<img src=\"imagenes/logohonda2.png\" width=\"580\" height=\"390\" />\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            try
            {
            String error = request.getSession().getAttribute("error").toString();
            
            if(error!=null)
            {
            
      out.write("\n");
      out.write("        <h1>welcome!! ");
      out.print(error);
      out.write("</h1>\n");
      out.write("        ");

            }
            else
            {
        
      out.write("\n");
      out.write("        <h1>welcome!!</h1>\n");
      out.write("        ");

            }
            }
catch(NullPointerException ex)
{

      out.write("\n");
      out.write("        <h1>welcome!!</h1>\n");
      out.write("        ");

}
            
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"ServletLogin\" method=\"POST\">\n");
      out.write("        \n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Usuario</th>\n");
      out.write("                    <th>Contraseña</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"btnUser\" placeholder=\"Ingresar usuario\" required=\"\"/></td>\n");
      out.write("                    <td><input type=\"password\" name=\"txtPass\" placeholder=\"Ingrese contraseña\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"btnIngresar\" value=\"Ingresar\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <title>Menu Desplegable</title>\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("   \n");
      out.write("   * {\n");
      out.write("    margin:0px;\n");
      out.write("    padding:0px;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   #header {\n");
      out.write("    margin:auto;\n");
      out.write("    width:500px;\n");
      out.write("    font-family:Arial, Helvetica, sans-serif;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   ul, ol {\n");
      out.write("    list-style:none;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   .nav > li {\n");
      out.write("    float:left;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   .nav li a {\n");
      out.write("    background-color:#000;\n");
      out.write("    color:#fff;\n");
      out.write("    text-decoration:none;\n");
      out.write("    padding:10px 12px;\n");
      out.write("    display:block;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   .nav li a:hover {\n");
      out.write("    background-color:#434343;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   .nav li ul {\n");
      out.write("    display:none;\n");
      out.write("    position:absolute;\n");
      out.write("    min-width:140px;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   .nav li:hover > ul {\n");
      out.write("    display:block;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   .nav li ul li {\n");
      out.write("    position:relative;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   .nav li ul li ul {\n");
      out.write("    right:-140px;\n");
      out.write("    top:0px;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("  </style>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write("  <div id=\"header\">\n");
      out.write("   <ul class=\"nav\">\n");
      out.write("    <li><a href=\"/Automovil_N_C/Home.jsp\">Inicio</a></li>\n");
      out.write("    <li><a href=\"/Automovil_N_C/modelos.jsp\">Modelos</a>\n");
      out.write("     <ul>\n");
      out.write("      <li><a href=\"\">Hatchback</a></li>\n");
      out.write("      <li><a href=\"\">Sedan</a></li>\n");
      out.write("      <li><a href=\"\">Deportivos</a></li>\n");
      out.write("      <li><a href=\"\">SUV</a>\n");
      out.write("       <ul>\n");
      out.write("        <li><a href=\"\">Submenu1</a></li>\n");
      out.write("        <li><a href=\"\">Submenu2</a></li>\n");
      out.write("        <li><a href=\"\">Submenu3</a></li>\n");
      out.write("        <li><a href=\"\">Submenu4</a></li>\n");
      out.write("       </ul>\n");
      out.write("      </li>\n");
      out.write("     </ul>\n");
      out.write("    </li>\n");
      out.write("    <li><a href=\"\">Acerca de</a>\n");
      out.write("      <ul>\n");
      out.write("      <li><a href=\"\">Submenu1</a></li>\n");
      out.write("      <li><a href=\"\">Submenu2</a></li>\n");
      out.write("      <li><a href=\"\">Submenu3</a></li>\n");
      out.write("      <li><a href=\"\">Submenu4</a></li>\n");
      out.write("     </ul>\n");
      out.write("    </li>\n");
      out.write("    <li><a href=\"\">Contacto</a></li>\n");
      out.write("   </ul>\n");
      out.write("  </div>\n");
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

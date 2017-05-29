package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eMail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<form action=\"http://formmail.kinghost.net/formmail.cgi\" method=\"POST\">\n");
      out.write("   <input type=\"hidden\" name=\"recipient\" value=\"nome@seudominio.com.br\"> <input type=\"hidden\" name=\"redirect\" value=\"http://www.seudominio.com/ok.html\"> <input type=\"hidden\" name=\"subject\" value=\"teste de assunto\"> <input type=\"hidden\" name=\"email\" value=\"seu email@seudominio.com.br\">\n");
      out.write("   <p> Nome:<br /> <input type=\"text\" size=\"30\" name=\"nome\"> </p>\n");
      out.write("   <p> E-mail:<br /> <input type=\"text\" size=\"30\" name=\"replyto\"> </p>\n");
      out.write("   <p> Comentários:<br /> <input type=\"text\" size=\"35\" name=\"Comentarios\"> </p>\n");
      out.write("   <p> <input type=\"submit\" name=\"BTEnvia\" value=\"Enviar\"> <input type=\"reset\" name=\"BTApaga\" value=\"Apagar\"> </p></form>\n");
      out.write("\n");
      out.write("<span style=\"line-height: 1.5; font-family: Georgia, 'Times New Roman', 'Bitstream Charter', Times, serif;\">[/showhide]</span>\n");
      out.write("\n");
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

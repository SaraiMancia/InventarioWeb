package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexx_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/css-js.jspf");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("    <meta name=\"generator\" content=\"Hugo 0.98.0\">\r\n");
      out.write("    <title>Signin Template Â· Bootstrap v5.2</title>\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/estilo-base.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap-theme.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap-theme.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"bootstrap/js/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.2/examples/sign-in/\">\r\n");
      out.write("   <link href=\"../assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">-->\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("      .bd-placeholder-img {\r\n");
      out.write("        font-size: 1.125rem;\r\n");
      out.write("        text-anchor: middle;\r\n");
      out.write("        -webkit-user-select: none;\r\n");
      out.write("        -moz-user-select: none;\r\n");
      out.write("        user-select: none;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      @media (min-width: 768px) {\r\n");
      out.write("        .bd-placeholder-img-lg {\r\n");
      out.write("          font-size: 3.5rem;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .b-example-divider {\r\n");
      out.write("        height: 3rem;\r\n");
      out.write("        background-color: rgba(0, 0, 0, .1);\r\n");
      out.write("        border: solid rgba(0, 0, 0, .15);\r\n");
      out.write("        border-width: 1px 0;\r\n");
      out.write("        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .b-example-vr {\r\n");
      out.write("        flex-shrink: 0;\r\n");
      out.write("        width: 1.5rem;\r\n");
      out.write("        height: 100vh;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .bi {\r\n");
      out.write("        vertical-align: -.125em;\r\n");
      out.write("        fill: currentColor;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .nav-scroller {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        z-index: 2;\r\n");
      out.write("        height: 2.75rem;\r\n");
      out.write("        overflow-y: hidden;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .nav-scroller .nav {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-wrap: nowrap;\r\n");
      out.write("        padding-bottom: 1rem;\r\n");
      out.write("        margin-top: -1px;\r\n");
      out.write("        overflow-x: auto;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        white-space: nowrap;\r\n");
      out.write("        -webkit-overflow-scrolling: touch;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"css/signin.css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"text-center\">\r\n");
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("<main class=\"form-signin w-100 m-auto\">\r\n");
      out.write("  <form>\r\n");
      out.write("    <img class=\"mb-4\" src=\"assets/img/login.png\" alt=\"\" width=\"72\" height=\"57\">\r\n");
      out.write("    <h1 class=\"h3 mb-3 fw-normal\">Inicio</h1>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"form-floating\">\r\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"floatingInput\" placeholder=\"name@example.com\">\r\n");
      out.write("      <label for=\"floatingInput\">Tu correo</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-floating\">\r\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"floatingPassword\" placeholder=\"Password\">\r\n");
      out.write("      <label for=\"floatingPassword\">Tu clave</label>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--<div class=\"checkbox mb-3\">\r\n");
      out.write("      <label>\r\n");
      out.write("        <input type=\"checkbox\" value=\"remember-me\"> Remember me\r\n");
      out.write("      </label>\r\n");
      out.write("    </div>-->\r\n");
      out.write("    <button class=\"w-100 btn btn-lg btn-primary\" type=\"submit\">Entrar</button>\r\n");
      out.write("    <p class=\"mt-5 mb-3 text-muted\">&copy; 2022</p>\r\n");
      out.write("  </form>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <title>Sign-in Inventario</title>\r\n");
      out.write("    <!--<link rel=\"icon\" href=\"assets/img/favicon3.ico\" type=\"image/x-icon\">-->\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <!-- <link href=\"../assets/dist/css/bootstrap.css\" rel=\"stylesheet\">-->\r\n");
      out.write("    <!--<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">-->\r\n");
      out.write("    ");
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
<<<<<<< Updated upstream
      out.write("    <style>\r\n");
      out.write("      .bd-placeholder-img {\r\n");
      out.write("        font-size: 1.125rem;\r\n");
      out.write("        text-anchor: middle;\r\n");
      out.write("        -webkit-user-select: none;\r\n");
      out.write("        -moz-user-select: none;\r\n");
      out.write("        -ms-user-select: none;\r\n");
      out.write("        user-select: none;\r\n");
      out.write("      }\r\n");
=======
      out.write("    </head>\r\n");
      out.write("    <body background=\"assets/imgs/page.png\">\r\n");
      out.write("        ");
>>>>>>> Stashed changes
      out.write("\r\n");
      out.write("      @media (min-width: 768px) {\r\n");
      out.write("        .bd-placeholder-img-lg {\r\n");
      out.write("          font-size: 3.5rem;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"css/signin.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"text-center\">\r\n");
      out.write("      <main class=\"form-signin w-100 m-auto\">\r\n");
      out.write("      <form class=\"form-signin\" action=\"sesion\" method=\"POST\">\r\n");
      out.write("      <img class=\"mb-4\" src=\"assets/img/login.png\" alt=\"\" width=\"72\" height=\"72\">\r\n");
      out.write("      <h1 class=\"h3 mb-3 font-weight-normal\">Iniciar Sesión</h1>\r\n");
      out.write("      <label for=\"inputEmail\" class=\"sr-only\">Email address</label>\r\n");
      out.write("      <input type=\"email\" name=\"txtEmail\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\r\n");
      out.write("      <label for=\"inputPassword\" class=\"sr-only\">Password</label>\r\n");
      out.write("      <input type=\"password\" name=\"txtPassword\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("      <div class=\"checkbox mb-3\">\r\n");
      out.write("        <label>\r\n");
      out.write("          <!--<input type=\"checkbox\" value=\"remember-me\"> Remember me -->\r\n");
      out.write("          <a href=\"#\" title=\"¿No tienes cuenta?\">¿No tienes cuenta? | </a>\r\n");
      out.write("          <a href=\"#\" title=\"Olvide mi contraseña\">Olvidé mi contraseña</a>\r\n");
      out.write("        </label>\r\n");
      out.write("      </div>\r\n");
      out.write("      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Ingresar</button>\r\n");
      out.write("      <p class=\"mt-5 mb-3 text-muted\">MEGATEC-ZACATECOLUCA &copy; 2022</p>\r\n");
      out.write("    </form>\r\n");
      out.write("          </main>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

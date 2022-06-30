package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InicioSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"icon\" href=\"./image/cuenta.png\">\r\n");
      out.write("        <title>Inicio de sesion</title>\r\n");
      out.write("        <link href=\"./css/estilo.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body >\r\n");
      out.write("        <form action=\"sesionA.do\" method=\"post\">\r\n");
      out.write("            <section class=\"vh-100\" background=\"\">\r\n");
      out.write("                <div class=\"container py-5 h-100\" >\r\n");
      out.write("                    <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("                        <div class=\"col-12 col-md-8 col-lg-6 col-xl-5\">\r\n");
      out.write("                            <div class=\"card shadow-2-strong\" style=\"border-radius: 1rem; background: rgba(0,0,0,0.3);\">\r\n");
      out.write("                                <div class=\"card-body p-5 text-center\">\r\n");
      out.write("\r\n");
      out.write("                                    <h3 class=\"\">\r\n");
      out.write("                                        <img class=\"imgusuario\" src=\"./image/usuario.png\"><br>\r\n");
      out.write("                                        Iniciar sesión\r\n");
      out.write("                                        <hr class=\"hrh\">\r\n");
      out.write("                                    </h3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                                        <input name=\"txtEmail\" style=\"background: transparent;border: 1; color: white;\" type=\"email\" id=\"typeEmailX-2\" class=\"form-control form-control-lg\" placeholder=\"Ingrese su Email\"/>\r\n");
      out.write("                                        <label class=\"form-label\" for=\"typeEmailX-2\">Correo</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                                        <input  name=\"txtPassword\" id=\"inputPassword\" style=\"background: transparent;border: 1; color: white;\" type=\"password\" id=\"typePasswordX-2\" class=\"form-control form-control-lg\" placeholder=\"Ingrese su contraseña\"/>\r\n");
      out.write("                                        <label class=\"form-label\" for=\"typePasswordX-2\">Contraseña</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Checkbox -->\r\n");
      out.write("                                    <div class=\"form-check d-flex justify-content-start mb-4\">\r\n");
      out.write("                                        <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"form1Example3\" />\r\n");
      out.write("                                        <label class=\"form-check-label\" for=\"form1Example3\"> Remember password </label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <button  name=\"btn-login\" class=\"btn btn-primary  btn-block\" type=\"submit\">Iniciar sesión</button>\r\n");
      out.write("\r\n");
      out.write("                                    <hr class=\"my-4\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col\">\r\n");
      out.write("                                        <!-- Simple link -->\r\n");
      out.write("                                        <a style=\"text-decoration: none;\" href=\"#!\" >Olvid&oacute; su contraseña?</a>\r\n");
      out.write("                                        <a style=\"text-decoration: none;\" href=\"RegistrarUsuario.jsp\"> No tienes cuenta?</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
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

package org.apache.jsp.Vistas_002dProducto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Vistas-Producto/../WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/Vistas-Producto/../WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/Vistas-Producto/../WEB-INF/Vistas-Parciales/pie.jspf");
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
      out.write("\r\n");
      out.write("\r\n");
      Model.Producto Producto = null;
      synchronized (session) {
        Producto = (Model.Producto) _jspx_page_context.getAttribute("Producto", PageContext.SESSION_SCOPE);
        if (Producto == null){
          Producto = new Model.Producto();
          _jspx_page_context.setAttribute("Producto", Producto, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title> Control de inventario</title>\r\n");
      out.write("        ");
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
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function regresar(url){\r\n");
      out.write("                location.href = url;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<di>\r\n");
      out.write("    <div class = \"encabezado\">\r\n");
      out.write("        Sistema de Control de Inventario\r\n");
      out.write("        <a href=\"Index\" class=\"btn btn-primary btn-sm\" role=\"button\">Inicio</a>\r\n");
      out.write("        <a href=\"categoriasS.do?opcion=listar\" class=\"btn btn-primary btn-sm\" role=\"button\">Categorias</a>\r\n");
      out.write("         <a href=\"ProductosS.do?opcion=listar\" class=\"btn btn-primary btn-sm\" role=\"button\">Producto</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"contenido\">\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <h3>Mantenimiento Productos</h3>\r\n");
      out.write("             \r\n");
      out.write("       <div class=\"card text-center\" style=\"width: 18rem;\">\r\n");
      out.write("  \r\n");
      out.write("  <h5 class=\"card-title\"></h5>\r\n");
      out.write("    <p class=\"card-text\">   \r\n");
      out.write("       <p>  Por favor introduce la información:</p> \r\n");
      out.write("              \r\n");
      out.write("           \r\n");
      out.write("              \r\n");
      out.write("                   <td align=\"right\">   Id productos: </td>              \r\n");
      out.write("                   <td>      <input type=\"hidden\" name=\"id_producto\" value=\"");
      out.print( Producto.getId_producto() );
      out.write("\"></td> <br><br>          \r\n");
      out.write("                           \r\n");
      out.write("                   <td align=\"right\"> Nombre: </td>                  \r\n");
      out.write("                   <td>    <input type=\"text\" class=\"form-control\" name=\"txtNom_Producto\" value=\"");
      out.print( Producto.getNom_producto() );
      out.write("\"></td>  <br><br>         \r\n");
      out.write("                   <td align=\"right\"> Stock: </td>                  \r\n");
      out.write("                   <td>    <input type=\"text\" class=\"form-control\" name=\"txtStock\" value=\"");
      out.print( Producto.getStock() );
      out.write("\"></td>  <br><br>\r\n");
      out.write("                   <td align=\"right\"> Precio: </td>                  \r\n");
      out.write("                   <td>    <input type=\"text\" class=\"form-control\" name=\"txtPrecio\" value=\"");
      out.print( Producto.getPrecio() );
      out.write("\"></td>  <br><br>\r\n");
      out.write("                   <td align=\"right\"> UnidadMedida: </td>                  \r\n");
      out.write("                   <td>    <input type=\"text\" class=\"form-control\" name=\"txtunidadMedida\" value=\"");
      out.print( Producto.getUnidad_de_medida() );
      out.write("\"></td>  <br><br>\r\n");
      out.write("                   <td align=\"right\"> Estado </td>                  \r\n");
      out.write("                   <td>    <input type=\"text\" class=\"form-control\" name=\"txtEstado\" value=\"");
      out.print( Producto.getEstado_producto() );
      out.write("\"\r\n");
      out.write("                   <td align=\"right\"> Categoria: </td>                  \r\n");
      out.write("                   <td>    <input type=\"text\" class=\"form-control\" name=\"txt_Categoria\" value=\"");
      out.print( Producto.getCategoria() );
      out.write("\"></td>  <br><br>\r\n");
      out.write("         \r\n");
      out.write("               <input type=\"submit\" class=\"btn btn-success btn-sm\" name=\"btnGuardar\" value=\"Guardar\"/>\r\n");
      out.write("                <input type=\"button\" class=\"btn btn-danger btn-sm\" onclick=\"regresar('");
      out.print( request.getContextPath() );
      out.write("/ProductosS.do?opcion=listar')\"\r\n");
      out.write("                       name=\"btnRegresar\" value=\"Regresar\" />    \r\n");
      out.write("         \r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"pie\">\r\n");
      out.write("    &COPY;  Alexa A\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("    </head>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

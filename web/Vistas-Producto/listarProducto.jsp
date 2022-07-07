<%@page import="Model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import = "Model.Producto" %>

<jsp:useBean id = "lista" scope="session" class="java.util.List" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <center>
        <body background="assets/imgs/2.jpg">
            <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
            <div style="width: 800px;">
                <a href="<%= request.getContextPath()%>/ProductosS.do?opcion=crear" class="btn btn-success btn-sm glyphicon glyphicom-pencil" role="button"> Nuevo producto</a>
                   <a href="<%= request.getContextPath()%>/Vistas-s-r/reporteproducto.jsp" class="btn btn-success btn-sm glyphicon glyphicom-pencil"> Reporte de Categoria</a>
                <h3>Listado de Produtos Registrados</h3>
                <table class="table table-dark">
                    <tr>
                        <th>ID</th><th>NOMBRE</th><th>STOCK</th><th>PRECIO</th><th>UNIDAD DE MEDIDA</th><th>ESTADO</th><th>CATEGORIA</th><th>ACCION</th>
                    </tr>
                    <%
                        for (int i = 0; i < lista.size(); i++) {
                            Producto producto = new Producto();
                            producto = (Producto) lista.get(i);
                    %>
                    <tr>
                        <td><%= producto.getId_producto()%></td>
                        <td><%= producto.getNom_producto()%></td>
                        <td><%= producto.getStock()%></td>
                        <td><%= producto.getPrecio()%></td>
                        <td><%= producto.getUnidad_de_medida()%></td>
                        <td><%= producto.getEstado_producto()%></td>
                        <td><%= producto.getCategoria()%></td>
                        <td>
                           <a href="ProductosS.do?opcion=editar&&id=<%= producto.getId_producto()%>&&nombre=<%= producto.getNom_producto()%>&&stock=<%= producto.getStock()%>&&precio=<%= producto.getPrecio()%>&&unidaddemedida=<%= producto.getUnidad_de_medida()%>&&estadoproducto=<%= producto.getEstado_producto()%>" class="btn btn-info btn-sm glyphicon glyphicon-edit"  role="button"> Editar</a>
                               <a href="ProductosS.do?opcion=eliminar&&id=<%= producto.getId_producto()%>&&nombre=<%= producto.getNom_producto()%>&&stock=<%= producto.getStock()%>&&precio=<%= producto.getPrecio()%>&&unidaddemedida=<%= producto.getUnidad_de_medida()%>&&estadoproducto=<%= producto.getEstado_producto()%>" class="btn btn-danger btn-sm glyphicon glyphicon-remove"  role="button"> Eliminar</a>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </table>
            </div>
            <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>

        </body>
    </center>
</html>
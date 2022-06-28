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
    <body>
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        
        <div style="width: 600px;">
            <a href="<%= request.getContextPath() %>/ProductosS.do?opcion=crear" class="btn btn-success btn-sm glyphicon glyphicom-pencil" role="button"> Nuevo producto</a>
            <h3>Listado de Produtos Registrados</h3>
            <table class="table table-striped">
                <tr>
                    <th>ID</th><th>NOMBRE</th><th>CATEGORIA ID</th><th>STOCK</th><th>PRECIO</th><th>UNIDAD DE MEDIDA</th><th>ESTADO</th><th>ACCION</th>
                </tr>
                <%
                    for(int i =0 ; i < lista.size(); i++){
                        Producto producto = new Producto();
                        producto = (Producto)lista.get(i);
                %>
                <tr>
                    <td><%= producto.getId_producto() %></td>
                    <td><%= producto.getNom_producto() %></td>
                    <td><%= producto.getCategoria_id() %></td>
                    <td><%= producto.getStock() %></td>
                    <td><%= producto.getPrecio() %></td>
                    <td><%= producto.getUnidadMedida() %></td>
                    <td><%= producto.getEstado() %></td>
                    <td><%= producto.getCategoria() %></td>
                    <td>
                        <a href="ProductoS.do?opcion=editar&&id=<%= producto.getId_producto() %>&&nombre=<%= producto.getNom_producto() %>&&categoria=<%= producto.getCategoria_id()
                        %>&&stock=<%= producto.getStock() %>&&precio=<%= producto.getPrecio() %>&&unidad de medida=<%= producto.getUnidadMedida() %>&&estado producto=<%= producto.getEstado() %>" class="btn btn-info btn-sm glyphicon glyphicon-edit"  role="button"> Editar</a>
                        <a href="ProductoS.do?opcion=eliminar&&id=<%= producto.getId_producto() %>&&nombre=<%= producto.getNom_producto() %>&&categoria=<%= producto.getCategoria_id()
                        %>&&stock=<%= producto.getStock() %>&&precio=<%= producto.getPrecio() %>&&unidad de medida=<%= producto.getUnidadMedida() %>&&estado producto=<%= producto.getEstado() %>" class="btn btn-danger btn-sm glyphicon glyphicon-remove"  role="button"> Eliminar</a>
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
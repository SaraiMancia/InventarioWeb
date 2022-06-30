<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ////request.getContextPath()
    String id_cat = request.getParameter("id");
    String nombre_cat = request.getParameter("nombre");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Baja Categorias</title>
         
         
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <center>
    <body background="assets/imgs/fondo4.jpg">
         <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <div class="col-auto bg-gray p-5 text-center">
        
            
            <h4>¿ Desea Eliminar el Registro?</h4><br>
            <center>  <img class="mb-4" src="assets/imgs/basurero.jpg" alt="" width="150" height="200"></center>
            <h5>ID Categoria: <%= id_cat %></h5>
            <h5>Nombre Categoria: <%= nombre_cat %></h5>
        </div>
        
        <!---->
        
        <div class="d-grid gap-5 d-md-flex justify-content-md-center">
            <a href="eliminarCategoria.do?respuesta=yes&&id=<%= id_cat %>" class="btn btn-primary btn-lg" role="button"> Aceptar</a>
            <!--<a href="< //request.getContextPath() >" class="btn btn-secondary btn-lg" role="button">No / Cancelar</a>-->
            <a href="categoriasS.do?opcion=listar" class="btn btn-primary btn-lg" role="button"> Cancelar</a>
            
        </div>
        
        <div class="row justify-content-center">
        <div class="col-4 bg-white">
            &nbsp;
        </div>
        <div class="col-4 bg-white">
            &nbsp;
        </div>
      </div>
        
        
         <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
    </center>
</html>

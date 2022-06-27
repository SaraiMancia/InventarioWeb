<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   
    String id_producto = request.getParameter("id");
    String nom_producto = request.getParameter("nombre");
    String categoria_id = request.getParameter("cat_id");
    String stock = request.getParameter("Stock");
    String precio = request.getParameter("Precio");
    String unidadmedida = request.getParameter("unidadMedida");
    String estado = request.getParameter("Estado");
    String categoria = request.getParameter("Categoria");
    

 %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body class="m-0 row justify-content-center">
         <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
         <div class="col-auto bg-gray p-5 text-center">
        <h1 class='text-center'>Información de Categoria</h1>
        <form action="modificarCategoria.do" method="post">
        <div class="mb-3 row">
            <label for="staticEmail" class="col-sm-2 col-form-label">ID Categoria:</label>
            <div class="col-sm-10">
              <input type="text" value='<%= id_producto %>' name="id1" id="id1" readonly class="form-control-plaintext" id="staticEmail" placeholder="ID producto">
              <input type="hidden" value='<%= id_producto %>' name="id" id="id" readonly class="form-control-plaintext" id="staticEmail" >
            </div>
        </div>
            
        <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Nombre Categoria:</label>
          <div class="col-sm-10">
              <input type="text" value='<%= nom_producto %>' name="nombre" id="nombre" class="form-control" placeholder="Nombre producto" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Estado Categoria:</label>
          <div class="col-sm-10">
              <input type="text" value='<%= categoria_id %>' name="cat_id" id="categoria" class="form-control" placeholder="ID Categoria" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Estado Categoria:</label>
          <div class="col-sm-10">
              <input type="text" value='<%= stock %>' name="Stock" id="stock" class="form-control" placeholder="Stock" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Estado Categoria:</label>
          <div class="col-sm-10">
              <input type="text" value='<%= precio %>' name="Precio" id="precio" class="form-control" placeholder="Precio" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Estado Categoria:</label>
          <div class="col-sm-10">
              <input type="text" value='<%= unidadmedida%>' name="unidadMedida" id="unidadmedida" class="form-control" placeholder="unidadMedida" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Estado Categoria:</label>
          <div class="col-sm-10">
              <input type="text" value='<%= estado %>' name="Estado" id="estado" class="form-control" placeholder="Estado" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Estado Categoria:</label>
          <div class="col-sm-10">
              <input type="text" value='<%= categoria %>' name="Categoria" id="categoria" class="form-control" placeholder="Categoria" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <button type="submit" name="send" class="btn btn-success">Actualizar Producto</button>
          </div>
        </form>
          
          <%
            String dato = request.getParameter("aviso");
            if(dato!=null){
                //out.print("Registro Actualizado Correctamente");
                //System.out.println("End");
           %>
                   <div class="alert alert-success" role="alert">
                   Registro Actualizado Correctamente!!
                 </div>
           <%   
               }
           %>

        </div>
         <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>


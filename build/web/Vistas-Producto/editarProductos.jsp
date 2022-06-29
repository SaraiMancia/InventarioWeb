<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   
    String id_producto = request.getParameter("id");
    String nom_producto = request.getParameter("nombre");
    String stock = request.getParameter("stock");
    String precio = request.getParameter("precio");
    String unidadMedida = request.getParameter("unidaddemedida");
    String estado_p = request.getParameter("estadoproducto");
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
        <form action="modificarProducto.do" method="post">
        <div class="mb-3 row">
            <label for="staticEmail" class="col-sm-2 col-form-label">ID Categoria:</label>
            <div class="col-sm-10">
              <input type="text" value='<%= id_producto %>' name="id1" id="id1" readonly class="form-control-plaintext" id="staticEmail" placeholder="ID producto">
              <input type="hidden" value='<%= id_producto %>' name="id" id="id" readonly class="form-control-plaintext" id="staticEmail" >
            </div>
        </div>
            
        <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Nombre Producto:</label>
          <div class="col-sm-5">
              <input type="text" value='<%= nom_producto %>' name="nombre" id="nombre" class="form-control" placeholder="Nombre producto" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Stock:</label>
          <div class="col-sm-5">
              <input type="text" value='<%= stock %>' name="stk" id="stock" class="form-control" placeholder="stock" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Precio:</label>
          <div class="col-sm-5">
              <input type="text" value='<%= precio %>' name="Precio" id="precio" class="form-control" placeholder="precio" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Unidad de media:</label>
          <div class="col-sm-5">
              <input type="text" value='<%= unidadMedida %>' name="unidad" id="unidaddemedida" class="form-control" placeholder="unidad" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <label for="inputPassword" class="col-sm-2 col-form-label">Estado:</label>
          <div class="col-sm-5">
              <input type="text" value='<%= estado_p %>' name="estadopro" id="estadoproducto" class="form-control" placeholder="Estado" required="true">
          </div>
        </div>
          
          <div class="mb-3 row"
          <label for="inputPassword" class="col-sm-2 col-form-label">Estado Categoria:</label>
          <div class="col-sm-5">
              <input type="text" value='<%= categoria %>' name="Categoria" id="categoria" class="form-control" placeholder="Categoria" required="true">
          </div>
        </div>
          
          <div class="mb-3 row">
          <button type="submit" name="send" class="btn btn-success">Actualizar Producto</button>
           <input type="button" class="btn btn-danger btn-sm" onclick="regresar('<%= request.getContextPath() %>/ProductosS.do?opcion=listar')" name="btnRegresar" value="Regresar" />
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


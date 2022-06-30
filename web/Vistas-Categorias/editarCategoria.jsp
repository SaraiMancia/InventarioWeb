<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   
    String id_cat = request.getParameter("id");
    String nombre_cat = request.getParameter("nombre");
    String estado_cat = request.getParameter("estado");
    

 %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body class="m-0 row justify-content-center">
         <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
             <center>

        
     
       <div class="card text-center" style="width: 18rem;">
  <div class="card-body">
  <h5 class="card-title"></h5>
    <p class="card-text"> 
    <center> <h1 class='text-center'>Información de Categoria</h1> </center>
    <center><form action="modificarCategoria.do" method="post"></center>
            <center>  <img class="mb-4" src="assets/imgs/notas.jpg" alt="" width="150" height="200"></center>
        <div class="mb-3 row">
            <label for="staticEmail" class="col-sm-2 col-form-label">ID Categoria:</label><br><br>
            <div class="col-sm-10">
                
              <input type="text" value='<%= id_cat %>' name="id1" id="id1" readonly class="form-control-plaintext" id="staticEmail" placeholder="ID Categoria">
              <input type="hidden" value='<%= id_cat %>' name="id" id="id" readonly class="form-control-plaintext" id="staticEmail" >
            </div>
        </div>
            <center> <td align="right"> Nombre: </td> </center>                 
                   <td>    <input type="text" value='<%= nombre_cat %>' name="nombre" id="nombre" class="form-control" placeholder="Nombre Categoria" required="true"></td>  <br><br>         
                   <center> <td align="right"> Estado: </td>  </center>                
                      <td>      <input type="text" value='<%= estado_cat %>' name="estado" id="estado" class="form-control" placeholder="Estado Categoria" required="true"> </td> <br><br>          
                      
 
          <div class="mb-3 row">
          <button type="submit" name="send" class="btn btn-success">Actualizar Categoria</button>
          </div>  
       </form>  
 
  </div>
</div>

          
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

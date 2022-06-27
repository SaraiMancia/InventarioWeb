<%-- any content can be specified here e.g.: --%>
<%@ page  contentType="text/html" pageEncoding="UTF-8" %>

<jsp:useBean id="Categoria" scope="session" class="Model.Categoria"/>
<!DOCTYE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Control de inventario</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <script type="text/javascript">
            function regresar(url){
                location.href = url;
            }
        </script>
    </head>
    <body>
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        
        <h3>Mantenimiento Categorias</h3>
             
       <div class="card text-center" style="width: 18rem;">
  <div class="card-body">
  <h5 class="card-title"></h5>
    <p class="card-text"> <h2> Aqui se piden los datos </h2>    
       <p>  Por favor introduce la información:</p> 
          <form class="form-horizantal" id="frmCategoria" name="frmCategoria" action="<%= request.getContextPath()%>/categoriasS.do" method="post">    
           
              
                   <td align="right">   Id categoria: </td>              
                   <td>      <input type="hidden" name="id_categoria" value="<%= Categoria.getId_categoria() %>"></td> <br><br>          
                           
                   <td align="right"> Nombre: </td>                  
                   <td>    <input type="text" class="form-control" name="txtNomCategoria" value="<%= Categoria.getNom_categoria() %>"></td>  <br><br>         
                      <td align="right"> Estado: </td>                  
                      <td>    <input type="text" class="form-control" name="txtEstadoCategoria" value=""> </td> <br><br>          
                      
         
               <input type="submit" class="btn btn-success btn-sm" name="btnGuardar" value="Guardar"/>
                <input type="button" class="btn btn-danger btn-sm" onclick="regresar('<%= request.getContextPath() %>/categoriasS.do?opcion=listar')"
                       name="btnRegresar" value="Regresar" />    
       </form>  
 
  </div>
</div>
  
                <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
    </head>
</html>

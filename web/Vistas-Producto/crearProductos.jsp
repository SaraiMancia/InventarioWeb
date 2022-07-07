<%@ page  contentType="text/html" pageEncoding="UTF-8" %>

<jsp:useBean id="producto" scope="session" class="Model.Producto"/>
<!DOCTYE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Control de inventario</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <script type="text/javascript">
            function regresar(url) {
                location.href = url;
            }
        </script>
    </head>
    <center>
        <body background="assets/imgs/2.jpg">
            <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>

            <h3>Mantenimiento Productos</h3>

            <div class="card text-center" style="width: 30rem;">

                <h5 class="card-title"></h5>
                <p class="card-text">   
                <p>  Por favor introduce la información:</p> 
                <form class="form-horizantal" id="frmProducto" name="frmProducto" action="<%= request.getContextPath()%>/ProductosS.do" method="post">  


                    <td align="right">   Id productos: </td>              
                    <td>      <input type="hidden" name="id_producto" value="<%= producto.getId_producto()%>"></td> <br><br>          

                    <td align="right"> Nombre: </td>                  
                    <td>    <input type="text" class="form-control" name="txtNom_Producto" value=""></td>  <br><br>         
                    <td align="right"> Stock: </td>                  
                    <td>    <input type="text" class="form-control" name="txtStock" value=""></td>  <br><br>
                    <td align="right"> Precio: </td>                  
                    <td>    <input type="text" class="form-control" name="txtPrecio" value=""></td>  <br><br>
                    <td align="right"> UnidadMedida: </td>                  
                    <td>    <input type="text" class="form-control" name="txtunidadMedida" value=""></td>  <br><br>
                    <td align="right"> Estado </td>                  
                    <td>    <input type="text" class="form-control" name="txtEstado" value=""></td>  <br><br>
                        <%--<td align="right"> Categoria: </td>                  
                         <td>    <input type="text" class="form-control" name="txt_Categoria" value=""></td>  <br><br>--%>

                    <input type="submit" class="btn btn-success btn-sm" name="btnGuardar" value="Guardar"/>
                    <input type="button" class="btn btn-danger btn-sm" onclick="regresar('<%= request.getContextPath()%>/ProductosS.do?opcion=listar')"
                           name="btnRegresar" value="Regresar" />    

                </form>

            </div>

            <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
        </body>
    </center>
</html>
</head>
</html>

<%-- any content can be specified here e.g.: --%>
<%@ page  contentType="text/html" pageEncoding="UTF-8" %>

<jsp:useBean id="Categoria" scope="session" class="Model.Categoria"/>
<!DOCTYE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><strong>Control de inventario</strong></title>
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


            <div class="card text-center" style="width: 18rem;">
                <div class="forma">
                    <div class="card-body" >
                        <h5 class="card-title"></h5>
                        <p class="card-text"> 
                        <p> <center> Por favor introdusca la información:</p> </center>
                        <form  class="form-horizantal" id="frmCategoria" name="frmCategoria" action="<%= request.getContextPath()%>/categoriasS.do" method="post">    

                            <center>  <img class="mb-4" src="assets/imgs/ccc.png" alt="" width="150" height="150"></center>
                            <td align="right">   Id categoria: </td>              
                            <td>      <input type="hidden" name="id_categoria" value="<%= Categoria.getId_categoria()%>"></td> <br><br>          

                            <td align="right"> Nombre: </td>                  
                            <td>    <input type="text" class="form-control" name="txtNomCategoria" value="<%= Categoria.getNom_categoria()%>"></td>  <br><br>         
                            <td align="right"> Estado: </td>                  
                            <td>    <input type="text" class="form-control" name="txtEstadoCategoria" value=""> </td> <br><br>          


                            <input type="submit" class="btn btn-success btn-sm" name="btnGuardar" value="Guardar"/>
                            <input type="button" class="btn btn-danger btn-sm" onclick="regresar('<%= request.getContextPath()%>/categoriasS.do?opcion=listar')"
                                   name="btnRegresar" value="Regresar" />    
                        </form>  

                    </div>
                </div>              
            </div>
                                   
                                   

            <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
        </body>
    </center>
</html>
</head>
</html>
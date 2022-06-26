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
        <form class="form-horizantal" id="frmCategoria" name="frmCategoria" action="<%= request.getContextPath()%>/categoriasS.do" method="post">
            <input type="hidden" name="id_categoria" value="<%= Categoria.getId_categoria() %>">
            <div class="form-group">
                <label for="txtNomCategoria" class="col-sm-2 control-label">Nombre:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtNomCategoria" value="<%= Categoria.getNom_categoria() %>">
                    
                </div>
            </div>
                    <div class="form-group">
                        <label for="txtEstadoCategoria" class="col-sm-2 control-label">Estado:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="txtEstadoCategoria" value="">
                        </div>
                    </div>
        </body><div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" class="btn btn-success btn-sm" name="btnGuardar" value="Guardar"/>
                <input type="button" class="btn btn-danger btn-sm" onclick="regresar('<%= request.getContextPath() %>/categoriasS.do?opcion=listar')"
                       name="btnRegresar" value="Regresar" />         
            </div>
        </div>
</form>
                <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
    </head>
</html>

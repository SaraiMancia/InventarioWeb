<%-- 
    Document   : reportescp
    Created on : 07-07-2022, 09:41:12 AM
    Author     : sampc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <p> <center> GENERAR REPORTES DE PRODUCTO Y CATEGORIA:</p> </center>
                       
                                 <a href="<%= request.getContextPath()%>/Vistas-s-r/reportecategoria.jsp" class="btn btn-success btn-sm glyphicon glyphicom-pencil"> Reporte de Categoria</a>
                         <a href="<%= request.getContextPath()%>/Vistas-s-r/reporteproducto.jsp" class="btn btn-success btn-sm glyphicon glyphicom-pencil"> Reporte de Categoria</a>
                      
    </body>
</html>

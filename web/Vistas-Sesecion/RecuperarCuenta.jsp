<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperar cuenta</title>
        <%@include file = "WEB-INF/vistas-parciales/css-js.jspf" %>
        <script type="text/javascript">
            function regresar(url){ //Función para el botón regresar
                location.href = url;
            }
        </script>
    </head>
    <body background="assets/imgs/2.jpg">
        <div class="container">
        <div class="row justify-content-center mt-4 pt-4">
            <div class="col-md-6">
        
        <div id="formularioRecuperacionCuenta">
            <form class="form-horizontal" action="loggin.go" method="post">
                <img class="rounded mx-auto d-block" src="assets/img/IconoRecuperarCuenta.png" alt="" width="100" height="100">
                <h1>Recuperación de cuenta</h1><br>
        <p><b>Para recuperar la cuenta ingrese a continuación su numero de teléfono</b></p>
                <input type="hidden" name="opcion" value="recuperarcuenta">
                <input type="text" class="form-control" name="txtTelefonoUsuario"  id="telefono" placeholder="Ingrese el número de teléfono asociado a su cuenta" required>
                <br>
                <div class="form-group" align='center'>
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-info btn-lg">Recuperar cuenta</button>
                    <input type="button" class="btn btn-danger btn-lg" onclick="regresar('<%= request.getContextPath() %>/index.jsp')"
                           name="btnRegresar" value="Regresar" />
                </div>
                </div>
                           <br>
                           <div class="col-md-auto">
       <%@include file="WEB-INF/vistas-parciales/pie.jspf" %>
            </div>
        </div>
            </form>
    </body>
</html>
   
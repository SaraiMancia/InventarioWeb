 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recuperar contraseña</title>
          <%@include file = "WEB-INF/vistas-parciales/css-js.jspf" %>
        <script type="text/javascript">
            function regresar(url){ //Función para el botón regresar
                location.href = url;
            }
        </script>
    </head>
<body background="assets/img/2.jpg">
 <div class="container">
        <div class="row justify-content-center mt-4 pt-4">
            <div class="col-md-6">
        
        <form action="loggin.go" method="post">
            <img class="rounded mx-auto d-block" src="assets/img/IconoRecuperarConstraseña.png" alt="" width="100" height="100"><br>
            <h2>Recuperación de contraseña</h2><br>
        <p><b>Para recuperar su contraseña, ingrese su correo electrónico a continuacion: </b></p>
            <input type="hidden" name="opcion" value="recuperarcontrasena">
            <input type="text" class="form-control" name="txtCorreoUsuario"  id="correo" placeholder="Ingrese su correo electrónico" required><br>
                
            <div class="form-group" align='center'>
                <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-info btn-lg">Recuperar contraseña</button>
                    <input type="button" class="btn btn-danger btn-lg" onclick="regresar('<%= request.getContextPath() %>/index.jsp')"
                           name="btnRegresar" value="Regresar" />
            </div>
            </div>
                           <br>
                     <div class="col-md-auto">
       <%@include file="WEB-INF/vistas-parciales/pie.jspf" %>
            </div>
            
                          
        </form>
                           
        <% 
            String pregunta = (String)request.getAttribute("pregunta");
            String correoUsuario = (String)request.getAttribute("correo");
            if(pregunta != null)
            {
            
        %>
            <form action="loggin.go" method="post">
            <input type="hidden" name="opcion" value="recuperarContrasena/respuesta">
            <input type="hidden" name="correoUsuario" value="<%= correoUsuario %>">
            <p><b>Responda a la pregunta siguiente para obtener la contraseña: </b></p>
            <div class="form-group-sm">
                <input type="text" class="form-control" name="txtPregunta"  id="preguna" 
                       readonly="true" value="<%= pregunta %>" >
                <input type="text" class="form-control" name="txtRespuesta" placeholder="Ingrese la respuesta a la pregunta" value="" />
                <button type="submit" class="btn btn-info btn-sm">Envar respuesta</button>
            </div>
        </form>
                 
        <%
            }
        %>
         
        
    </body>
</html>

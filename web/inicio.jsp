<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Hugo 0.98.0">
        <title>Signin Template Â· Bootstrap v5.2</title>
        <%@include file = "WEB-INF/Vistas-Parciales/css-js.jspf" %>

        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }

            .b-example-divider {
                height: 3rem;
                background-color: rgba(0, 0, 0, .1);
                border: solid rgba(0, 0, 0, .15);
                border-width: 1px 0;
                box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
            }

            .b-example-vr {
                flex-shrink: 0;
                width: 1.5rem;
                height: 100vh;
            }

            .bi {
                vertical-align: -.125em;
                fill: currentColor;
            }

            .nav-scroller {
                position: relative;
                z-index: 2;
                height: 2.75rem;
                overflow-y: hidden;
            }

            .nav-scroller .nav {
                display: flex;
                flex-wrap: nowrap;
                padding-bottom: 1rem;
                margin-top: -1px;
                overflow-x: auto;
                text-align: center;
                white-space: nowrap;
                -webkit-overflow-scrolling: touch;
            }
        </style>


        <!-- Custom styles for this template -->
        <link href="css/signin.css" rel="stylesheet">
    </head>
    
    <% String rspta="";
    if(request.getParameter("rspta")!=null){
        int r=Integer.parseInt(request.getParameter("rspta"));
        if(r==0){
            rspta="Error: El Usuario y Contaseña no Coinciden";
        }
        
    }
    
    %>
    <body class="text-center">


        <main class="form-signin w-100 m-auto">
            <form method="post" action="registroUser.do">
                <center>
                    <div class="container" style="margin-top: 80px">
                    <div class="card" style="width: 30rem;">
                       
                        <h1 class="h3 mb-3 fw-normal">Inicio de Sesion</h1>

                        <div class="form-floating">
                            <input type="text" name="txtusuario" class="form-control mt-5" id="floatingInput" placeholder="Usuario" required>
                            <label for="floatingInput">Tu usuario</label>
                        </div>
                        <div class="form-floating">
                            <input type="password" name="txtclave" class="form-control mt-5" id="floatingPassword" placeholder="Contraseña" required>
                            <label for="floatingPassword">Tu clave</label>
                        </div>
                         <p style="color: red;"><%=rspta %></p>

                        <div class="checkbox mb-3">
                            <label>
                               
                          <input type="checkbox" value="remember-me"> Recordar usuario
                            </label>
                        </div>
                       
                        <button class="w-100 btn btn-lg btn-primary" type="submit" name="btn-login">Entrar</button>
                        <p class="mt-5 mb-3 text-muted">&copy; 2022</p>
                        </form>
                        </main>
        <hr>


                        </body>
                        </html>

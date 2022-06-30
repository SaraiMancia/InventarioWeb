<%-- 
    Document   : Registrarse1
    Created on : Jun 19, 2022, 11:33:00 AM
    Author     : Armando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="./image/cuenta.png">
        <title>Inicio de sesion</title>
        <link href="./css/estilo.css" rel="stylesheet" type="text/css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body >
        <form action="sesionA.do" method="post">
            <section class="vh-100" background="">
                <div class="container py-5 h-100" >
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                            <div class="card shadow-2-strong" style="border-radius: 1rem; background: rgba(0,0,0,0.3);">
                                <div class="card-body p-5 text-center">

                                    <h3 class="">
                                        <img class="imgusuario" src="./image/usuario.png"><br>
                                        Iniciar sesión
                                        <hr class="hrh">
                                    </h3>


                                    <div class="form-outline mb-4">
                                        <input name="txtEmail" style="background: transparent;border: 1; color: white;" type="email" id="typeEmailX-2" class="form-control form-control-lg" placeholder="Ingrese su Email"/>
                                        <label class="form-label" for="typeEmailX-2">Correo</label>
                                    </div>

                                    <div class="form-outline mb-4">
                                        <input  name="txtPassword" id="inputPassword" style="background: transparent;border: 1; color: white;" type="password" id="typePasswordX-2" class="form-control form-control-lg" placeholder="Ingrese su contraseña"/>
                                        <label class="form-label" for="typePasswordX-2">Contraseña</label>
                                    </div>

                                    <!-- Checkbox -->
                                    <div class="form-check d-flex justify-content-start mb-4">
                                        <input class="form-check-input" type="checkbox" value="" id="form1Example3" />
                                        <label class="form-check-label" for="form1Example3"> Remember password </label>
                                    </div>

                                    <button  name="btn-login" class="btn btn-primary  btn-block" type="submit">Iniciar sesión</button>

                                    <hr class="my-4">

                                    <div class="col">
                                        <!-- Simple link -->
                                        <a style="text-decoration: none;" href="#!" >Olvid&oacute; su contraseña?</a>
                                        <a style="text-decoration: none;" href="RegistrarUsuario.jsp"> No tienes cuenta?</a>
                                    </div>


                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </form>
    </body>
</html>

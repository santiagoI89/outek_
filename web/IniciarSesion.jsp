<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="shortcut icon" href="images/Logo..png">
        <script src="js/validaciones.js" type="text/javascript"></script>
        <!--FUENTE DE GOOGLE-->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;500;700&display=swap" rel="stylesheet">

        <!--<link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/sidebars/">-->
        <!--<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <link href="css/IniSes.css" rel="stylesheet" type="text/css"/>
        <!--<link href="css/PagPrincipal.css" rel="stylesheet" type="text/css"/>-->
        <script src="js/mostrarContraseña.js" type="text/javascript"></script>
        <title>Outek</title>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="sweetalert2.min.js"></script>
        <script>
            document.addEventListener('keydown', function (event) {
                if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {
                    event.preventDefault(); // Evitar la acción predeterminada del evento
                }
            });
        </script>
        <link rel="stylesheet" href="sweetalert2.min.css">
    </head>
    <body>
        <header>
            <nav>
                <a href="Index.jsp">Inicio</a>
                <a href="AcercaDe.jsp">Acerca de Nosotros</a>
                <a href="Contacto.jsp">Contactanos</a>
                <a href="IniciarSesion.jsp">Inicio Sesión</a>
                <a href="RegistrarCliente.jsp">Registro</a>
            </nav>
            <section class="textos-header">
                <h1>TECHNOLOGY CHECK-OUT</h1>
                <h2>Somos una empresa que te ofrece los mejores productos</h2>
            </section>
            <div class="wave" style="height: 150px; overflow: hidden;" ><svg viewBox="0 0 500 150" preserveAspectRatio="none" style="height: 100%; width: 100%;">
                <path d="M0.00,50.10 C150.00,150.33 349.20,-50.10 500.00,50.10 L500.00,150.33 L0.00,150.33 Z" style="stroke: none; fill: #fff;"></path></svg></div>
        </header>


        <div class="login-container">
            <div class="login-info-container">
                <form align="center" method="post" action="UsuarioControlador" class="inputs-container" novalidate>
                    <h2 class="title">Iniciar Sesion</h2>
                    <label>Ingrese su cedula</label>
                    <input type="text" onkeypress="return SoloNumeros2(event);" maxlength="10" class="InSe" name="usuCedula" placeholder="Cedula" required>

                    <div id="usuCedulaError" style="color: red;"></div> <!-- Espacio para mostrar el mensaje de error -->

                    <br>
                    <label>Ingrese su contraseña</label>
                    <input type="password" id="password" class="InSe" name="usuPassword" placeholder="Contraseña" required>

                    <div id="usuPasswordError" style="color: red;"></div> <!-- Espacio para mostrar el mensaje de error -->

                    <br>
                    <br>
                    <input type="submit" value="Iniciar Sesión" class="btn" onclick="return validarFormulario()">
                    <input type="hidden" name="opcion" value="4" class="btn"> 
                    <br>
                    <a href="RestablecerContraseña.jsp">Restablecer Contraseña</a>
                    
                </form>

                <script>
                    function validarFormulario() {
                        var usuCedula = document.getElementsByName("usuCedula")[0].value;
                        var usuPassword = document.getElementsByName("usuPassword")[0].value;
                        var error = false;

                        // Validar campo usuCedula
                        if (usuCedula === "") {
                            document.getElementById("usuCedulaError").textContent = "DEBE INGRESAR UN USUARIO";
                            error = true;
                        } else {
                            document.getElementById("usuCedulaError").textContent = "";
                        }

                        // Validar campo usuPassword
                        if (usuPassword === "") {
                            document.getElementById("usuPasswordError").textContent = "DEBE INGRESAR UNA CONTRASEÑA";
                            error = true;
                        } else {
                            document.getElementById("usuPasswordError").textContent = "";
                        }

                        // Evitar el envío del formulario si hay errores
                        if (error) {
                            return false;
                        }
                    }

                    function mostrarContrasena() {
                        // Implementa la lógica para mostrar o ocultar la contraseña
                    }
                </script>

            </div>

            <img class="image-container" src="images/login.svg" alt="login">
        </div>    

        <footer>
            <div class="contenedor-footer">
                <div class="content-foo">
                    <h4>Email</h4>
                    <p>Techn0.Check0ut@gmail.com</p>
                </div>
                <div class="content-foo">
                    <h4>Telefono</h4>
                    <p>3142573571</p>
                </div>
                <div class="content-foo">
                    <h4>Locación</h4>
                    <p>Unilago</p>
                </div>
            </div>
            <h2 class="titulo-final">&copy; Outek | Technology Check-Out</h2>
        </footer>
    </body>
</html>
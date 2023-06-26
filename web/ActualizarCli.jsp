<%-- 
    Document   : ActualizarCli
    Created on : 22/03/2023, 05:31:51 PM
    Author     : APRENDIZ
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
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
        <!--<link href="css/Style.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/menu.css" rel="stylesheet" type="text/css"/>
        <link href="css/RegisCliente.css" rel="stylesheet" type="text/css"/>
        <!--<link href="css/PagPrincipal.css" rel="stylesheet" type="text/css"/>-->
        <script src="js/mostrarContraseña.js" type="text/javascript"></script>
        <title>Actualizar Cliente</title>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2.min.css">
    </head>

    <body>
        <header class="menus">
            <div class="container logo-nav-container">
                <img src="images/Logo..png" alt="logo" class="logo"/>
                <nav class="navigation">
                    <ul>
                        <li><a href="Cliente.jsp">Inicio</a></li>
                        <li><a href="CliCategorias.jsp">Productos</a></li>
                        <li><a href="DatosCli.jsp">Actualizar Datos Personales</a></li>
                        <li><a href="RegistrarVenta.jsp">Realizar Compra</a></li>
                        <li><a href="ConsultarCompra.jsp">Consultar Pedido</a></li>
                        <form method="post" action="Sesiones" class="men">
                            <li><input type="submit" value="Cerrar Sesión" class="btnMenu"> </li>
                        </form>
                    </ul>
                </nav>
            </div>
        </header>

        <main>
           <%        HttpSession miSesion = request.getSession(false);
                UsuarioVO usuario = (UsuarioVO) miSesion.getAttribute("datosUsuario");
                if (miSesion != null && usuario != null) {
                    // Accede a los datos del usuario, por ejemplo:
                    String nombreUsuario = usuario.getUsuNombre();
                    String cedulaUsuario = usuario.getUsuCedula();
                    String contraseñaUsuario = usuario.getUsuPassword();

                    // Realiza las operaciones necesarias con los datos del usuario
                } else {
                    // La sesión o el objeto de usuario no existen, maneja el caso en consecuencia
                }
            %>
            <div class="login-container">
                <div class="login-info-container">
                    <form  class="needs-validation" novalidate  align="center" method="post" action="UsuarioControlador"> 
                        <br>

                        <h1 class="title">Actualizar Cliente</h1><br>
                        <p>Solo tomara un minuto</p>
                        <br>
                        <label>Ingrese su Nombre</label>
                        <input type="text" class="regis"name="usuNombre"  value="<%=usuario.getUsuNombre()%>" required onkeypress="return SoloLetras(event);">
                        <br><br>
                        <label>Ingrese su apellido</label>
                        <input type="text" class="regis" name="usuApellido"  value="<%=usuario.getUsuApellido()%>"  required onkeypress="return SoloLetras(event);">
                        <br><br>       
                        <label>Ingrese su correo electronico</label>
                        <input type="email" class="regis" name="usuCorreo"  value="<%=usuario.getUsuCorreo()%>"  required>
                        <br><br>
                        <label>Ingrese una dirección</label>
                        <input type="text" class="regis" name="usuDireccion"  value="<%=usuario.getUsuDireccion()%>"   required>
                        <br><br>
                        <label>Ingrese su número telefonico</label>
                        <input type="number" class="regis" name="usuTelefono"  value="<%=usuario.getUsuTelefono()%>"  required onkeypress="return SoloNumeros(event);">
                        <br><br>  
                        <label>Cedula</label>
                        <br> 
                        <input type="number" class="regis" name="usuCedula"  value="<%=usuario.getUsuCedula()%>"  readonly onmousedown="return false;" required  >
                        <br><br>
                        <label>Ingrese su contraseña</label>
                        <input type="text" id="password" class="regis" name="usuPassword" value="<%=usuario.getUsuPassword()%>" placeholder="Contraseña" required>
                        <br><br>
                        <input type="submit" value="Actualizar" class="btn" onclick="mostrarAlerta()">
                        <input type="hidden" name="opcion" value="10">
                        <br>
                        <%
                        if (request.getAttribute("mensajeError") != null) {%>
                        ${mensajeError}
                        <%} else {%>
                        ${mensajeExito}
                        <%}%>
                        </div>
                        
                        <img class="image-container" src="images/registro.svg" alt="registro">
                    </form>
                </div>
               
        </main>
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
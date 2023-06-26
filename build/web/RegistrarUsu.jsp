<%-- 
    Document   : Registrar
    Created on : 16/03/2023, 08:12:34 PM
    Author     : juand
--%>

<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="util.ConexionBd"%>
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
        <title>Outek</title>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2.min.css">
        <script>
    document.addEventListener('keydown', function(event) {
      if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {
        event.preventDefault(); // Evitar la acción predeterminada del evento
      }
    });
  </script>
    </head>
    <body>
        <header class="menus">
            <div class="container logo-nav-container">
                <img src="images/Logo..png" alt="logo" class="logo"/>
                <nav class="navigation">
                    <ul>
                        <li><a href="Administrador.jsp">Inicio</a></li>
                        <li><a href="RegistrarUsu.jsp">Registro de Usuarios</a></li>
                        <li><a href="ConsultarUsu.jsp">Consulta de Usuarios</a></li>
                        <li><a href="ConsultarVentasAdmin.jsp">Consulta de Ventas</a></li>
                        <form method="post" action="Sesiones" class="men">
                            <li><input type="submit" value="Cerrar Sesión" class="btnMenu"> </li>
                        </form>
                    </ul>
                </nav>
            </div>
        </header>
        
        
        
        <main>
            
        <div class="login-container">
            <div class="login-info-container">
                <form  class="needs-validation" novalidate  method="post" action="UsuarioControlador">

                    <br>
                    <h2 class="title">Registrar Personal</h2>
                    <p>Solo tomara un minuto</p>
                    <br>
                    <label>Ingrese el nombre</label>
                    <input type="text"  onkeypress="return SoloLetras(event);"  class="regis" name="usuNombre" placeholder="Nombre" required>

                    <br><br>

                    <label>Ingrese el apellido</label>
                    <input type="text" onkeypress="return SoloLetras(event);" class="regis" name="usuApellido" placeholder="Apellidos" required>

                    <br><br>

                    <label>Ingrese número telefonico</label>
                    <input type="text" onkeypress="return SoloNumeros(event);" maxlength="10"  class="regis" name="usuTelefono" placeholder="Telefono" required>

                    <br><br>

                    <label>Ingrese la cedula</label>
                    <input type="text" onkeypress="return SoloNumeros(event);" maxlength="10"  class="regis" name="usuCedula" placeholder="Cedula" required>

                    <br><br>

                    <label>Ingrese el correo electronico</label>
                    <input type="email" class="regis" name="usuCorreo" placeholder="Correo Electronico" required>

                    <br><br>

                    <label>Ingrese una dirección</label>
                    <input type="text" class="regis" name="usuDireccion" placeholder="Direccion" required>

                    <br><br>

                 

                    <label>Ingrese un rol</label>
                    <br>
                    <select name="rolId"  class="custom-select" aria-label="Default select example">
                        <option>Seleccione un Rol...</option>
                        <%
                            RolDAO rolDAO = new RolDAO();
                            for (RolVO rolVO : rolDAO.listar()) {
                        %>
                        <option value="<%=rolVO.getRolId()%>"><%=rolVO.getRolTipo()%></option>
                        <%}%>
                    </select>

                    <br>

                    <input type="submit" value="Registrar" class="btn" >

                    <input type="hidden" name="opcion" value="1" class="btn">
                    <input type="hidden" name="rolId" value="1" class="btn">
                </form> 
                    <br>
                    <%
                    if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%} else {%>
                    ${mensajeExito}
                    <%}%>
                    </div>  

                <img class="image-container" src="images/registro.svg" alt="registro"> 
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

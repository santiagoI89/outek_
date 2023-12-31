
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
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
        <link href="css/formConsul.css" rel="stylesheet" type="text/css"/>
        <link href="css/PagPrincipal.css" rel="stylesheet" type="text/css"/>
        <script src="js/mostrarContraseña.js" type="text/javascript"></script>
        <title>Outek</title>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2.min.css">
        <script>
            document.addEventListener('keydown', function (event) {
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
            <div class="consul">
                <form  method= "post" action="UsuarioControlador" class="formConsul" novalidate>
                    <h1 class="titleConsul">Usuarios</h1>
                    <br>
                    <label>Ingrese una cedula</label>
                    <input type="text" onkeypress="return SoloNumeros2(event);" maxlength="10" name="usuCedula" class="ConsulInput" placeholder="cedula" required>
                    <br><br>
                    <input type="submit" value= "Consultar" class="btnConsul">
                    <input type="hidden" name="opcion" value="3" class="btnConsul">
                </form>
            </div>


            <form>
                <table align="center" border="1" class="table table-striped">
                    <thead>
                        <tr>
                            <th>CEDULA</th>
                            <th>NOMBRE</th>
                            <th>APELLIDO</th>
                            <th>DIRECCION</th>
                            <th>TELEFONO</th>
                            <th>CORREO</th>
                            <th>ESTADO</th>
                            <th>ROL</th>
                            <th>INACTIVAR</th>
                            <th>REACTIVAR</th>
                        </tr>
                    </thead>
                    <%                    UsuarioVO usuVO = new UsuarioVO();
                        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
                        ArrayList<UsuarioVO> lista = usuDAO.listar();

                        for (int i = 0; i < lista.size(); i++) {
                            usuVO = lista.get(i);
                    %>
                    <tbody>
                        <tr>
                            <td data-titulo="cedula"><%=usuVO.getUsuCedula()%></td>
                            <td data-titulo="nombre"><%=usuVO.getUsuNombre()%></td>
                            <td data-titulo="apellido"><%=usuVO.getUsuApellido()%></td>
                            <td data-titulo="telefono"><%=usuVO.getUsuTelefono()%></td>
                            <td data-titulo="correo"><%=usuVO.getUsuCorreo()%></td>
                            <td data-titulo="direccion"><%=usuVO.getUsuDireccion()%></td>
                            <td data-titulo="estado"><%=usuVO.getUsuEstado()%></td>
                            <td data-titulo="id"> <%=usuVO.getUsuRolId()%></td>
                            <td data-titulo="inactivar">
                                <form method = "post" action="UsuarioControlador">
                                    <input type="submit" value="Inactivar Usuario" class="btn">
                                    <input type="hidden" name="usuCedula" value="<%=usuVO.getUsuCedula()%>">
                                    <input type="hidden" name="opcion" value="5">
                                </form>
                            </td>
                            <td data-titulo="reactivar">
                                <form method = "post" action="UsuarioControlador">
                                    <input type="submit" value="Reactivar Usuario" class="btnReact">
                                    <input type="hidden" name="usuCedula" value="<%=usuVO.getUsuCedula()%>">
                                    <input type="hidden" name="opcion" value="6">
                                </form>
                            </td>
                        </tr>
                    </tbody>

                    <%}%>
                </table>

            </form>


            <%
            if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}

            <%} else {%>
            ${mensajeExito}
            <%}%>
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
 
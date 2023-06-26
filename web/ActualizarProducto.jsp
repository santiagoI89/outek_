<%-- 
    Document   : ActualizarProducto
    Created on : 16/03/2023, 10:40:08 PM
    Author     : valen
--%>

<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="util.ConexionBd"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <script>
            document.addEventListener('keydown', function (event) {
                if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {
                    event.preventDefault(); // Evitar la acción predeterminada del evento
                }
            });
        </script>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="shortcut icon" href="images/Logo..png">

        <!--FUENTE DE GOOGLE-->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;500;700&display=swap" rel="stylesheet">

        <!--<link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/sidebars/">-->
        <!--<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>-->
        <!--<link href="css/Style.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/menu.css" rel="stylesheet" type="text/css"/>
        <!--<link href="css/IniSes.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/RegisCliente.css" rel="stylesheet" type="text/css"/>
        <!--<link href="css/PagPrincipal.css" rel="stylesheet" type="text/css"/>-->
        <script src="js/mostrarContraseña.js" type="text/javascript"></script>
        <title>Outek</title>
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
                        <li><a href="PersonalDeVentas.jsp">Inicio</a> </li>
                        <li><a href="ConsultarProducto.jsp">Consulta de Productos</a></li>
                        <li><a href="RegistrarProducto.jsp">Registro de Productos</a></li>
                        <li><a href="RegistraCompra.jsp">Registro de Ventas</a></li>
                        <li><a href="ConsultarVentas.jsp">Consulta de Ventas</a></li>
                        <form method="post" action="Sesiones" class="men">
                            <li><input type="submit" value="Cerrar Sesión" class="btnMenu"> </li>
                        </form>
                    </ul>
                </nav>
            </div>
        </header>

        <main>
            <%            ProductoVO proVO = (ProductoVO) request.getAttribute("¡El producto encontrado!");
                if (proVO != null) {
            %>
            <div class="login-container">
                <div class="login-info-container">
                    <form method="post" action="ActualizarProducto" class="inputs-container" novalidate enctype="multipart/form-data" >
                        <br><br>

                        <h2 class="title">Actualizar Producto</h2>
                        <br><br>
                        <label>Id</label>
                        <br>
                        <input type="number" class="regis" name="proId"value="<%=proVO.getProId()%>" readonly onmousedown="return false;"  required>
                        <br><br>
                        <label>Modelo</label>
                        <br>
                        <input type="text" class="regis" name="proModelo"  value="<%=proVO.getProModelo()%>" required>
                        <br><br>
                        <label>Descripcion</label>
                        <br>
                        <input type="text" class="regis" name="proDescripcion"  value="<%=proVO.getProDescripcion()%>"  required>
                        <br><br>
                        <label>Nombre</label>
                        <br>
                        <input type="email" class="regis" name="proNombre" value="<%=proVO.getProNombre()%>"  required>
                        <br><br>
                        <label>Precio</label>
                        <br>
                        <input type="number" class="regis" name="proPrecioVenta"  value="<%=proVO.getProPrecioVenta()%>"   required>
                        <br><br>

                        <label>Cantidad</label>
                        <br>
                        <input type="number" class="regis" name="proCantidad" value="<%=proVO.getProEstado()%>"  required>
                        <br><br>
                        <label>Ingrese una categoria</label>
                        <br>
                        <select name="proCategoria"  class="regis" aria-label="Default select example">
                            <option>Seleccione una Categoria...</option>
                            <%
                                CategoriaDAO catDAO = new CategoriaDAO();
                                for (CategoriaVO catVO : catDAO.listar()) {
                            %>
                            <option value="<%=catVO.getCatId()%>"><%=catVO.getCatTipo()%></option>
                            <%}%>
                        </select>
                        <br><br>

                        <label>Inserte una Imagen</label>
                        <br>
                        <input type="file" class="regis" name="proImagen" value="<%=proVO.getProImagen()%>"  required>
                        <br><br>

                        <input type="submit" value="Actualizar" class="btn">
                        <input type="hidden" name="opcion" value="2" class="btn">

                        <%}%>
                        <%
                        if (request.getAttribute("mensajeError") != null) {%>
                        ${mensajeError}
                        <%} else {%>
                        ${mensajeExito}
                        <%}%>
                    </form>
                </div>
                <img class="image-container" src="images/Actualizar.svg" alt="login">
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

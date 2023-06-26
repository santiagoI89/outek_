<%-- 
    Document   : ConsultarProducto
    Created on : 16/03/2023, 10:40:08 PM
    Author     : valen
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
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

            <div class="consul">
                <form method= "post" action="ProductoControlador" class="formConsul" novalidate>
                    <h1 class="titleConsul">Productos</h1>
                    <br>
                    <label>Ingrese un Id</label>
                    <input type="text" onkeypress="return SoloNumeros2(event);" maxlength="10" name="proId" class="ConsulInput" placeholder="ID" required>
                    <br><br>
                    <input type="submit" value= "Consultar" class="btnConsul">
                    <input type="hidden" name="opcion" value="3" class="btnConsul">
                </form>
            </div>

            <form>
                <table align="center" border="1"class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>MODELO</th>
                            <th>DESCRIPCION</th>
                            <th>NOMBRE</th>
                            <th>PRECIO</th>
                            <th>CANTIDAD</th>
                            <th>ESTADO</th>
                            <th>CATEGORIA</th>
                            <th>IMAGEN</th>
                        </tr>
                    </thead>
                    <%                    ProductoVO proVO = new ProductoVO();
                        ProductoDAO proDAO = new ProductoDAO(proVO);

                        ArrayList<ProductoVO> lista = proDAO.listar();
                        for (int i = 0; i < lista.size(); i++) {
                            proVO = lista.get(i);
                    %>
                    <tbody>
                        <tr >    
                            <td data-titulo="ID"><%=proVO.getProId()%></td>
                            <td data-titulo="modelo"><%=proVO.getProModelo()%></td>
                            <td data-titulo="descripción"><%=proVO.getProDescripcion()%></td>
                            <td data-titulo="nombre"><%=proVO.getProNombre()%></td>
                            <td data-titulo="precioVenta"><%=proVO.getProPrecioVenta()%></td>
                            <td data-titulo="cantidad"><%=proVO.getProCantidad()%></td>
                            <td data-titulo="categoria"><%=proVO.getProCategoria()%></td>
                            <td data-titulo="estado"><%=proVO.getProEstado()%></td>
                            <td data-titulo="imagen"><img src="files/<%=proVO.getProImagen()%>" height="50" width="50"></td>
                            <td data-titulo="inactivar">
                                <form method = "post" action="ProductoControlador">
                                    <input type="submit" value="Inactivar Producto" class="btn">
                                    <input type="hidden" name="proId" value="<%=proVO.getProId()%>">
                                    <input type="hidden" name="opcion" value="4">
                                </form>
                            </td>
                            <td data-titulo="reactivar">
                                <form method = "post" action="ProductoControlador">
                                    <input type="submit" value="Reactivar Producto" class="btnReact">
                                    <input type="hidden" name="proId" value="<%=proVO.getProId()%>">
                                    <input type="hidden" name="opcion" value="5">
                                </form>
                            </td>
                        </tr>
                    </tbody>
                    <%}%>
                </table>
                <%
                if (request.getAttribute("mensajeError") != null) {%>
                ${mensajeError}
                <%} else {%>
                ${mensajeExito}
                <%}%>

            </form> 

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

<%--
    Document   : ConsultarProducto
    Created on : 16/03/2023, 10:40:08 PM
    Author     : valen
--%>

<%@page import="ModeloDAO.PedidoDAO"%>
<%@page import="ModeloVO.PedidoConsultarVO"%>
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
        <script>
            document.addEventListener('keydown', function (event) {
                if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {
                    event.preventDefault(); // Evitar la acción predeterminada del evento
                }
            });
        </script>
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
    <head>
        <!-- Otros elementos del encabezado -->

        <style>
            th:nth-child(1),
            td:nth-child(1) {
                display: none;
            }
        </style>
    </head>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
    $(document).ready(function () {
        $('#searchInput').on('input', function () {
            var searchValue = $(this).val().toLowerCase();
            $('table tbody tr').filter(function () {
                $(this).toggle($(this).children('td:nth-child(3)').text().toLowerCase().indexOf(searchValue) > -1)
            });
        });
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
            <form class="formConsul" novalidate>
                <h1 class="titleConsul">Pedidos</h1>
                <br>
                <label>Ingrese la cedula</label>
                <input type="text" id="searchInput" placeholder="Buscar por cédula..." class="ConsulInput" onkeypress="return SoloNumeros2(event);">
                <br><br>
            </form>
        </div>

        <table align="center" border="1" class="table table-striped">
            <thead>
                <tr>
                    <th>IdPedido</th>
                    <th>NumeroSerie</th>
                    <th>Cedula Cliente</th>
                    <th>Fecha</th>
                    <th>Id Producto</th>
                    <th>Precio Producto</th>
                    <th>Cantidad</th>
                    <th>Total</th>
                    <th>Estado</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <%        PedidoConsultarVO peVO = new PedidoConsultarVO();
                PedidoDAO peDAO = new PedidoDAO(peVO);

                ArrayList<PedidoConsultarVO> lista = peDAO.listar();
                for (int i = 0; i < lista.size(); i++) {
                    peVO = lista.get(i);
            %>
            <tbody>
                <tr>
                    <td data-titulo="ID"><%=peVO.getPedID()%></td>
                    <td data-titulo="ID"><%=peVO.getPednumeroSerie()%></td>
                    <td data-titulo="cedula"><%=peVO.getPedCedula()%></td>
                    <td data-titulo="modelo"><%=peVO.getPedFecha()%></td>
                    <td data-titulo="descripción"><%=peVO.getDetPedIdproducto()%></td>
                    <td data-titulo="nombre"><%=peVO.getDetPedprecioProducto()%></td>
                    <td data-titulo="precioVenta"><%=peVO.getDetPedCantidad()%></td>
                    <td data-titulo="cantidad"><%=peVO.getPedMonto()%></td>
                    <td data-titulo="categoria"><%=peVO.getPedEstado()%></td>
                    <td data-titulo="inactivar">
                        <form method="post" action="PedidoControlador3">
                            <input type="submit" value="Inactivar Pedido" class="btn">
                            <input type="hidden" name="pedId" value="<%=peVO.getPedID()%>">
                            <input type="hidden" name="opcion" value="1">
                        </form>
                    </td>
                    <td data-titulo="reactivar">
                        <form method="post" action="PedidoControlador3">
                            <input type="submit" value="Reactivar Pedido" class="btnReact">
                            <input type="hidden" name="pedId" value="<%=peVO.getPedID()%>">
                            <input type="hidden" name="opcion" value="2">
                        </form>
                    </td>
                </tr>
            </tbody>
            <%}%>
        </table>
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

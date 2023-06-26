<%-- 
    Document   : ConsultarProducto
    Created on : 16/03/2023, 10:40:08 PM
    Author     : valen
--%>

<%@page import="ModeloVO.UsuarioVO"%>
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
    <head>
        <!-- Otros elementos del encabezado -->

        <style>
            th:nth-child(1),
            td:nth-child(1) {
                display: none;
            }
        </style>
    </head>
    <script>
        document.addEventListener('keydown', function (event) {
            if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {
                event.preventDefault(); // Evitar la acción predeterminada del evento
            }
        });
    </script>
</head>
<body>
    <%            HttpSession miSesion = request.getSession(false);
        UsuarioVO usuario = (UsuarioVO) miSesion.getAttribute("datosUsuario");
        if (miSesion != null && usuario != null) {
            // Accede a los datos del usuario, por ejemplo:
            String nombreUsuario = usuario.getUsuNombre();
            String cedulaUsuario = usuario.getUsuCedula();
            // Realiza las operaciones necesarias con los datos del usuario
        } else {
            // La sesión o el objeto de usuario no existen, maneja el caso en consecuencia
        }
    %>
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

        <table align="center" border="1"class="table table-striped">
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
            <%
                PedidoConsultarVO peVO = new PedidoConsultarVO();
                PedidoDAO peDAO = new PedidoDAO(peVO);
                String cedulaUsuario = usuario.getUsuCedula();
                ArrayList<PedidoConsultarVO> lista = peDAO.listarPedidosPorCliente(cedulaUsuario);
                for (int i = 0; i < lista.size(); i++) {
                    peVO = lista.get(i);
            %>
            <tbody>
                <tr >    
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
                            <input type="submit" value="Cancelar Pedido" class="btn">
                            <input type="hidden" name="pedId" value="<%=peVO.getPedID()%>">
                            <input type="hidden" name="opcion" value="3">
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



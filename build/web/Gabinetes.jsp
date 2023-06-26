<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@include file="Sesiones.jsp" %>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="shortcut icon" href="images/Logo..png">

        <!--FUENTE DE GOOGLE-->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;500;700&display=swap" rel="stylesheet">

        <!--<link href="css/Style.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/menu.css" rel="stylesheet" type="text/css"/>
        <!--<link href="css/IniSes.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/PagPrincipal.css" rel="stylesheet" type="text/css"/>
        <link href="css/CategoCard.css" rel="stylesheet" type="text/css"/>
        <script src="js/mostrarContraseña.js" type="text/javascript"></script>
        <title>Outek</title>
        <script>
    document.addEventListener('keydown', function(event) {
      if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {
        event.preventDefault(); // Evitar la acción predeterminada del evento
      }
    });
  </script>
    </head>
    <body>
        <style>
            .container-img {
    width: 100%;
    max-width: 1200px;
    /* height: 430px; */
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    margin: auto;
}
            .container-img .card {
                width: 250px;
                height: 370px;
                border-radius: 8px;
                box-shadow: 0 2px 2px rgba(0, 0, 0, 0.2);
                overflow: hidden;
                margin: 20px;
                text-align: center;
                transition: all 0.25s;
            }

            .container-img .card:hover{
                transform: translateY(-15px);
                box-shadow: 0 12px 16px rgba(0, 0, 0, 0.2);
            }

            .container-img .card img{
                width: 200px;
                height: 200px;
            }

            .container-img .card h3{
                font-weight: 700;
            }

            .container-img .card p {
                padding: 0 1rem;
                font-size: 16px;
                font-weight: 300;
            }

            .container-img .card a {
                font-weight: 600;
                text-decoration: none;
                color: #BBDEFB;
            }

        </style>

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
            <section class="contenedor sobre-nosotros">
                <h2 class="titulo">CATEGORIAS</h2>

                <div class="containerCatego">
                    <a href="Procesadores.jsp" class="cat">Procesadores</a>
                    <a href="Motherboards.jsp" class="cat">Motherboards</a>
                    <a href="MemoriaRam.jsp" class="cat">Memoria RAM</a>
                </div>  
                <div class="containerCatego">
                    <a href="TarjetasDeVideo.jsp" class="cat">Tarjetas De Video</a>
                    <a href="DiscosDuros.jsp" class="cat">Discos Duros</a>
                    <a href="Fuentes.jsp" class="cat">Fuentes</a>
                </div>
                <div class="containerCatego">  
                    <a href="Gabinetes.jsp" class="cat">Gabinetes</a>
                    <a href="Diademas.jsp" class="cat">Diademas</a>
                    <a href="Mouse.jsp" class="cat">Mouse</a>
                </div>   
                <div class="containerCatego">    
                    <a href="Teclados.jsp" class="cat">Teclados</a>
                    <a href="Refrigeracion.jsp" class="cat">Refrigeracion</a>
                    <a href="Monitores.jsp" class="cat">Monitores</a>
                </div>
                </section>
                <br><br>
                
                <div class="container-img">     
                    <%
                    ProductoDAO proDAO = new ProductoDAO();
                    ArrayList<ProductoVO> lista = proDAO.listarGabinetes();
                    for (ProductoVO p : lista) {
                %>
                    <div class="card">
                        <img src="files/<%=p.getProImagen()%>" >
                        <h3><%=p.getProNombre()%></h3>
                        <p><%=p.getProCategoria()%></p>
                        <p><%=p.getProDescripcion()%></p>
                        <p class="price">$.<%=p.getProPrecioVenta()%></p>
                    </div>
                     <%
                    }%>
                </div>   
            </section>
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
        <!-- JavaScript Bundle with Popper -->
        <!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>-->
    </body>
</html>

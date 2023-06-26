<!doctype html>

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

        <!--<link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/sidebars/">-->
        <!--<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <!--<link href="css/PagPrincipal.css" rel="stylesheet" type="text/css"/>-->
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
        
        <main>
            <section class="contenedor sobre-nosotros">
                <h2 class="titulo">Acerca de </h2>
                <div class="contenedor-sobre-nosotros">
                    <img src="images/AcercaDe.svg" alt="Acerca de" class="imagen-about-us">
                    <div class="contenido-textos">
                        <h3><span></span>Acerca de nosotros</h3>
                        <p>En Technology Check-Out, nos dedicamos a proporcionar una amplia selección de partes y piezas de 
                            computadoras para satisfacer las necesidades de nuestros clientes minoristas.
                            Nuestro objetivo es convertirnos en tu socio confiable para todas tus necesidades
                            de componentes informáticos, brindándote productos de calidad y un servicio excepcional.</p>
                        <h3><span></span>Nuestra pasión por la tecnología</h3>
                        <p>En Technology Check - Out, estamos apasionados por la tecnología y su capacidad para mejorar
                            nuestras vidas. Creemos en el poder de las partes y piezas de computadoras para transformar
                            la forma en que trabajamos, estudiamos y nos entretenemos. Por eso nos esforzamos por ofrecer
                            productos innovadores y de vanguardia que ayuden a nuestros clientes a alcanzar su máximo
                            potencial tecnológico.</p>
                    </div>
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
        
    </body>
</html><%-- 
    Document   : AcercaDe
    Created on : 25/03/2023, 12:26:40 PM
    Author     : juand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      
      <title>Acerca De</title>
      <link rel="shortcut icon" href="images/Logo..png">
    </head>
    <body>
    </body>
</html>

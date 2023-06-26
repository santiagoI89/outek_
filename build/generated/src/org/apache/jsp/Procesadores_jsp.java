package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;
import java.util.ArrayList;
import ModeloVO.UsuarioVO;

public final class Procesadores_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       ");

        HttpSession buscarSesion = (HttpSession) request.getSession();
        if (buscarSesion.getAttribute("datosUsuario") != null)
        {
            
            UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
            
        }
        else 
        {
            request.getRequestDispatcher("Index.jsp").forward(request, response);
        }
        
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      
            response.setHeader("Pragma","No-cache");
            response.setHeader("Cache-control","no-cache,no-store,must-revalidate"); 
            if(buscarSesion.getAttribute("datosUsuario") == null)
            {
                response.sendRedirect("Index.jsp");
                
            }
    
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/Logo..png\">\n");
      out.write("\n");
      out.write("        <!--FUENTE DE GOOGLE-->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--<link href=\"css/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <link href=\"css/menu.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--<link href=\"css/IniSes.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <link href=\"css/PagPrincipal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/CategoCard.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/mostrarContraseña.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Outek</title>\n");
      out.write("        <script>\n");
      out.write("    document.addEventListener('keydown', function(event) {\n");
      out.write("      if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {\n");
      out.write("        event.preventDefault(); // Evitar la acción predeterminada del evento\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .container-img {\n");
      out.write("    width: 100%;\n");
      out.write("    max-width: 1200px;\n");
      out.write("    /* height: 430px; */\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    justify-content: center;\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write("            .container-img .card {\n");
      out.write("                width: 250px;\n");
      out.write("                height: 370px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                box-shadow: 0 2px 2px rgba(0, 0, 0, 0.2);\n");
      out.write("                overflow: hidden;\n");
      out.write("                margin: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                transition: all 0.25s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container-img .card:hover{\n");
      out.write("                transform: translateY(-15px);\n");
      out.write("                box-shadow: 0 12px 16px rgba(0, 0, 0, 0.2);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container-img .card img{\n");
      out.write("                width: 200px;\n");
      out.write("                height: 200px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container-img .card h3{\n");
      out.write("                font-weight: 700;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container-img .card p {\n");
      out.write("                padding: 0 1rem;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: 300;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container-img .card a {\n");
      out.write("                font-weight: 600;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #BBDEFB;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <header class=\"menus\">\n");
      out.write("            <div class=\"container logo-nav-container\">\n");
      out.write("                <img src=\"images/Logo..png\" alt=\"logo\" class=\"logo\"/>\n");
      out.write("                <nav class=\"navigation\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Cliente.jsp\">Inicio</a></li>\n");
      out.write("                        <li><a href=\"CliCategorias.jsp\">Productos</a></li>\n");
      out.write("                        <li><a href=\"DatosCli.jsp\">Actualizar Datos Personales</a></li>\n");
      out.write("                        <li><a href=\"RegistrarVenta.jsp\">Realizar Compra</a></li>\n");
      out.write("                        <li><a href=\"ConsultarCompra.jsp\">Consultar Pedido</a></li>\n");
      out.write("                        <form method=\"post\" action=\"Sesiones\" class=\"men\">\n");
      out.write("                            <li><input type=\"submit\" value=\"Cerrar Sesión\" class=\"btnMenu\"> </li>\n");
      out.write("                        </form>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <section class=\"contenedor sobre-nosotros\">\n");
      out.write("                <h2 class=\"titulo\">CATEGORIAS</h2>\n");
      out.write("\n");
      out.write("                <div class=\"containerCatego\">\n");
      out.write("                    <a href=\"Procesadores.jsp\" class=\"cat\">Procesadores</a>\n");
      out.write("                    <a href=\"Motherboards.jsp\" class=\"cat\">Motherboards</a>\n");
      out.write("                    <a href=\"MemoriaRam.jsp\" class=\"cat\">Memoria RAM</a>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"containerCatego\">\n");
      out.write("                    <a href=\"TarjetasDeVideo.jsp\" class=\"cat\">Tarjetas De Video</a>\n");
      out.write("                    <a href=\"DiscosDuros.jsp\" class=\"cat\">Discos Duros</a>\n");
      out.write("                    <a href=\"Fuentes.jsp\" class=\"cat\">Fuentes</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"containerCatego\">  \n");
      out.write("                    <a href=\"Gabinetes.jsp\" class=\"cat\">Gabinetes</a>\n");
      out.write("                    <a href=\"Diademas.jsp\" class=\"cat\">Diademas</a>\n");
      out.write("                    <a href=\"Mouse.jsp\" class=\"cat\">Mouse</a>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"containerCatego\">    \n");
      out.write("                    <a href=\"Teclados.jsp\" class=\"cat\">Teclados</a>\n");
      out.write("                    <a href=\"Refrigeracion.jsp\" class=\"cat\">Refrigeracion</a>\n");
      out.write("                    <a href=\"Monitores.jsp\" class=\"cat\">Monitores</a>\n");
      out.write("                </div>\n");
      out.write("                </section>\n");
      out.write("                <br><br>\n");
      out.write("                \n");
      out.write("                <div class=\"container-img\">     \n");
      out.write("                    ");

                    ProductoDAO proDAO = new ProductoDAO();
                    ArrayList<ProductoVO> lista = proDAO.listarPro();
                    for (ProductoVO p : lista) {
                
      out.write("\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"files/");
      out.print(p.getProImagen());
      out.write("\" >\n");
      out.write("                        <h3>");
      out.print(p.getProNombre());
      out.write("</h3>\n");
      out.write("                        <p>");
      out.print(p.getProCategoria());
      out.write("</p>\n");
      out.write("                        <p>");
      out.print(p.getProDescripcion());
      out.write("</p>\n");
      out.write("                        <p class=\"price\">$.");
      out.print(p.getProPrecioVenta());
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                     ");

                    }
      out.write("\n");
      out.write("                </div>   \n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"contenedor-footer\">\n");
      out.write("                <div class=\"content-foo\">\n");
      out.write("                    <h4>Email</h4>\n");
      out.write("                    <p>Techn0.Check0ut@gmail.com</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-foo\">\n");
      out.write("                    <h4>Telefono</h4>\n");
      out.write("                    <p>3142573571</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-foo\">\n");
      out.write("                    <h4>Locación</h4>\n");
      out.write("                    <p>Unilago</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <h2 class=\"titulo-final\">&copy; Outek | Technology Check-Out</h2>\n");
      out.write("        </footer>\n");
      out.write("        <!-- JavaScript Bundle with Popper -->\n");
      out.write("        <!-- <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

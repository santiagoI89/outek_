package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;
import java.util.ArrayList;

public final class Fuentes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <!--<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.3/examples/sidebars/\">-->\n");
      out.write("        <!--<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <link href=\"css/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/scripts.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script scr=\"node_modules/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <!--<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">-->\n");
      out.write("        <link href=\"css/PagPrincipal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Outek</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <a href=\"Index.jsp\">Inicio</a>\n");
      out.write("                <a href=\"AcercaDe.jsp\">Acerca de Nosotros</a>\n");
      out.write("                <a href=\"Categorias.jsp\">Categorias</a>\n");
      out.write("                <a href=\"Contacto.jsp\">Contactanos</a>\n");
      out.write("                <a href=\"IniciarSesion.jsp\">Inicio Sesión</a>\n");
      out.write("                <a href=\"RegistrarCliente.jsp\">Registro</a>\n");
      out.write("            </nav>\n");
      out.write("            <section class=\"textos-header\">\n");
      out.write("                <h1>TECHNOLOGY CHECK-OUT</h1>\n");
      out.write("                <h2>Somos una empresa que te ofrece los mejores productos</h2>\n");
      out.write("            </section>\n");
      out.write("            <div class=\"wave\" style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\">\n");
      out.write("                <path d=\"M0.00,50.10 C150.00,150.33 349.20,-50.10 500.00,50.10 L500.00,150.33 L0.00,150.33 Z\" style=\"stroke: none; fill: #fff;\"></path></svg></div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <main>\n");
      out.write("            <section class=\"contenedor sobre-nosotros\">\n");
      out.write("                <h2 class=\"titulo\">CATEGORIAS</h2>\n");
      out.write("                \n");
      out.write("                <div class=\"containerCatego\">\n");
      out.write("                    <a href=\"#\" class=\"cat\">Procesadores</a>\n");
      out.write("                    <a href=\"#\" class=\"cat\">Motherboards</a>\n");
      out.write("                    <a href=\"#\" class=\"cat\">Memoria RAM</a>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"containerCatego\">\n");
      out.write("                    <a href=\"#\" class=\"cat\">Tarjetas De Video</a>\n");
      out.write("                    <a href=\"#\" class=\"cat\">Discos Duros</a>\n");
      out.write("                    <a href=\"#\" class=\"cat\">Fuentes</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"containerCatego\">  \n");
      out.write("                    <a href=\"#\" class=\"cat\">Gabinetes</a>\n");
      out.write("                    <a href=\"#\" class=\"cat\">Diademas</a>\n");
      out.write("                    <a href=\"#\" class=\"cat\">Mouse</a>\n");
      out.write("                </div>   \n");
      out.write("                <div class=\"containerCatego\">    \n");
      out.write("                    <a href=\"#\" class=\"cat\">Teclados</a>\n");
      out.write("                    <a href=\"#\" class=\"cat\">Refrigeracion</a>\n");
      out.write("                    <a href=\"#\" class=\"cat\">Monitores</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");

            ProductoDAO proDAO = new ProductoDAO();
            ArrayList<ProductoVO> lista = proDAO.listarFuentes();
            int salto = 0;
            for (ProductoVO p : lista) {
        
      out.write("\n");
      out.write("        <div class=\"containerImg\">\n");
      out.write("            \n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img url=\"IMG/");
      out.print(p.getProImagen());
      out.write("\">\n");
      out.write("                    <h5>");
      out.print(p.getProNombre());
      out.write("</h5>\n");
      out.write("                    <p>");
      out.print(p.getProCategoria());
      out.write("</p>\n");
      out.write("                \n");
      out.write("                    <li class=\"list-group-item\">");
      out.print(p.getProDescripcion());
      out.write("</li>\n");
      out.write("                    <li class=\"list-group-item\">$.");
      out.print(p.getProPrecioVenta());
      out.write("</li>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        ");

            salto++;
            if (salto == 2) {
        
      out.write("\n");
      out.write("        <tr> \n");
      out.write("        ");
 salto = 0;
                }
            }
        
      out.write("\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        \n");
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

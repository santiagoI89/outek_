package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contacto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
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
      out.write("        <link href=\"css/Contactanos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--<link href=\"css/PagPrincipal.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <title>Outek</title>\n");
      out.write("        \n");
      out.write("   </head>\n");
      out.write("   <body>\n");
      out.write("       <header>\n");
      out.write("            <nav>\n");
      out.write("                <a href=\"Index.jsp\">Inicio</a>\n");
      out.write("                <a href=\"AcercaDe.jsp\">Acerca de Nosotros</a>\n");
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
      out.write("        <main>\n");
      out.write("            <section class=\"contenedor sobre-nosotros\">\n");
      out.write("                <h2 class=\"titulo\">Contactanos</h2>\n");
      out.write("                <div class=\"contenedor-sobre-nosotros\">\n");
      out.write("                    <img src=\"images/contactanos.svg\" alt=\"Nosotros\" class=\"imagen-about-us\">\n");
      out.write("\n");
      out.write("                    <form id=\"request\" action=\"EnvioCorreo\" method=\"post\">\n");
      out.write("                        <div class=\"formContac\">\n");
      out.write("                            <div class=\"grupo hidden\">\n");
      out.write("                                <label>Destino</label>  \n");
      out.write("                                <input value=\"techn0.check0ut@gmail.com\" type=\"email\" name=\"destino\" readonly onmousedown=\"return false;\">                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"grupo\">\n");
      out.write("                                <label>Asunto</label>\n");
      out.write("                                <input type=\"type\" name=\"asunto\" required>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"grupo\">\n");
      out.write("                                <label>Ingresar mensaje con tus datos</label>\n");
      out.write("                                <textarea rows=\"7\" name=\"mensaje\" id=\"textoPredeterminado\" required></textarea>\n");
      out.write("                                <script>\n");
      out.write("                                  // Obtener el elemento del textarea\n");
      out.write("                                  var textarea = document.getElementById(\"textoPredeterminado\");\n");
      out.write("\n");
      out.write("                                  // Establecer el contenido predeterminado\n");
      out.write("                                  textarea.value = \"Nombre:\\nCedula:\\nCorreo:\\nMensaje:\";\n");
      out.write("                                </script>\n");
      out.write("                                <button class=\"btn_Contact\" type=\"submit\" value=\"Enviar\">Enviar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("       <h1>");
      out.print(request.getAttribute("Estadomensaje"));
      out.write("</h1>\n");
      out.write("       <footer>\n");
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
      out.write("                  \n");
      out.write("    </body>\n");
      out.write("</html>");
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

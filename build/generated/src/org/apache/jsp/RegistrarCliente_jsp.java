package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.RolVO;
import ModeloDAO.RolDAO;
import util.ConexionBd;
import ModeloVO.UsuarioVO;

public final class RegistrarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"js/validaciones.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!--<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.3/examples/sidebars/\">-->\n");
      out.write("        <!--<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <link href=\"css/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/RegisCliente.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--<link href=\"css/PagPrincipal.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <script src=\"js/mostrarContraseña.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Outek</title>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("        <script src=\"sweetalert2.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"sweetalert2.min.css\">\n");
      out.write("        <script>\n");
      out.write("        function validarContraseña() {\n");
      out.write("          var password = document.getElementById(\"password\").value;\n");
      out.write("\n");
      out.write("          if (password.length < 8) {\n");
      out.write("            alert(\"La contraseña debe tener al menos 8 caracteres.\");\n");
      out.write("            return;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          var caracteresEspeciales = /[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+/;\n");
      out.write("          if (!caracteresEspeciales.test(password)) {\n");
      out.write("            alert(\"La contraseña debe contener al menos un carácter especial.\");\n");
      out.write("            return;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          // Si la validación es exitosa, se puede continuar con el envío del formulario\n");
      out.write("          // o realizar otras acciones necesarias.\n");
      out.write("          alert(\"Contraseña válida. Enviar formulario.\");\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("    document.addEventListener('keydown', function(event) {\n");
      out.write("      if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {\n");
      out.write("        event.preventDefault(); // Evitar la acción predeterminada del evento\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
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
      out.write("\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("            <div class=\"login-info-container\">\n");
      out.write("\n");
      out.write("                <form class=\"needs-validation\" method=\"post\" action=\"UsuarioControlador\" novalidate onsubmit=\"return validarFormulario()\">\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                    <h2 class=\"title\">Registrarse</h2>\n");
      out.write("                    <p>Crea tu cuenta solo tomara un minuto</p>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <label>Ingrese su nombre</label>\n");
      out.write("                    <input type=\"text\"  onkeypress=\"return SoloLetras(event);\"  class=\"regis\" name=\"usuNombre\" placeholder=\"Nombre\" required>\n");
      out.write("                    <br><br>\n");
      out.write("                    \n");
      out.write("                    <label>Ingrese su apellido</label>\n");
      out.write("                    <input type=\"text\" onkeypress=\"return SoloLetras(event);\" class=\"regis\" name=\"usuApellido\" placeholder=\"Apellidos\" required>\n");
      out.write("                    <br><br>\n");
      out.write("                    \n");
      out.write("                    <label>Ingrese su número telefonico</label>\n");
      out.write("                    <input type=\"text\" onkeypress=\"return SoloNumeros(event);\" maxlength=\"10\"  class=\"regis\" name=\"usuTelefono\" placeholder=\"Telefono\" required>\n");
      out.write("                    <br><br>\n");
      out.write("                    \n");
      out.write("                    <label>Ingrese su cedula</label>\n");
      out.write("                    <input type=\"text\" onkeypress=\"return SoloNumeros(event);\" maxlength=\"10\"  class=\"regis\" name=\"usuCedula\" placeholder=\"Cedula\" required>\n");
      out.write("                    <br><br>\n");
      out.write("                    \n");
      out.write("                    <label>Ingrese su correo electronico</label>\n");
      out.write("                    <input type=\"email\" class=\"regis\" name=\"usuCorreo\" placeholder=\"Correo Electronico\" required>\n");
      out.write("                    <br><br>\n");
      out.write("                   \n");
      out.write("                    <label>Ingrese una dirección</label>\n");
      out.write("                    <input type=\"text\" class=\"regis\" name=\"usuDireccion\" placeholder=\"Direccion\" required>\n");
      out.write("                    <br><br>\n");
      out.write("                    \n");
      out.write("                    <label>Ingrese una contraseña</label>\n");
      out.write("                    <input type=\"password\" id=\"password\" class=\"regis\" name=\"usuPassword\" placeholder=\"Contraseña\" required>\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <input type=\"button\" value=\"MostrarContraseña\" onclick=\"mostrarContrasena()\" class=\"btn\">\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" value=\"Registrar\" class=\"btn\" onclick=\"validarContraseña()\">\n");
      out.write("\n");
      out.write("                    <input type=\"hidden\" name=\"opcion\" value=\"7\" class=\"btn\">\n");
      out.write("                    <input type=\"hidden\" name=\"rolId\" value=\"1\" class=\"btn\">\n");
      out.write("\n");
      out.write("                    <div class=\"Mensaje\">\n");
      out.write("                        ");

                                if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <img class=\"image-container\" src=\"images/registro.svg\" alt=\"registro\">\n");
      out.write("    </div>        \n");
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

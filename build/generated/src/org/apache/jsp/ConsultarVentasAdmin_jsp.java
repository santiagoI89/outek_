package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.PedidoDAO;
import ModeloVO.PedidoConsultarVO;
import java.util.ArrayList;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;

public final class ConsultarVentasAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/Logo..png\">\n");
      out.write("    <script src=\"js/validaciones.js\" type=\"text/javascript\"></script>\n");
      out.write("    <!--FUENTE DE GOOGLE-->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!--<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.3/examples/sidebars/\">-->\n");
      out.write("    <!--<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("    <link href=\"css/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"css/RegisCliente.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"css/formConsul.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"css/PagPrincipal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <title>Outek</title>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("        <script src=\"sweetalert2.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"sweetalert2.min.css\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Otros elementos del encabezado -->\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            th:nth-child(1),\n");
      out.write("            td:nth-child(1) {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $('#searchInput').on('input', function() {\n");
      out.write("                var searchValue = $(this).val().toLowerCase();\n");
      out.write("                $('table tbody tr').filter(function() {\n");
      out.write("                    $(this).toggle($(this).children('td:nth-child(3)').text().toLowerCase().indexOf(searchValue) > -1)\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("    <nav>\n");
      out.write("        <a href=\"PersonalDeVentas.jsp\">Inicio</a>\n");
      out.write("        <a href=\"ConsultarProducto.jsp\">Consulta de Productos</a>\n");
      out.write("        <a href=\"RegistrarProducto.jsp\">Registro de Productos</a>\n");
      out.write("        <a href=\"RegistraCompra.jsp\">Registro de Ventas</a>\n");
      out.write("        <form method=\"post\" action=\"Sesiones\" class=\"Sesiones\">\n");
      out.write("            <input type=\"submit\" value=\"Cerrar Sesión\" class=\"btnCs\">\n");
      out.write("        </form>\n");
      out.write("    </nav>\n");
      out.write("    <section class=\"textos-header\">\n");
      out.write("        <h1>TECHNOLOGY CHECK-OUT</h1>\n");
      out.write("        <h2>Somos una empresa que te ofrece los mejores productos</h2>\n");
      out.write("    </section>\n");
      out.write("    <div class=\"wave\" style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\">\n");
      out.write("        <path d=\"M0.00,50.10 C150.00,150.33 349.20,-50.10 500.00,50.10 L500.00,150.33 L0.00,150.33 Z\" style=\"stroke: none; fill: #fff;\"></path></svg></div>\n");
      out.write("</header>\n");
      out.write("<div class=\"consul\">\n");
      out.write("            <form class=\"formConsul\" novalidate>\n");
      out.write("                <h1 class=\"titleConsul\">Pedidos</h1>\n");
      out.write("                <br>\n");
      out.write("                <label>Ingrese la cedula</label>\n");
      out.write("                <input type=\"text\" id=\"searchInput\" placeholder=\"Buscar por cédula...\" class=\"ConsulInput\" onkeypress=\"return SoloNumeros2(event);\">\n");
      out.write("                <br><br>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("<table align=\"center\" border=\"1\" class=\"table table-striped\">\n");
      out.write("    <thead>\n");
      out.write("    <tr>\n");
      out.write("        <th>IdPedido</th>\n");
      out.write("        <th>NumeroSerie</th>\n");
      out.write("        <th>Cedula Cliente</th>\n");
      out.write("        <th>Fecha</th>\n");
      out.write("        <th>Id Producto</th>\n");
      out.write("        <th>Precio Producto</th>\n");
      out.write("        <th>Cantidad</th>\n");
      out.write("        <th>Total</th>\n");
      out.write("    </tr>\n");
      out.write("    </thead>\n");
      out.write("    ");

    PedidoConsultarVO peVO = new PedidoConsultarVO();
    PedidoDAO peDAO = new PedidoDAO(peVO);

    ArrayList<PedidoConsultarVO> lista = peDAO.listarActivos();
    for (int i = 0; i < lista.size(); i++) {
        peVO = lista.get(i);
        
      out.write("\n");
      out.write("        <tbody>\n");
      out.write("        <tr>\n");
      out.write("            <td data-titulo=\"ID\">");
      out.print(peVO.getPedID());
      out.write("</td>\n");
      out.write("            <td data-titulo=\"ID\">");
      out.print(peVO.getPednumeroSerie());
      out.write("</td>\n");
      out.write("            <td data-titulo=\"cedula\">");
      out.print(peVO.getPedCedula());
      out.write("</td>\n");
      out.write("            <td data-titulo=\"modelo\">");
      out.print(peVO.getPedFecha());
      out.write("</td>\n");
      out.write("            <td data-titulo=\"descripción\">");
      out.print(peVO.getDetPedIdproducto());
      out.write("</td>\n");
      out.write("            <td data-titulo=\"nombre\">");
      out.print(peVO.getDetPedprecioProducto());
      out.write("</td>\n");
      out.write("            <td data-titulo=\"precioVenta\">");
      out.print(peVO.getDetPedCantidad());
      out.write("</td>\n");
      out.write("            <td data-titulo=\"cantidad\">");
      out.print(peVO.getPedMonto());
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        </tbody>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"contenedor-footer\">\n");
      out.write("        <div class=\"content-foo\">\n");
      out.write("            <h4>Email</h4>\n");
      out.write("            <p>Techn0.Check0ut@gmail.com</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content-foo\">\n");
      out.write("            <h4>Telefono</h4>\n");
      out.write("            <p>3142573571</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content-foo\">\n");
      out.write("            <h4>Locación</h4>\n");
      out.write("            <p>Unilago</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <h2 class=\"titulo-final\">&copy; Outek | Technology Check-Out</h2>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
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

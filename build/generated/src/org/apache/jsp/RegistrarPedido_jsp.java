package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.MetodoPagoDAO;
import ModeloVO.MetodoPagoVO;

public final class RegistrarPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("     <title>Registrar Pedido</title>\n");
      out.write("     <script>\n");
      out.write("        window.addEventListener('load', function() {\n");
      out.write("          var currentDate = new Date().toISOString().slice(0,10);\n");
      out.write("          document.getElementById(\"fecha-actual\").innerHTML = currentDate;\n");
      out.write("          document.getElementById(\"PedFecha\").value = currentDate;\n");
      out.write("        });\n");
      out.write("      </script>\n");
      out.write("</head>\n");
      out.write("    <body >\n");
      out.write("        <form action=\"PedidoControlador\" method=\"POST\" align=\"center\">\n");
      out.write("        <label>DATOS DEL CLIENTE</label>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"text\" name=\"PedCliCedula\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getUsuCedula()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"placeholder=\"Cedula Cliente\">\n");
      out.write("        <br>\n");
      out.write("        <input type=\"submit\" name=\"accion\" value=\"BuscarCliente\">\n");
      out.write("        <br>\n");
      out.write("        <input type=\"text\" name=\"PedCliNombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getUsuNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Nombre Del Cliente\">\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <label>DATOS DEL PRODUCTO</label>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"text\" name=\"PedProId\" placeholder=\"Codigo Del Producto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getProId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <br>\n");
      out.write("        <input type=\"submit\" name=\"accion\" value=\"BuscarProducto\">\n");
      out.write("        <br>\n");
      out.write("        <input type=\"text\" name=\"PedProNombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"placeholder=\"Nombre Del Producto\">\n");
      out.write("        <br>\n");
      out.write("        <input type=\"text\" name=\"PedProPrecio\" placeholder=\"S/.0.00\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getProPrecioVenta()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <br>\n");
      out.write("        <input type=\"number\" name=\"PedProCantidad\" placeholder=\"Cantidad\">\n");
      out.write("        <br>\n");
      out.write("        <input type=\"text\" name=\"PedProStock\" placeholder=\"Stock\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getProCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <hr>\n");
      out.write("        <label>DATOS DEL PEDIDO</label>\n");
      out.write("        <br>\n");
      out.write("        <label id=\"fecha\"></label>\n");
      out.write("        <script>\n");
      out.write("        var date = new Date().toLocaleDateString();\n");
      out.write("        document.getElementById(\"fecha\").innerHTML = \"Fecha: \" + date;\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <select name=\"PedMetodoPago\" class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("        <option>Seleccione un Metodo De Pago...</option>\n");
      out.write("        ");

           MetodoPagoDAO metDAO = new MetodoPagoDAO();
           for (MetodoPagoVO metVO : metDAO.listar()) {
        
      out.write("\n");
      out.write("        <option value=\"");
      out.print(metVO.getMetId());
      out.write('"');
      out.write('>');
      out.print(metVO.getMetTipo());
      out.write("</option>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"submit\" name=\"accion\" value=\"Agregar\">\n");
      out.write("        </form>\n");
      out.write("        <input type=\"text\" name=\"PedId\" placeholder=\"Id Del Pedido\">\n");
      out.write("        <table border=\"1\" align=\"center\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Codigo</th>\n");
      out.write("                    <th>Producto</th>\n");
      out.write("                    <th>Precio</th>\n");
      out.write("                    <th>Cantidad</th>\n");
      out.write("                    <th>Subtotal</th>\n");
      out.write("                    <th>PrecioTotal</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            <c:forEach var=\"list\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPedId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("            </c:foreach>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <input type=\"submit\" name=\"accion\" value=\"Generar Venta\">\n");
      out.write("        <input type=\"submit\" name=\"accion\" value=\"Cancelar\">\n");
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

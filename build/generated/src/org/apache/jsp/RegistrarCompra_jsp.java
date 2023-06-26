package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.ProductoVO;
import ModeloDAO.ProductoDAO;

public final class RegistrarCompra_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>VENTAS</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("         <script>\n");
      out.write("        window.addEventListener('load', function() {\n");
      out.write("          var currentDate = new Date().toISOString().slice(0,10);\n");
      out.write("          document.getElementById(\"fecha-actual\").innerHTML = currentDate;\n");
      out.write("          document.getElementById(\"PedFecha\").value = currentDate;\n");
      out.write("        });\n");
      out.write("      </script>\n");
      out.write("      <script>\n");
      out.write("        function searchProducts() {\n");
      out.write("            var input = document.getElementById(\"searchInput\");\n");
      out.write("            var filter = input.value.toUpperCase();\n");
      out.write("            var select = document.getElementById(\"selectContainer\").querySelector(\"select\");\n");
      out.write("            var options = select.getElementsByTagName(\"option\");\n");
      out.write("\n");
      out.write("            for (var i = 0; i < options.length; i++) {\n");
      out.write("                var option = options[i];\n");
      out.write("                var txtValue = option.textContent || option.innerText;\n");
      out.write("\n");
      out.write("                if (txtValue.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                    option.style.display = \"\";\n");
      out.write("                } else {\n");
      out.write("                    option.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"d-flex\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <form action=\"PedidoControlador2?menu=NuevaVenta\" method=\"POST\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label id=\"fecha\"> </label>\n");
      out.write("                            <script>\n");
      out.write("                            var date = new Date().toLocaleDateString();\n");
      out.write("                            document.getElementById(\"fecha\").innerHTML = \"Fecha: \" + date;\n");
      out.write("                            </script>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Datos Del Cliente</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group d-flex\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <input type=\"text\" name=\"codigocliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getUsuCedula()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"Cedula Cliente\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <input type=\"submit\" name=\"accion\" value=\"BuscarCliente\" class=\"btn btn-outline-info\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <input type=\"text\" name=\"nombrescliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getUsuNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"Nombre Cliente\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Datos Del Producto</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group d-flex\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <input type=\"text\" id=\"searchInput\" onkeyup=\"searchProducts()\" placeholder=\"Buscar productos...\">\n");
      out.write("                            </div>\n");
      out.write("                             <div id=\"selectContainer\">\n");
      out.write("                                    <select name=\"codigoproducto\" class=\"col-sm-auto\" aria-label=\"Default select example\">\n");
      out.write("                                        <option>Seleccione un Producto...</option>\n");
      out.write("                                        ");
 
                                            ProductoDAO proDAO = new ProductoDAO();
                                            for (ProductoVO proVO : proDAO.listar()) {
                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(proVO.getProId());
      out.write('"');
      out.write('>');
      out.print(proVO.getProNombre());
      out.write("</option>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <input type=\"submit\" name=\"accion\" value=\"BuscarProducto\" class=\"btn btn-outline-info\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-auto\">\n");
      out.write("                                <input type=\"text\" name=\"PedProId2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"ID Del Producto\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-auto\">\n");
      out.write("                                <input type=\"text\" name=\"nombreproducto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" placeholder=\"Nombre Producto\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group d-flex\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <input type=\"text\" name=\"precio\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProPrecioVenta()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"S/.0.00\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-2\">\n");
      out.write("                                <input type=\"number\" name=\"cant\" id=\"cantidad\" class=\"form-control\" placeholder=\"Cantidad\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" name=\"stock\" id=\"stock\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Stock\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"btn btn-outline-info\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-7\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"d-flex col-sm-5 ml-auto\">\n");
      out.write("                            <label>NroSerie: </label>\n");
      out.write("                                <input type=\"text\" name=\"NroSerie\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nserie}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <table class=\"table table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Nro</th>\n");
      out.write("                                <th>Codigo</th>\n");
      out.write("                                <th>Descripcion</th>\n");
      out.write("                                <th>Precio</th>\n");
      out.write("                                <th>Cantidad</th>\n");
      out.write("                                <th>SubTotal</th>\n");
      out.write("                                <th>Acciones</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                        <c:forEach var=\"list\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getItem()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getSubTotal()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td class=\"d-flex\">\n");
      out.write("                                    <a href=\"PedidoControlador2?menu=NuevaVenta&accion=Eliminar&indice=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.item}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-danger\" style=\"margin-left: 10px\">Eliminar</a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </c:forEach>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-footer d-flex\">\n");
      out.write("                    <div clas=\"col-sm-6\">\n");
      out.write("                        <a href=\"PedidoControlador2?menu=NuevaVenta&accion=GenerarVenta\"  onclick=\"print()\"class=\"btn btn-success\">Generar Venta</a>\n");
      out.write("                        <a href=\"PedidoControlador2?menu=NuevaVenta&accion=CancelarOrden\"  class=\"btn btn-danger\">Cancelar Venta</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div clas=\"col-sm-4 ml-auto\">\n");
      out.write("                        <input type=\"text\" name=\"txtTotal\" value=\"S/. ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalpagar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("0\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                     <script>\n");
      out.write("    const cantidadInput = document.getElementById('cantidad');\n");
      out.write("    const stockInput = document.getElementById('stock');\n");
      out.write("\n");
      out.write("cantidadInput.addEventListener('input', function() {\n");
      out.write("        const cantidad = parseInt(cantidadInput.value);\n");
      out.write("        const stock = parseInt(stockInput.value);\n");
      out.write("\n");
      out.write("        if (cantidad > stock) {\n");
      out.write("            cantidadInput.value = stock;\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
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

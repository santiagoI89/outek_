package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.UsuarioVO;

public final class ConsultarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("         <head>\n");
      out.write("            <link rel=\"shortcut icon\" href=\"images/Logo..png\">\n");
      out.write("   \n");
      out.write("     <title>Realizar Pedido</title>\n");
      out.write("    \n");
      out.write("         </head>\n");
      out.write("<body>\n");
      out.write("        <form align=\"center\" method = \"post\" action=\"UsuarioControlador\" class=\"needs-validation\" novalidate>\n");
      out.write("            <h2>Digite su cedula</h2>\n");
      out.write("            \n");
      out.write("             <table  align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <th align=\"center\">                  \n");
      out.write("                         <div class=\"form-group\" >\n");
      out.write("                        <div class=\"form-floating mb-3\">\n");
      out.write("                            <input type=\"number\"  name=\"usuCedula\" class=\"form-control\" id=\"floatingInput\" placeholder=\"name@example.com\" required>\n");
      out.write("                            <label for=\"floatingInput\">Cedula</label>\n");
      out.write("                            <div class=\"invalid-feedback\">\n");
      out.write("                                Ingrese su cedula\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                        <div class=\"button\">\n");
      out.write("                        <input type=\"submit\" value= \"Consultar\" >\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                          </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("           \n");
      out.write("            <input type=\"hidden\" name=\"opcion\" value=\"11\">\n");
      out.write("        </form>  \n");
      out.write("        ");


            UsuarioVO usuVO = new UsuarioVO();
            UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
            ArrayList<UsuarioVO> lista = usuDAO.listar();

            for (int i = 0; i < lista.size(); i++) {
                usuVO = lista.get(i);
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
}
      out.write("  \n");
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

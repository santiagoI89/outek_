/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ProductoControlador", urlPatterns = {"/ProductoControlador"})
public class ProductoControlador2 extends HttpServlet 
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        //1.recibir datos vistas 
        String proId = request.getParameter("proId");
        String proModelo = request.getParameter("proModelo");
        String proDescripcion = request.getParameter("proDescripcion");
        String proNombre = request.getParameter("proNombre");
        String proCategoria = request.getParameter("proCategoria");
        String proEstado = request.getParameter("proEstado");
        String proImagen = request.getParameter("proImagen");
        String proCantidad = request.getParameter("proCantidad");
        String proPrecioVenta = request.getParameter("proPrecioVenta");
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        
        ProductoVO proVO = new ProductoVO(proId, proModelo, proDescripcion, proNombre, proCategoria, proEstado, proImagen, proCantidad, proPrecioVenta);
 
        ProductoDAO proDAO = new ProductoDAO(proVO);

        
        switch(opcion)
        {
            case 3:
                proVO = proDAO.consultarPorId(proId);
                if (proVO != null){
                 request.setAttribute("¡El producto encontrado!", proVO);
                 request.getRequestDispatcher("ActualizarProducto.jsp").forward(request, response);
                }else{
                request.setAttribute("mensajeError", "El producto no ha sido encontrado!");
                request.getRequestDispatcher("ConsultarProducto.jsp").forward(request, response);
                }
                break;
            case 4:
                if(proDAO.eliminarRegistro())
                {
                    request.setAttribute("mensajeExito", "Producto no inactivado correctamente");
                    request.getRequestDispatcher("ConsultarProducto.jsp").forward(request, response);
                }
                else
                {
                    request.setAttribute("mensajeError", "Producto inactivado correctamente");
                    request.getRequestDispatcher("ConsultarProducto.jsp").forward(request, response);
                }
            break;
            case 5:
                if(proDAO.reactivarRegistro())
                {
                    request.setAttribute("mensajeExito", "Producto no reactivado correctamente");
                    request.getRequestDispatcher("ConsultarProducto.jsp").forward(request, response);
                }
                else
                {
                    request.setAttribute("mensajeError", "Producto reactivado correctamente");
                    request.getRequestDispatcher("ConsultarProducto.jsp").forward(request, response);
                }
            break;
              case 6:
                proVO = proDAO.consultarPorId(proId);
                if (proVO != null){
                 request.setAttribute("¡El producto encontrado!", proVO);
                 request.getRequestDispatcher("RealizarDetallePedido.jsp").forward(request, response);
                }else{
                request.setAttribute("mensajeError", "¡El producto no ha sido encontrado!");
                request.getRequestDispatcher("ConsultarProductoPedido.jsp").forward(request, response);
                }
                break;
        } 
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

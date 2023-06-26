/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ModeloDAO.PedidoDAO;
import ModeloDAO.ProductoDAO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.PedidoConsultarVO;
import ModeloVO.PedidoVO;
import ModeloVO.ProductoVO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juand
 */
@WebServlet(name = "PedidoControlador3", urlPatterns = {"/PedidoControlador3"})
public class PedidoControlador3 extends HttpServlet {
  UsuarioVO usuario = new UsuarioVO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    int idUsuario;
    ProductoVO producto = new ProductoVO();
    ProductoDAO productoDAO = new ProductoDAO();
    double totalpagar;
    int numfac = 0;
    NumberFormat formatoNumero1;
    String total1;
    PedidoVO pedVO=new PedidoVO();
    List<PedidoVO>lista=new ArrayList<>();
    int item=0;
    String cod;
    String descripcion;
    double precio;
    int cant;
    double subtotal;
    String numeroSerie;
    PedidoDAO pedDAO = new PedidoDAO();
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String pedId = request.getParameter("pedId");
        String pedNumeroSerie = request.getParameter("pedNumeroSerie");
        String pedCedula = request.getParameter("pedCedula");
        String pedFecha = request.getParameter("pedFecha");
        String pedDetPedIdproducto = request.getParameter("pedDetPedIdproducto");
        String pedDetPedprecioProducto = request.getParameter("pedDetPedprecioProducto");
        String pedDetPedCantidad = request.getParameter("pedDetPedCantidad");
        String pedPedMonto = request.getParameter("pedPedMonto");
        String pedPedEstado = request.getParameter("pedPedEstado");
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        
        PedidoConsultarVO peVO = new PedidoConsultarVO(pedId, pedNumeroSerie, pedFecha, pedPedEstado, pedPedMonto, pedDetPedCantidad, pedDetPedprecioProducto, pedDetPedIdproducto, pedCedula);
 
        PedidoDAO peDAO = new PedidoDAO(peVO);
        
        
        switch(opcion)
        {
            
            case 1:
                if(peDAO.eliminarRegistro())
                {
                    request.setAttribute("mensajeExito", "Pedido no inactivado correctamente");
                    request.getRequestDispatcher("ConsultarVentas.jsp").forward(request, response);
                }
                else
                {
                    request.setAttribute("mensajeError", "Pedido inactivado correctamente");
                    request.getRequestDispatcher("ConsultarVentas.jsp").forward(request, response);
                }
            break;
            case 2:
                if(peDAO.reactivarRegistro())
                {
                    request.setAttribute("mensajeExito", "Pedido no reactivado correctamente");
                    request.getRequestDispatcher("ConsultarVentas.jsp").forward(request, response);
                }
                else
                {
                    request.setAttribute("mensajeError", "Pedido reactivado correctamente");
                    request.getRequestDispatcher("ConsultarVentas.jsp").forward(request, response);
                }
            break;
            case 3:
                if(peDAO.eliminarRegistro())
                {
                    request.setAttribute("mensajeExito", "Pedido no inactivado correctamente");
                    request.getRequestDispatcher("ConsultarCompra.jsp").forward(request, response);
                }
                else
                {
                    request.setAttribute("mensajeError", "Pedido inactivado correctamente");
                    request.getRequestDispatcher("ConsultarCompra.jsp").forward(request, response);
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

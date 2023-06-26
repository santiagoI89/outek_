/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ModeloDAO.PedidoDAO;
import ModeloVO.ProductoVO;
import ModeloDAO.ProductoDAO;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.PedidoVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import util.GenerarSerie;

/**
 *
 * @author valen
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class PedidoControlador extends HttpServlet {

    UsuarioVO usuario = new UsuarioVO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    int idUsuario;
    ProductoVO producto = new ProductoVO();
    ProductoDAO productoDAO = new ProductoDAO();
    double totalpagar;
    int numfac = 0;
    NumberFormat formatoNumero1;
    String total1;
    PedidoVO pedVO = new PedidoVO();
    List<PedidoVO> lista = new ArrayList<>();
    int item = 0;
    String cod;
    String descripcion;
    double precio;
    int cant;
    double subtotal;
    String numeroSerie;
    PedidoDAO pedDAO = new PedidoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        HttpSession miSesion = request.getSession();
        UsuarioVO usuario = (UsuarioVO) miSesion.getAttribute("datosUsuario");

        if (menu.equals("NuevaVenta")) {
            pedVO = new PedidoVO();
            switch (accion) {
                case "BuscarProducto":
                    String codigoProducto = request.getParameter("codigoproducto");
                    producto = productoDAO.buscar(codigoProducto);
                    request.setAttribute("p", producto);
                    request.setAttribute("lista", lista);
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("nserie", numeroSerie);
                    request.setAttribute("cliente", usuario);
                    break;
                case "Agregar":
                    request.setAttribute("cliente", usuario);
                    totalpagar = 0.0;
                    item++;
                    cod = producto.getProId();
                    descripcion = request.getParameter("nombreproducto");
                    precio = Double.parseDouble(request.getParameter("precio"));
                    cant = Integer.parseInt(request.getParameter("cant"));
                    subtotal = precio * cant;
                    pedVO = new PedidoVO();
                    pedVO.setItem(item);
                    pedVO.setIdProducto(cod);
                    pedVO.setDescripcion(descripcion);
                    pedVO.setPrecio(precio);
                    pedVO.setCantidad(cant);
                    pedVO.setSubTotal(subtotal);
                    lista.add(pedVO);
                    for (int i = 0; i < lista.size(); i++) {
                        totalpagar = totalpagar + lista.get(i).getSubTotal();
                    }
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("lista", lista);
                    numeroSerie=pedDAO.GenerarSerie();
                    if(numeroSerie==null) {
                        numeroSerie="00000001";
                    } else {
                        int incrementar= Integer.parseInt(numeroSerie);
                        GenerarSerie gs = new GenerarSerie();
                        numeroSerie=gs.NumeroSerie(incrementar);
                    }
                    request.setAttribute("nserie", numeroSerie);
                    request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
                    break;
                case "GenerarVenta":
                    for(int i=0; i<lista.size(); i++)
                    {
                        ProductoVO pro=new ProductoVO();
                        int cantidad=lista.get(i).getCantidad();
                        String idproducto=lista.get(i).getIdProducto();
                        ProductoDAO prodao=new ProductoDAO();
                        pro=prodao.buscarStock(idproducto);
                        int sac= Integer.parseInt(pro.getProCantidad());
                        sac=sac-cantidad;
                        prodao.actualizarStock(idproducto, sac);
                    }
                    pedVO.setIdCliente(usuario.getUsuCedula());
                    pedVO.setNumSerie(numeroSerie);
                    Date fechaActual = new Date();
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                    pedVO.setFecha(formatoFecha.format(fechaActual));
                    pedVO.setMonto(totalpagar);
                    pedDAO.guardarVenta(pedVO);
                    String idv =pedDAO.idVentas();
                    for(int i=0; i<lista.size(); i++)
                    {
                        pedVO = new PedidoVO();
                        pedVO.setId(idv);
                        pedVO.setIdProducto(lista.get(i).getIdProducto());
                        pedVO.setCantidad(lista.get(i).getCantidad());
                        pedVO.setPrecio(lista.get(i).getPrecio());
                        pedDAO.guardarDetalleVenta(pedVO);
                    }
                break;
                case "Eliminar":
                    int indice = Integer.parseInt(request.getParameter("indice"));
                    lista.remove(indice - 1);
                    item = 0;
                    for (PedidoVO pedido : lista) {
                        pedido.setItem(++item);
                    }
                    totalpagar = 0.0;
                    for (int i = 0; i < lista.size(); i++) {
                        totalpagar += lista.get(i).getSubTotal();
                    }
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("lista", lista);
                    request.setAttribute("cliente", usuario);
                    numeroSerie = pedDAO.GenerarSerie();
                    if (numeroSerie == null) {
                        numeroSerie = "00000001";
                    } else {
                        int incrementar = Integer.parseInt(numeroSerie);
                        GenerarSerie gs = new GenerarSerie();
                        numeroSerie = gs.NumeroSerie(incrementar);
                    }
                    request.setAttribute("nserie", numeroSerie);
                    request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
                    break;
                    case "CancelarOrden":
                    lista.clear(); 
                    item = 0;
                    totalpagar = 0.0;
                    producto = new ProductoVO();
                    numeroSerie = null;
                    request.setAttribute("cliente", usuario);
                    request.setAttribute("p", producto);
                    request.setAttribute("lista", lista);
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("nserie", numeroSerie);
                    request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
                    break;
                
            }
            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ModeloDAO.IniciarSesionDAO;
import ModeloDAO.RolDAO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.RolVO;
import ModeloVO.UsuarioVO;
import UsuarioControlador.InicioDeSesion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author juand
 */
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/UsuarioControlador"})
public class UsuarioControlador extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            //1.recibir datos vistas 
            String usuNombre = request.getParameter("usuNombre");
            String usuApellido = request.getParameter("usuApellido");
            String usuCedula = request.getParameter("usuCedula");
            String usuTelefono = request.getParameter("usuTelefono");
            String usuCorreo = request.getParameter("usuCorreo");
            String usuDireccion = request.getParameter("usuDireccion");
            String usuPassword = request.getParameter("usuPassword");
            String usuEstado = request.getParameter("usuEstado");
            String usuRolId = request.getParameter("rolId");
            int opcion = Integer.parseInt(request.getParameter("opcion"));
            
            UsuarioVO usuVO = new UsuarioVO(usuCedula, usuNombre, usuApellido, usuCorreo, usuDireccion, usuTelefono, usuPassword, usuEstado, usuRolId);
            InicioDeSesion iniVO = new InicioDeSesion(usuCedula, usuPassword);
            IniciarSesionDAO iniDAO = new IniciarSesionDAO(iniVO);

            UsuarioDAO usuDAO = new UsuarioDAO(usuVO);

            switch (opcion) {
                case 1:
                    if (usuDAO.agregarRegistro()) {
                        request.setAttribute("mensajeExito", "Usuario registrado correctamente");
                    } else {
                        request.setAttribute("mensajeError", "Usuario no registrado correctamente");

                    }
                    request.getRequestDispatcher("RegistrarUsu.jsp").forward(request, response);
                    break;
                case 2:
                    if (usuDAO.actualizarRegistro()) {
                        request.setAttribute("mensajeExito", "Usuario actualizado correctamente");
                    } else {
                        request.setAttribute("mensajeError", "Usuario no actualizado correctamente");

                    }
                    request.getRequestDispatcher("ConsultarUsu.jsp").forward(request, response);
                    break;
                case 3:
                    usuVO = usuDAO.consultarPorCedula(usuCedula);
                    if (usuVO != null) {
                        request.setAttribute("¡El usuario encontrado!", usuVO);
                        request.getRequestDispatcher("ActualizarUsu.jsp").forward(request, response);
                    } else {
                        request.setAttribute("mensajeError", "El usuario no ha sido encontrado!");
                        request.getRequestDispatcher("ConsultarUsu.jsp").forward(request, response);
                    }
                    break;
                case 4:
                    if (
                            
                        iniDAO.iniciarSesion(usuCedula, usuPassword)) {
                        HttpSession miSesion = request.getSession(true);
                        usuVO = usuDAO.consultarPorCedula(usuCedula);
                        miSesion.setAttribute("datosUsuario", usuVO);
                        String idUsuario = usuVO.getUsuCedula();
                        RolDAO rolDAO = new RolDAO();
                        RolVO rolVO = new RolVO();
                        ArrayList <RolVO> listaRoles = rolDAO.Iniciar(idUsuario);
                        for(int i=0; i<listaRoles.size(); i++)
                        {
                            rolVO = listaRoles.get(i);
                            if(listaRoles.size()>1)
                            {
                                request.getRequestDispatcher("Index.jsp").forward(request, response);
                            }
                            if(rolVO.getRolId().equals("2"))
                            {
                                request.getRequestDispatcher("Administrador.jsp").forward(request, response);
                            }
                            if(rolVO.getRolId().equals("3"))
                            {
                                request.getRequestDispatcher("PersonalDeVentas.jsp").forward(request, response);
                            }
                            if(rolVO.getRolId().equals("1"))
                            {
                                request.getRequestDispatcher("Cliente.jsp").forward(request, response);
                            }
                        }
                    }
                    else
                    {
                        request.setAttribute("mensajeError", "DATOS INCORRECTOS");
                        request.getRequestDispatcher("IniciarSesion.jsp").forward(request, response);
                    }
                    break;
                case 5:
                    if (usuDAO.eliminarRegistro()) {
                        request.setAttribute("mensajeExito", "Usuario no inactivado correctamente");
                        request.getRequestDispatcher("ActualizarUsu.jsp").forward(request, response);
                    } else {
                        request.setAttribute("mensajeError", "Usuario inactivado correctamente");
                        request.getRequestDispatcher("ConsultarUsu.jsp").forward(request, response);
                    }
                    break;
                case 6:
                    if (usuDAO.reactivarRegistro()) {
                        request.setAttribute("mensajeExito", "Usuario no reactivado correctamente");
                        request.getRequestDispatcher("ActualizarUsu.jsp").forward(request, response);
                    } else {
                        request.setAttribute("mensajeError", "Usuario reactivado correctamente");
                        request.getRequestDispatcher("ConsultarUsu.jsp").forward(request, response);
                    }
                    break;
                case 7:
                    if (usuDAO.agregarRegistro()) {
                        request.setAttribute("mensajeExito", "Usuario registrado correctamente");
                    } else {
                        request.setAttribute("mensajeError", "Usuario no registrado correctamente");

                    }
                    request.getRequestDispatcher("RegistrarCliente.jsp").forward(request, response);
                    break;
                case 8:
                    usuVO = usuDAO.consultarPorCedula(usuCedula);
                    if (usuVO != null) {
                        request.setAttribute("¡Cliente encontrado!", usuVO);
                        request.getRequestDispatcher("ActualizarCli.jsp").forward(request, response);
                    } else {
                        request.setAttribute("mensajeError", "Cliente no encontrado");

                    }
                    request.getRequestDispatcher("Cliente.jsp").forward(request, response);
                    break;
                case 9:
                    if (usuDAO.actualizarRegistro()) {
                        request.setAttribute("mensajeExito", "Usuario actualizado correctamente");
                    } else {
                        request.setAttribute("mensajeError", "Usuario no actualizado correctamente");

                    }
                    request.getRequestDispatcher("ActualizarCli.jsp").forward(request, response);
                    break;
                case 10:
                    if (usuDAO.actualizarRegistroCliente()) {
                        request.setAttribute("mensajeExito", "Usuario actualizado correctamente");
                    } else {
                        request.setAttribute("mensajeError", "Usuario no actualizado correctamente");

                    }
                    request.getRequestDispatcher("ActualizarCli.jsp").forward(request, response);
                    break;
                case 11:
                    usuVO = usuDAO.consultarPorCedula(usuCedula);
                    if (usuVO != null) {
                        request.setAttribute("¡Cliente encontrado!", usuVO);
                        request.getRequestDispatcher("RealizarPedido.jsp").forward(request, response);
                    } else {
                        request.setAttribute("mensajeError", "Cliente no encontrado");

                    }
                    request.getRequestDispatcher("Cliente.jsp").forward(request, response);
                    break;
                      case 12:
                    if (usuDAO.restablecerContrasena(usuCedula)) {
                        request.setAttribute("mensajeExito", "Usuario actualizado correctamente");
                    } else {
                        request.setAttribute("mensajeError", "Usuario no actualizado correctamente");
                        
                    }
                    request.getRequestDispatcher("IniciarSesion.jsp").forward(request, response);
                    break;
            }
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
        String listar = "Usuario.jsp";
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
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

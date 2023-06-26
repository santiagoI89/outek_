/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author APRENDIZ
 */
@WebServlet(urlPatterns = {"/EnvioCorreo"})
public class EnvioCorreo extends HttpServlet
{
    private String servidor, puerto,usuario, clave;
    public void init()
    {
        ServletContext context = getServletContext();//es un elemento donde puedo guardar informacion confidencial
        //despues de esto se crea el archivo context en web-if (archivos de configuracion del sistema)
        //tipo Standard Deployment Descriptor(web.xml) 
        servidor = context.getInitParameter("servidor");
        puerto =  context.getInitParameter("puerto");
        usuario =  context.getInitParameter("usuario");
        clave =  context.getInitParameter("clave");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String destino = request.getParameter("destino");
        String asunto = request.getParameter("asunto");
        String mensaje = request.getParameter("mensaje");
        
        String resultadoMensaje = "";
        
        try 
        {
            PropiedadesCorreo.envioCorreo(servidor, puerto, usuario, clave, destino, asunto, mensaje);
            resultadoMensaje = "El mensaje se envio correctamente";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            resultadoMensaje = "Error al enviar el correo" + e.getMessage();
        }
        finally
        {
            request.setAttribute("Estadomensaje",resultadoMensaje);
            getServletContext().getRequestDispatcher("/Contacto.jsp").forward(request, response);
        }
    }
}

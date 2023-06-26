/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author APRENDIZ
 */
public class PropiedadesCorreo {
    //Se crea un metodo estatico cuando su compocicion no va a ser modificada
    
    public static void envioCorreo(String servidor, String puerto, final String usuario,
            final String clave, String destino, String asunto, String mensaje) throws MessagingException
    {
        //Propiedades de un servidor SMTP -ahi se almacennan todas las propiedades anteriormente declaradas
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.host", servidor);
        propiedades.put("mail.smtp.port", puerto);
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable","true");
        
        
        //esto es un objeto instanciado - objeto con contenido
        Authenticator autenticar = new Authenticator() 
        {
            //es un metodo propio del java.mail solo se tiene que llamar
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new  PasswordAuthentication(usuario, clave);
            }
        };
        
            Session sesion = Session.getInstance(propiedades, autenticar);
            Message msg = new MimeMessage(sesion);
            msg.setFrom(new InternetAddress(usuario)); //El mensaje probiene de una direccion de internet
            InternetAddress[] direcciones = {new InternetAddress(destino)}; //crear un arreglo de direcciones con destino 
            msg.setRecipients(Message.RecipientType.TO, direcciones);// con una S al final para saber si es para un destinatario o varios
            msg.setSubject(asunto);
            msg.setSentDate(new Date());
            msg.setText (mensaje);
            
            Transport.send(msg, usuario, clave); //se envia con los parametros de autenticacion
    }
}
//despues de esto se envia mediante un servlet llamado EnvioCorreo

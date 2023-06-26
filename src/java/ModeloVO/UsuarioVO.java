/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author APRENDIZ
 */
public class UsuarioVO 
{
     private String usuCedula, usuNombre, usuApellido, usuCorreo, usuDireccion, usuTelefono, usuPassword, usuEstado, usuRolId;

    public UsuarioVO() {
    }

    public UsuarioVO(String usuCedula, String usuNombre, String usuApellido, String usuCorreo, String usuDireccion, String usuTelefono, String usuPassword, String usuEstado, String usuRolId) {
        this.usuCedula = usuCedula;
        this.usuNombre = usuNombre;
        this.usuApellido = usuApellido;
        this.usuCorreo = usuCorreo;
        this.usuDireccion = usuDireccion;
        this.usuTelefono = usuTelefono;
        this.usuPassword = usuPassword;
        this.usuEstado = usuEstado;
        this.usuRolId = usuRolId;
    }
    public String getUsuCedula() {
        return usuCedula;
    }

    public void setUsuCedula(String usuCedula) {
        this.usuCedula = usuCedula;
    }

    public String getUsuNombre() {
        return usuNombre;
    }

    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    public String getUsuApellido() {
        return usuApellido;
    }

    public void setUsuApellido(String usuApellido) {
        this.usuApellido = usuApellido;
    }

    public String getUsuCorreo() {
        return usuCorreo;
    }

    public void setUsuCorreo(String usuCorreo) {
        this.usuCorreo = usuCorreo;
    }

    public String getUsuDireccion() {
        return usuDireccion;
    }

    public void setUsuDireccion(String usuDireccion) {
        this.usuDireccion = usuDireccion;
    }

    public String getUsuTelefono() {
        return usuTelefono;
    }

    public void setUsuTelefono(String usuTelefono) {
        this.usuTelefono = usuTelefono;
    }

    public String getUsuPassword() {
        return usuPassword;
    }

    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }

    public String getUsuEstado() {
        return usuEstado;
    }

    public void setUsuEstado(String usuEstado) {
        this.usuEstado = usuEstado;
    }

    public String getUsuRolId() {
        return usuRolId;
    }

    public void setUsuRolId(String usuRolId) {
        this.usuRolId = usuRolId;
    }
    
}
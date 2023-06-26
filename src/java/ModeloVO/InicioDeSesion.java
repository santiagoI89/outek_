/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsuarioControlador;

/**
 *
 * @author juand
 */
public class InicioDeSesion 
{
    private String UsuCedula, UsuPassword;

    public InicioDeSesion() {
    }

    public InicioDeSesion(String UsuCedula, String UsuPassword) {
        this.UsuCedula = UsuCedula;
        this.UsuPassword = UsuPassword;
    }

    public String getUsuCedula() {
        return UsuCedula;
    }

    public void setUsuCedula(String UsuCedula) {
        this.UsuCedula = UsuCedula;
    }

    public String getUsuPassword() {
        return UsuPassword;
    }

    public void setUsuPassword(String UsuPassword) {
        this.UsuPassword = UsuPassword;
    }
    
    
}

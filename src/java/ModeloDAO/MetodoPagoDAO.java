/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.MetodoPagoVO;
import ModeloVO.RolVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConexionBd;

/**
 *
 * @author juand
 */
public class MetodoPagoDAO extends ConexionBd{ 
 private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private boolean operacion = false;
    private String sql;

    public MetodoPagoDAO() {
    }
    
public ArrayList<MetodoPagoVO> listar(){
        
        ArrayList<MetodoPagoVO> listaMet = new ArrayList<>();
            
        try {
            conexion = this.obtenerConexion();
            sql= "SELECT * FROM tblMetodoPago";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while(mensajero.next()){
                
            MetodoPagoVO metVO= new MetodoPagoVO (mensajero.getString(1), mensajero.getString(2));
            
            listaMet.add(metVO);
            
    }
        } catch (Exception e) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return listaMet;
    }
}

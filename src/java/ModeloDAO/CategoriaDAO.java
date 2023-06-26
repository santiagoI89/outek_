/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CategoriaVO;
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
public class CategoriaDAO extends ConexionBd{ 
 private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private boolean operacion = false;
    private String sql;
    
public ArrayList<CategoriaVO> listar(){
        
        ArrayList<CategoriaVO> listaCat = new ArrayList<>();
            
        try {
            conexion = this.obtenerConexion();
            sql= "SELECT * FROM tblcategoria";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while(mensajero.next()){
                
            CategoriaVO catVO= new CategoriaVO (mensajero.getString(1), mensajero.getString(2));
            
            listaCat.add(catVO);
            
    }
        } catch (Exception e) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return listaCat;
    }

}
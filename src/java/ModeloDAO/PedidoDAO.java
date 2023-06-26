/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.PedidoConsultarVO;
import ModeloVO.PedidoVO;
import ModeloVO.ProductoVO;
import ModeloVO.UsuarioVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConexionBd;

/**
 *
 * @author valen
 */
public class PedidoDAO extends ConexionBd{
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    PedidoVO pedVO = new PedidoVO();
    private boolean operacion = false;
    int r;
    String sql;
    String pedID, pednumeroSerie="", pedFecha="", pedEstado="", pedMonto="", detPedCantidad="", detPedprecioProducto="", detPedIdproducto="";

    public PedidoDAO() {
    }
    public PedidoDAO(PedidoConsultarVO peVO)
     {
        super();
        try 
        {
            // Conectarse a la base de datos
            conexion = this.obtenerConexion();
            // Trae los datos del VO al DAO
            pedID=peVO.getPedID();
            pednumeroSerie=peVO.getPednumeroSerie();
            pedFecha = peVO.getPedFecha();
            pedEstado = peVO.getPedEstado();
            pedMonto = peVO.getPedMonto();
            detPedCantidad = peVO.getDetPedCantidad();
            detPedprecioProducto = peVO.getDetPedprecioProducto();
            detPedIdproducto = peVO.getDetPedIdproducto();
        } 
        catch (Exception e) 
        {
          Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE,null,e); 
        }
    }
    public String GenerarSerie()
    {
        String numeroSerie="";
        String sql="select max(PedNumeroSerie) from tblpedido;";
        try
        {
            conexion = this.obtenerConexion();
            puente=conexion.prepareStatement(sql);
            mensajero=puente.executeQuery();
            while(mensajero.next())
            {
                numeroSerie=mensajero.getString(1);
            }
        }
        catch(Exception e)
        {
                    
        }
        return numeroSerie;
    }
    public String idVentas()
    {
        String idVentas="";
        String sql="select max(PedNumeroSerie) from tblpedido";
        try
        {
            conexion = this.obtenerConexion();
            puente=conexion.prepareStatement(sql);
            mensajero=puente.executeQuery();
            while(mensajero.next())
            {
                idVentas=mensajero.getString(1);
            }
        }
        catch(Exception e)
        {
            
        }
        return idVentas;
    }
    public int guardarVenta(PedidoVO pedido)
    {
        String sql="INSERT INTO tblpedido (PedFecha, PedNumeroSerie, PedMonto, tblusuario_UsuCedula) VALUES (?, ?, ?, ?);";
        try
        {            
            conexion = this.obtenerConexion();
            puente=conexion.prepareStatement(sql);
            puente.setString(4, pedido.getIdCliente());
            puente.setString(1, pedido.getFecha());
            puente.setString(2, pedido.getNumSerie());
            puente.setDouble(3, pedido.getMonto());
            puente.executeUpdate();
        }
        catch(Exception e)
        {
            
        }
        return r;
    }
    public int guardarDetalleVenta(PedidoVO pedido)
    {
        String sql="INSERT INTO tbldetallepedido (DetPedidoId, tblproducto_ProId, DetCantidad, DetPrecioVenta) VALUES (?, ?, ?, ?);";
        try
        {
            conexion = this.obtenerConexion();
            puente=conexion.prepareStatement(sql);
            puente.setString(1, pedido.getId());
            puente.setString(2, pedido.getIdProducto());
            puente.setInt(3, pedido.getCantidad());
            puente.setDouble(4, pedido.getPrecio());    
            puente.executeUpdate();
        }
        catch(Exception e)
        {
            
        }
        return r;
    }
    
    public ArrayList<PedidoConsultarVO> listar(){
        
        ArrayList<PedidoConsultarVO> lista = new ArrayList<>();
            
        try {
            conexion = this.obtenerConexion();
            sql= "SELECT p.PedId, p.PedNumeroSerie, p.PedFecha, dp.tblproducto_ProId, dp.DetPrecioVenta, dp.DetCantidad, (dp.DetPrecioVenta * dp.DetCantidad) AS Monto, p.PedEstado, p.tblusuario_UsuCedula\n" +
            "FROM tblPedido p\n" +
            "JOIN tblDetallepedido dp ON p.PedId = dp.DetPedidoId;";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while(mensajero.next())
            {
             PedidoConsultarVO peVO= new PedidoConsultarVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(8), mensajero.getString(7), mensajero.getString(6), mensajero.getString(5), mensajero.getString(4), mensajero.getString(9));
            lista.add(peVO);
           }
        } catch (Exception e) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return lista;
    }
    public boolean eliminarRegistro() 
    {
        try 
         {
            conexion = this.obtenerConexion();
            sql = "UPDATE tblPedido SET PedEstado = 'Inactivo' WHERE PedId = ?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, pedID );
            puente.executeUpdate();
         }
        catch (Exception e) 
        {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE,null,e);
        } finally{
            try {
                 this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return operacion;
    }
    public boolean reactivarRegistro() 
    {    
         try 
         {
            conexion = this.obtenerConexion();
            sql = "UPDATE tblPedido SET PedEstado = 'Activo' WHERE PedId = ?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, pedID);
            puente.executeUpdate();
         }
        catch (Exception e) 
        {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE,null,e);
        } finally{
            try {
                 this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return operacion;
    }
     public ArrayList<PedidoConsultarVO> listarActivos(){
        
        ArrayList<PedidoConsultarVO> lista = new ArrayList<>();
            
        try {
            conexion = this.obtenerConexion();
            sql= "SELECT p.PedId, p.PedNumeroSerie, p.PedFecha, dp.tblproducto_ProId, dp.DetPrecioVenta, dp.DetCantidad, (dp.DetPrecioVenta * dp.DetCantidad) AS Monto, p.PedEstado, p.tblusuario_UsuCedula\n" +
            "FROM tblPedido p\n" +
            "JOIN tblDetallepedido dp ON p.PedId = dp.DetPedidoId\n" +
            "WHERE p.PedEstado = 'Activo';";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while(mensajero.next())
            {
             PedidoConsultarVO peVO= new PedidoConsultarVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(8), mensajero.getString(7), mensajero.getString(6), mensajero.getString(5), mensajero.getString(4), mensajero.getString(9));
            lista.add(peVO);
           }
        } catch (Exception e) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return lista;
    }
     public ArrayList<PedidoConsultarVO> listarPedidosPorCliente(String cedula) {
         UsuarioVO usuVO = null;
         ArrayList<PedidoConsultarVO> lista = new ArrayList<>();
    try {
        conexion = this.obtenerConexion();
        String query = "SELECT p.PedId, p.PedNumeroSerie, p.PedFecha, dp.tblproducto_ProId, dp.DetPrecioVenta, dp.DetCantidad, (dp.DetPrecioVenta * dp.DetCantidad) AS Monto, p.PedEstado, p.tblusuario_UsuCedula\n" +
"FROM tblPedido p\n" +
"JOIN tblDetallepedido dp ON p.PedId = dp.DetPedidoId\n" +
"WHERE p.tblusuario_UsuCedula =? AND p.PedEstado = 'Activo';";
        puente = conexion.prepareStatement(query);
        puente.setString(1, cedula);
        mensajero = puente.executeQuery();
        
        while(mensajero.next())
            {
             PedidoConsultarVO peVO= new PedidoConsultarVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(8), mensajero.getString(7), mensajero.getString(6), mensajero.getString(5), mensajero.getString(4), mensajero.getString(9));
            lista.add(peVO);
           }

        
    } catch (Exception e) {
         Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE,null,e);
    } finally {
        try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE,null,e);
            }
    }

    return lista;
}


}

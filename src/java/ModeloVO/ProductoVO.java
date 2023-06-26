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
public class ProductoVO {
    
    private String  proId, proModelo, proDescripcion, proNombre,proCategoria,proEstado,proImagen, proCantidad, proPrecioVenta;

    public ProductoVO() {
    }

    public ProductoVO(String proId, String proModelo, String proDescripcion, String proNombre, String proCategoria, String proEstado, String proImagen, String proCantidad, String proPrecioVenta) {
        this.proId = proId;
        this.proModelo = proModelo;
        this.proDescripcion = proDescripcion;
        this.proNombre = proNombre;
        this.proCategoria = proCategoria;
        this.proEstado = proEstado;
        this.proImagen = proImagen;
        this.proCantidad = proCantidad;
        this.proPrecioVenta = proPrecioVenta;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProModelo() {
        return proModelo;
    }

    public void setProModelo(String proModelo) {
        this.proModelo = proModelo;
    }

    public String getProDescripcion() {
        return proDescripcion;
    }

    public void setProDescripcion(String proDescripcion) {
        this.proDescripcion = proDescripcion;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public String getProCategoria() {
        return proCategoria;
    }

    public void setProCategoria(String proCategoria) {
        this.proCategoria = proCategoria;
    }

    public String getProEstado() {
        return proEstado;
    }

    public void setProEstado(String proEstado) {
        this.proEstado = proEstado;
    }

    public String getProImagen() {
        return proImagen;
    }

    public void setProImagen(String proImagen) {
        this.proImagen = proImagen;
    }

    public String getProCantidad() {
        return proCantidad;
    }

    public void setProCantidad(String proCantidad) {
        this.proCantidad = proCantidad;
    }

    public String getProPrecioVenta() {
        return proPrecioVenta;
    }

    public void setProPrecioVenta(String proPrecioVenta) {
        this.proPrecioVenta = proPrecioVenta;
    }

}
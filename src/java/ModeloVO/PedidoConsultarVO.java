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
public class PedidoConsultarVO 
{
    String pedID, pednumeroSerie, pedFecha, pedEstado, pedMonto, detPedCantidad, detPedprecioProducto, detPedIdproducto, pedCedula;

    public PedidoConsultarVO() {
    }

    public PedidoConsultarVO(String pedID, String pednumeroSerie, String pedFecha, String pedEstado, String pedMonto, String detPedCantidad, String detPedprecioProducto, String detPedIdproducto, String pedCedula)
    {
        this.pedID = pedID;
        this.pednumeroSerie = pednumeroSerie;
        this.pedFecha = pedFecha;
        this.pedEstado = pedEstado;
        this.pedMonto = pedMonto;
        this.detPedCantidad = detPedCantidad;
        this.detPedprecioProducto = detPedprecioProducto;
        this.detPedIdproducto = detPedIdproducto;
        this.pedCedula = pedCedula;
    }

    public String getPedID() {
        return pedID;
    }

    public void setPedID(String pedID) {
        this.pedID = pedID;
    }

    public String getPednumeroSerie() {
        return pednumeroSerie;
    }

    public void setPednumeroSerie(String pednumeroSerie) {
        this.pednumeroSerie = pednumeroSerie;
    }

    public String getPedFecha() {
        return pedFecha;
    }

    public void setPedFecha(String pedFecha) {
        this.pedFecha = pedFecha;
    }

    public String getPedEstado() {
        return pedEstado;
    }

    public void setPedEstado(String pedEstado) {
        this.pedEstado = pedEstado;
    }

    public String getPedMonto() {
        return pedMonto;
    }

    public void setPedMonto(String pedMonto) {
        this.pedMonto = pedMonto;
    }

    public String getDetPedCantidad() {
        return detPedCantidad;
    }

    public void setDetPedCantidad(String detPedCantidad) {
        this.detPedCantidad = detPedCantidad;
    }

    public String getDetPedprecioProducto() {
        return detPedprecioProducto;
    }

    public void setDetPedprecioProducto(String detPedprecioProducto) {
        this.detPedprecioProducto = detPedprecioProducto;
    }

    public String getDetPedIdproducto() {
        return detPedIdproducto;
    }

    public void setDetPedIdproducto(String detPedIdproducto) {
        this.detPedIdproducto = detPedIdproducto;
    }

    public String getPedCedula() {
        return pedCedula;
    }

    public void setPedCedula(String pedCedula) {
        this.pedCedula = pedCedula;
    }
   
}

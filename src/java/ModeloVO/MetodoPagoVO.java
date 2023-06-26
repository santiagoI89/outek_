/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author juand
 */
public class MetodoPagoVO 
{
        private String MetId, MetTipo;

    public MetodoPagoVO(String MetId, String MetTipo) {
        this.MetId = MetId;
        this.MetTipo = MetTipo;
    }

    public String getMetId() {
        return MetId;
    }

    public void setMetId(String MetId) {
        this.MetId = MetId;
    }

    public String getMetTipo() {
        return MetTipo;
    }

    public void setMetTipo(String MetTipo) {
        this.MetTipo = MetTipo;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_edgarmembren;

/**
 *
 * @author edgarmembreno
 */
public class notasNormales {
    private String etiquetas;

    public notasNormales() {
    }

    public notasNormales(String etiquetas) {
        this.etiquetas = etiquetas;
    }
    

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    @Override
    public String toString() {
        return "notasNormales{" + "etiquetas=" + etiquetas + '}';
    }
    
    
}

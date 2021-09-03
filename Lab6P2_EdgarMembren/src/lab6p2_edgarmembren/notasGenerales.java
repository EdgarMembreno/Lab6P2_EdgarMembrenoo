/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_edgarmembren;

import java.util.Date;

/**
 *
 * @author edgarmembreno
 */
public class notasGenerales {
    private String titulo;
    private String hora;
    private Date Date;
    private String prioridad;
    private String etiquetas;
    private String texto;

    public notasGenerales() {
    }

    public notasGenerales(String titulo, String hora, Date Date, String prioridad, String etiquetas, String texto) {
        this.titulo = titulo;
        this.hora = hora;
        this.Date = Date;
        this.prioridad = prioridad;
        this.etiquetas = etiquetas;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    

   

    @Override
    public String toString() {
        return "notasGenerales{" + "titulo=" + titulo + ", hora=" + hora + ", Date=" + Date + ", prioridad=" + prioridad + ", etiquetas=" + etiquetas + ", texto=" + texto + '}';
    }

    

    

 
    
}

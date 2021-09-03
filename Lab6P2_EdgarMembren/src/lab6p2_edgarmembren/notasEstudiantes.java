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
public class notasEstudiantes {
    private String titulo;
    private Date date;
    private String descripcion;

    public notasEstudiantes() {
    }

    public notasEstudiantes(String titulo, Date date, String descripcion) {
        this.titulo = titulo;
        this.date = date;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "notasEstudiantes{" + "titulo=" + titulo + ", date=" + date + ", descripcion=" + descripcion + '}';
    }
    
    
    
}

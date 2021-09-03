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
public class notasEjecutivos {
    private String titulo;
    private String personas;
    private String asunto;
    private String descripcion;

    public notasEjecutivos() {
    }

    public notasEjecutivos(String titulo, String personas, String asunto, String descripcion) {
        this.titulo = titulo;
        this.personas = personas;
        this.asunto = asunto;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPersonas() {
        return personas;
    }

    public void setPersonas(String personas) {
        this.personas = personas;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "notasEjecutivos{" + "titulo=" + titulo + ", personas=" + personas + ", asunto=" + asunto + ", descripcion=" + descripcion + '}';
    }
    
    
}

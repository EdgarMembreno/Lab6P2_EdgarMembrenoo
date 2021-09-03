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
public class notasCreativos {
    private String ideas;
    private String descripcion;
    private String publico;

    public notasCreativos() {
    }

    public notasCreativos(String ideas, String descripcion, String publico) {
        this.ideas = ideas;
        this.descripcion = descripcion;
        this.publico = publico;
    }

    public String getIdeas() {
        return ideas;
    }

    public void setIdeas(String ideas) {
        this.ideas = ideas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    @Override
    public String toString() {
        return "notasCreativos{" + "ideas=" + ideas + ", descripcion=" + descripcion + ", publico=" + publico + '}';
    }
    
    
}

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
public class Normales {
    private String nombre;
    private String apellido;
    private String correo;
    private String hobbie;
    private String intereses;
    private String user;
    private String pass;

    public Normales() {
    }

    

    public Normales(String nombre, String apellido, String correo, String hobbie, String intereses, String user, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.hobbie = hobbie;
        this.intereses = intereses;
        this.user = user;
        this.pass = pass;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Normales{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", hobbie=" + hobbie + ", intereses=" + intereses + ", user=" + user + ", pass=" + pass + '}';
    }
    
    
    
    
}

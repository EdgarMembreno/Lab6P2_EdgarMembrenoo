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
public class Ejecutivos {
    private String nombre;
    private String apellido;
    private String correo;
    private String cargo;
    private String empresa;
    private String titulo;
    private String maestria;
    private String user;
    private String pass;

    public Ejecutivos() {
    }

    public Ejecutivos(String nombre, String apellido, String correo, String cargo, String empresa, String titulo, String maestria, String user, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cargo = cargo;
        this.empresa = empresa;
        this.titulo = titulo;
        this.maestria = maestria;
        this.user = user;
        this.pass = pass;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    @Override
    public String toString() {
        return "Ejecutivos{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", cargo=" + cargo + ", empresa=" + empresa + ", titulo=" + titulo + ", maestria=" + maestria + '}';
    }
    
}

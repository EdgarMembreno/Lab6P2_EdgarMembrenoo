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
public class Creativos {
    private String nombre;
    private String apellido;
    private String correo;
    private String ocupacion;
    private int edad;
    private String user;
    private String pass;

    public Creativos() {
    }

    public Creativos(String nombre, String apellido, String correo, String ocupacion, int edad, String user, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.ocupacion = ocupacion;
        this.edad = edad;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Creativos{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", ocupacion=" + ocupacion + ", edad=" + edad + '}';
    }
    
    
}

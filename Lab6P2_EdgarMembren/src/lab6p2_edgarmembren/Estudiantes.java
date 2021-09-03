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
public class Estudiantes {
    private String nombre;
    private String apellido;
    private String correo;
    private String carrera;
    private int aCarrera;
    private String user;
    private String pass;
    

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, String correo, String carrera, int aCarrera, String user, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.carrera = carrera;
        this.aCarrera = aCarrera;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getaCarrera() {
        return aCarrera;
    }

    public void setaCarrera(int aCarrera) {
        this.aCarrera = aCarrera;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", carrera=" + carrera + ", aCarrera=" + aCarrera + '}';
    }
    
    
}

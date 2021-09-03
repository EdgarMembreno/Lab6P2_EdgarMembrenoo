/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_edgarmembren;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edgarmembreno
 */
public class adminEjecutivos {

    private ArrayList<Ejecutivos> listaEjecutivos = new ArrayList();
    private File archivo = null;

    public adminEjecutivos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Ejecutivos> getListaEjecutivos() {
        return listaEjecutivos;
    }

    public void setListaEjecutivos(ArrayList<Ejecutivos> listaEjecutivos) {
        this.listaEjecutivos = listaEjecutivos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaEjecutivos;
    }

    public void setEjecutivo(Ejecutivos e) {
        this.listaEjecutivos.add(e);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Ejecutivos t : listaEjecutivos) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCorreo() + ";");
                bw.write(t.getCargo() + ";");
                bw.write(t.getEmpresa() + ";");
                bw.write(t.getTitulo() + ";");
                bw.write(t.getMaestria() + ";");
                bw.write(t.getUser() + ";");
                bw.write(t.getPass() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaEjecutivos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaEjecutivos.add(new Ejecutivos(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}

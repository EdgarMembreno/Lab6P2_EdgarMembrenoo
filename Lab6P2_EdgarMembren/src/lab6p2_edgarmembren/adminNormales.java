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
public class adminNormales {

    private ArrayList<Normales> listaNormales = new ArrayList();
    private File archivo = null;

    public adminNormales(String path) {
        archivo = new File(path);
    }

    public ArrayList<Normales> getListaNormales() {
        return listaNormales;
    }

    public void setListaNormales(ArrayList<Normales> listaNormales) {
        this.listaNormales = listaNormales;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaNormales;
    }

    public void setNormal(Normales e) {
        this.listaNormales.add(e);
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Normales t : listaNormales) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCorreo() + ";");
                bw.write(t.getHobbie() + ";");
                bw.write(t.getIntereses() + ";");                
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
        listaNormales = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaNormales.add(new Normales(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}

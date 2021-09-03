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
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author edgarmembreno
 */
public class adminNotasGenerales {

    private ArrayList<notasGenerales> listaNG = new ArrayList();
    private File archivo = null;

    public adminNotasGenerales(String path) {
        archivo = new File(path);
    }

    public ArrayList<notasGenerales> getListaNG() {
        return listaNG;
    }

    public void setListaNG(ArrayList<notasGenerales> listaNG) {
        this.listaNG = listaNG;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaNG;
    }

    public void setNG(notasGenerales c) {
        this.listaNG.add(c);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (notasGenerales t : listaNG) {
                bw.write(t.getTitulo() + ";");
                bw.write(t.getDate() + ";");
                bw.write(t.getHora() + ";");
                bw.write(t.getPrioridad() + ";");
                bw.write(t.getEtiquetas()+ ";");
                bw.write(t.getTexto() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaNG= new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                   listaNG.add(new notasGenerales(sc.next(), sc.next(), new Date(), sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}

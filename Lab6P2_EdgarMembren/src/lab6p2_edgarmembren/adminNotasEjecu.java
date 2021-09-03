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
public class adminNotasEjecu {

    private ArrayList<notasEjecutivos> listaNE = new ArrayList();
    private File archivo = null;

    public adminNotasEjecu(String path) {
        archivo = new File(path);
    }

    public ArrayList<notasEjecutivos> getListaNE() {
        return listaNE;
    }

    public void setListaNE(ArrayList<notasEjecutivos> listaNE) {
        this.listaNE = listaNE;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaNE;
    }

    public void setNEj(notasEjecutivos c) {
        this.listaNE.add(c);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (notasEjecutivos t : listaNE) {
                bw.write(t.getTitulo() + ";");
                bw.write(t.getPersonas() + ";");
                bw.write(t.getAsunto() + ";");
                bw.write(t.getDescripcion() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaNE = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaNE.add(new notasEjecutivos(sc.next(), sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}

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
public class adminNotasCrea {

    private ArrayList<notasCreativos> listaNC = new ArrayList();
    private File archivo = null;

    public adminNotasCrea(String path) {
        archivo = new File(path);
    }

    public ArrayList<notasCreativos> getListaNC() {
        return listaNC;
    }

    public void setListaNC(ArrayList<notasCreativos> listaNC) {
        this.listaNC = listaNC;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaNC;
    }

    public void setNC(notasCreativos c) {
        this.listaNC.add(c);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (notasCreativos t : listaNC) {
                bw.write(t.getIdeas() + ";");
                bw.write(t.getDescripcion() + ";");
                bw.write(t.getPublico() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaNC = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaNC.add(new notasCreativos(sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}

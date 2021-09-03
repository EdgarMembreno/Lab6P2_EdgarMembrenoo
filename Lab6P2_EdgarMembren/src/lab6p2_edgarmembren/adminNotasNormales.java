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
public class adminNotasNormales {

    private ArrayList<notasNormales> listaNN= new ArrayList();
    private File archivo = null;

    public adminNotasNormales(String path) {
         archivo = new File(path);
    }

    public ArrayList<notasNormales> getListaNN() {
        return listaNN;
    }

    public void setListaNN(ArrayList<notasNormales> listaNN) {
        this.listaNN = listaNN;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaNN;
        
    }
     public void setNEj(notasNormales c) {
        this.listaNN.add(c);
    }
       public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (notasNormales t : listaNN) {
                bw.write(t.getEtiquetas() + ";");          
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaNN = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaNN.add(new notasNormales(sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
    
    

}

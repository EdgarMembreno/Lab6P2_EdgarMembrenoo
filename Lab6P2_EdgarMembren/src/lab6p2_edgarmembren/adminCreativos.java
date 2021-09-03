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
public class adminCreativos {
    
    private ArrayList<Creativos> listaCreativos = new ArrayList();
    private File archivo = null;
    
    public adminCreativos(String path) {
        archivo = new File(path);
    }
    
    public ArrayList<Creativos> getListaCreativos() {
        return listaCreativos;
    }
    
    public void setListaCreativos(ArrayList<Creativos> listaCreativos) {
        this.listaCreativos = listaCreativos;
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    @Override
    public String toString() {
        return "" + listaCreativos;
    }
    
    public void setCreativo(Creativos c) {
        this.listaCreativos.add(c);
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Creativos t : listaCreativos) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCorreo() + ";");
                bw.write(t.getOcupacion() + ";");
                bw.write(t.getEdad() + ";");
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
        listaCreativos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaCreativos.add(new Creativos(sc.next(), sc.next(), sc.next(), sc.next(), Integer.parseInt(sc.next()), sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_sahorycano;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author Sahory
 */
public class claudilist {

    private String nombre;
    private File archivo = null;
    private ArrayList<Clau> Clau = new ArrayList();

    public claudilist() {
    }

    public claudilist(String path) {
        archivo = new File(path);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Clau> getSeresvivos() {
        return Clau;
    }

    public void setSeresvivos(ArrayList<Clau> Clau) {
        this.Clau = Clau;
    }

    @Override
    public String toString() {
        return "Lista{" + "nombre =" + nombre + ", archivo =" + archivo + ", Programas =" + Clau + '}';
    }

    public void EscribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Clau t : Clau) {
                bw.write(t.getNombre() + "/");
                bw.write(t.getPuntuacion() + "/");
                bw.write(t.getAños() + "/");
                bw.write(t.getTipo() + "/");
                bw.write(t.getGenero() + "/");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void CargarArchivo(JTextArea TextArea) {
        try {
            FileReader fr = null;
            BufferedReader br = null;
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                TextArea.append(linea);
                TextArea.append("\n");
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CargarArchivo2() {
        Scanner entrada = null;
        Clau = new ArrayList();
        if (archivo.exists()) {
            try {
                entrada = new Scanner(archivo);
                entrada.useDelimiter("/");
                while (entrada.hasNext()) {
                    Clau.add(new Clau(entrada.next(), entrada.nextInt(), entrada.nextInt(), entrada.next(), entrada.next()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            entrada.close();
        }
    }
}

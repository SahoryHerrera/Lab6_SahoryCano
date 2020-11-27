/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_sahorycano;

/**
 *
 * @author Sahory
 */
public class Clau {

    private String nombre;
    private int puntuacion;
    private int años;
    private String tipo;
    private String genero;

    public Clau() {
    }

    public Clau(String nombre, int Puntuacion, int años, String Tipo, String Genero) {
        this.nombre = nombre;
        this.puntuacion = Puntuacion;
        this.años = años;
        this.tipo = Tipo;
        this.genero = Genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        if (puntuacion >= 1 && puntuacion <= 10) {
            this.puntuacion = puntuacion;
        }
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre;
    }

}

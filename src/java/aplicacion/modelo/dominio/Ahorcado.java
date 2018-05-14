/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Elena
 */
public class Ahorcado implements Serializable {

    private String palabraAdivinar;
    private char[] palabraAhorcado;
    private int intentos;
    private String imagen;

    public Ahorcado() {
        palabraAdivinar = new String();
        palabraAhorcado = new char[10];
        intentos = 5;

    }

    public Ahorcado(String palabraAdivinar, char[] palabraAhorcado, int intentos) {
        this.palabraAdivinar = palabraAdivinar;
        this.palabraAhorcado = palabraAhorcado;
        this.intentos = intentos;
    }

    /**
     * @return the palabraAdivinar
     */
    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    /**
     * @param palabraAdivinar the palabraAdivinar to set
     */
    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    /**
     * @return the palabraAhorcado
     */
    public char[] getPalabraAhorcado() {
        return palabraAhorcado;
    }

    /**
     * @param palabraAhorcado the palabraAhorcado to set
     */
    public void setPalabraAhorcado(char[] palabraAhorcado) {
        this.palabraAhorcado = palabraAhorcado;
    }

    /**
     * @return the intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void empezarJuego(String palabra) {
        setPalabraAdivinar(palabra);
    }

    public ArrayList<String> getPalabraAhorcadoFormato() {
        ArrayList<String> caracteresPalabra = new ArrayList();
        for (int i = 0; i < getPalabraAdivinar().length(); i++) {
            caracteresPalabra.add(String.valueOf(getPalabraAhorcado()[i]));

        }
        return caracteresPalabra;
    }

    public boolean buscarLetra(char c) {
        boolean encontrado = false;
        for (int i = 0; i < getPalabraAdivinar().length(); i++) {
            if (c == getPalabraAdivinar().charAt(i)) {
                encontrado = true;
                palabraAhorcado[i] = c;
            }
            if (encontrado == false) {
                setIntentos(getIntentos() - 1);
            }
        }
        if (encontrado == false) {
            setIntentos(getIntentos() - 1);
            switch (getIntentos()) {
                case 4:
                    setImagen("/images/ahorcado01.png");
                    break;
                case 3:
                    setImagen("/images/ahorcado02.png");
                    break;
                case 2:
                    setImagen("/images/ahorcado03.png");
                    break;
                case 1:
                    setImagen("/images/ahorcado04.png");
                    break;
                case 0:
                    setImagen("/images/ahorcado05.png");
                    break;
              }
        }
        return encontrado;
    }

    public boolean juegoGanado() {
        boolean ganador = true;
        for (int i = 0; i < getPalabraAdivinar().length(); i++) {
            if (getPalabraAdivinar().charAt(i) != getPalabraAhorcado()[i]) {
                ganador = false;
            }

        }
        return ganador;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}

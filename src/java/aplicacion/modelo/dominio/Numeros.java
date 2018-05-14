/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author Elena
 */
public class Numeros {

    private int numero;
  

    public Numeros(int numero) {
        this.numero = numero;
    }

    public Numeros() {
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}

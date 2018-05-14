/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Elena
 */
public class Calculadora implements Serializable {

    public Calculadora() {
    }

    public int sumar(int primerNumero, int segundoNumero) {
        return primerNumero + segundoNumero;
    }

    public int restar(int primerNumero, int segundoNumero) {
        return primerNumero - segundoNumero;
    }

    public int multiplicar(int primerNumero, int segundoNumero) {
        return primerNumero * segundoNumero;
    }

    public int dividir(int a, int b) {
        return a / b;
    }
}

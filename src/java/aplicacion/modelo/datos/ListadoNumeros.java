/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Numeros;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Elena
 */
public class ListadoNumeros implements Serializable {

    private ArrayList<Numeros> listado;
    private int mayor = 0;
    private int menor = 0;
    private double promedio = 0;

    public ListadoNumeros() {
        
    }

    public ListadoNumeros(ArrayList<Numeros> listado) {
        this.listado = listado;
    }

    /**
     * @return the listado
     */
    public ArrayList<Numeros> getListado() {
        return listado;
    }

    /**
     * @param listado the listado to set
     */
    public void setListado(ArrayList<Numeros> listado) {
        this.listado = listado;
    }

    public void agregarNumero(Numeros unNumero) {
        getListado().add(unNumero);
    }

    /**
     * @return the mayor
     */
    public int getMayor() {
        return mayor;
    }

    /**
     * @param mayor the mayor to set
     */
    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    /**
     * @return the menor
     */
    public int getMenor() {
        return menor;
    }

    /**
     * @param menor the menor to set
     */
    public void setMenor(int menor) {
        this.menor = menor;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int mayor() {
        for (Numeros a : listado) {
            if (a.getNumero() > getMayor()) {
                setMayor(a.getNumero());
            }
        }
        return getMayor();
    }

    public int menor() {
        for (Numeros a : listado) {
            if (a.getNumero() < getMenor()) {
                setMenor(a.getNumero());
            }
        }
        return getMenor();
    }

    public double promedio() {
        int cont = 0;
        int total = 0;
        for (Numeros a : listado) {
            total=a.getNumero()+total;
            cont++;
        }
        setPromedio(total/cont);
        return getPromedio();
    }
}

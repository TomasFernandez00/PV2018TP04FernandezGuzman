/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListadoNumeros;
import aplicacion.modelo.dominio.Numeros;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Elena
 */
@ManagedBean
@ViewScoped
public class NumerosFormBean {
    private Numeros numeros;
    private ListadoNumeros listadoNumeros;
    private int mayor;
    private int menor;
    private double promedio;
    /**
     * Creates a new instance of NumerosFormBean
     */
    public NumerosFormBean() {
        listadoNumeros = new ListadoNumeros();
    }

    public NumerosFormBean(Numeros numeros, ListadoNumeros listadoNumeros, int mayor, int menor, double promedio) {
        this.numeros = numeros;
        this.listadoNumeros = listadoNumeros;
        this.mayor = mayor;
        this.menor = menor;
        this.promedio = promedio;
    }

   

    /**
     * @return the listadoNumeros
     */
    public ListadoNumeros getListadoNumeros() {
        return listadoNumeros;
    }

    /**
     * @param listadoNumeros the listadoNumeros to set
     */
    public void setListadoNumeros(ListadoNumeros listadoNumeros) {
        this.listadoNumeros = listadoNumeros;
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
    
    public void agregarNumero(){
       listadoNumeros.agregarNumero(numeros);
    }
    
    public void CalcularMayor(){
        setMayor(listadoNumeros.mayor());
    }
    
    public void CalcularMenor(){
        setMenor(listadoNumeros.menor());
    }
    public void CalcularPromedio(){
        setPromedio(listadoNumeros.promedio());
    }
    /**
     * @return the numeros
     */
    public Numeros getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(Numeros numeros) {
        this.numeros = numeros;
    }
}

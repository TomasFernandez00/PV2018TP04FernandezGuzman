/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListadoNumeros;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Elena
 */
@ManagedBean
@ViewScoped
public class NumerosFormBean {
    private int numero;
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

	public void agregarNumero() {
		listadoNumeros.getListado().add(numero);
	}
	
	public void calcularMenor() {
		menor = Integer.MAX_VALUE;
		for (int i = 0 ; i < listadoNumeros.getListado().size() ; i++) {
			if (listadoNumeros.getListado().get(i) > mayor) {
				mayor =  listadoNumeros.getListado().get(i);
			}
			if (listadoNumeros.getListado().get(i) < menor) {
				menor = listadoNumeros.getListado().get(i);
			}
		}
		listadoNumeros.setMenor(menor);
	}

	public void calcularMayor() {
		mayor = 0;
		for (int i = 0 ; i < listadoNumeros.getListado().size() ; i++) {
			if (listadoNumeros.getListado().get(i) > mayor) {
				mayor =  listadoNumeros.getListado().get(i);
			}
		}
		listadoNumeros.setMayor(mayor);
	}

	public void calcularPromedio() {
		setPromedio(0);
		for (int i = 0 ; i < listadoNumeros.getListado().size() ; i++) {
			setPromedio(getPromedio() + listadoNumeros.getListado().get(i));
		}
		setPromedio(getPromedio() / listadoNumeros.getListado().size());
		listadoNumeros.setPromedio(getPromedio());
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

	/**
	 * @return the promedio
	 */
}

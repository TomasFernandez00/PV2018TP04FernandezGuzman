/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Elena
 */
public class ListadoNumeros implements Serializable {

	private ArrayList<Integer> listado;
	private int mayor;
	private int menor;
	private double promedio;

	public ListadoNumeros() {
		listado = new ArrayList();
	}

	/**
	 * @return the listado
	 */
	public ArrayList<Integer> getListado() {
		return listado;
	}

	/**
	 * @param listado the listado to set
	 */
	public void setListado(ArrayList<Integer> listado) {
		this.listado = listado;
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

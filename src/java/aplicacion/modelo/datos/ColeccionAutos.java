/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Auto;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tomas Fernandez
 */
public class ColeccionAutos implements Serializable {

	private ArrayList<Auto> autos;

	public ColeccionAutos() {
		autos = new ArrayList();
	}

	public void agregarAutos(Auto unAuto) {
		getAutos().add(unAuto);
	}

	public void modificarAutos(Auto unAuto) {
		for (Auto a : autos) {
			if (a.getPatente().equals(unAuto.getPatente())) {
				getAutos().set(autos.indexOf(a), unAuto);
				break;
			}
		}
	}

	public void eliminarAutos(Auto unAuto) {
		for (Auto a : autos) {
			if (a.getPatente().equals(unAuto.getPatente())) {
				autos.remove(autos.indexOf(a));
				break;
			}
		}
	}

	public ArrayList<Auto> getAutos() {
		return autos;
	}

	public void setAutos(ArrayList<Auto> autos) {
		this.autos = autos;
	}
}

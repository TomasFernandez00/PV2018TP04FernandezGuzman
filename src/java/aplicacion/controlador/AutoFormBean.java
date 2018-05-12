/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ColeccionAutos;
import aplicacion.modelo.dominio.Auto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Tomas Fernandez EdM
 */
@ManagedBean
@ViewScoped
public class AutoFormBean implements Serializable {

	private ColeccionAutos autos;
	private Auto auto;
	private String patente;
	private String marca;
	private String modelo;
	private String color;
	private String combustible;

	public AutoFormBean() {
		autos = new ColeccionAutos();
	}

	public void argregarAuto() {
		auto = new Auto(getPatente(), getMarca(), getModelo(), getColor(), getCombustible());
		autos.agregarAutos(auto);
	}

	public void establecerAuto(Auto unAuto) {
		setAuto(unAuto);
	}

	public void modificarAuto() {
		autos.modificarAutos(auto);
	}

	public void eliminarAuto() {
		autos.eliminarAutos(auto);
	}

	public ColeccionAutos getAutos() {
		return autos;
	}

	public void setAutos(ColeccionAutos autos) {
		this.autos = autos;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
}

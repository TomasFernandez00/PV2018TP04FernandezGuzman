/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Tomas Fernandez EdM
 */
@ManagedBean
@ViewScoped
public class TemperaturaFormBean implements Serializable {

	private double temperatura;
	private char tipo;
	private double temperaturaConvertida;

	public TemperaturaFormBean() {
		temperatura = 0;
		tipo = '\u0000';
		temperaturaConvertida = 0;
	}

	public void convertirFarenheit() {
		switch (tipo) {
			case 'c':
				setTemperaturaConvertida((getTemperatura() * 1.8) + 32);
				break;
			case 'f':
				setTemperaturaConvertida(getTemperatura());
				break;
			case 'k':
				setTemperaturaConvertida((getTemperatura() * 1.8) - 459.67);
				break;
		}
	}

	public void convertirCelcius() {
		switch (tipo) {
			case 'c':
				setTemperaturaConvertida(getTemperatura());
				break;
			case 'f':
				setTemperaturaConvertida((getTemperatura() - 32) / 1.8);
				break;
			case 'k':
				setTemperaturaConvertida(getTemperatura() - 273.15);
				break;
		}
	}

	public void convertirKelvin() {
		switch (tipo) {
			case 'c':
				setTemperaturaConvertida(getTemperatura() + 273.15);
				break;
			case 'f':
				setTemperaturaConvertida((getTemperatura() + 459.67) / 1.8);
				break;
			case 'k':
				setTemperaturaConvertida(getTemperatura());
				break;
		}
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public double getTemperaturaConvertida() {
		return temperaturaConvertida;
	}

	public void setTemperaturaConvertida(double temperaturaConvertida) {
		this.temperaturaConvertida = temperaturaConvertida;
	}

}

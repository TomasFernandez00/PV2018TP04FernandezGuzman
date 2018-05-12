/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class ListadoLibros implements Serializable{

	private ArrayList<Libro> libros;

	public ListadoLibros() {
		libros = new ArrayList();
	}

	public ListadoLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public void agregarLibro(Libro unLibro) {
		getLibros().add(unLibro);
	}
	
	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

}

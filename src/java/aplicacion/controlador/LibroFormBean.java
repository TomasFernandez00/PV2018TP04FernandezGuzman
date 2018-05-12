/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListadoLibros;
import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Tomas Fernandez EdM
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{

	private ListadoLibros libros;
	private Libro libro;
	private String autor;
	private String titulo;
	private int precio;
	private int isbn;

	public LibroFormBean() {
		libros = new ListadoLibros();
	}

	public void agregarLibro() {
		libro = new Libro(getAutor(), getTitulo(), getPrecio(), getIsbn());
		libros.agregarLibro(libro);
	}

	public ListadoLibros getLibros() {
		return libros;
	}

	public void setLibros(ListadoLibros libros) {
		this.libros = libros;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
}

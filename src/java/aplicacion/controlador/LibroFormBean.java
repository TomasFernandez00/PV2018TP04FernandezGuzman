/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListadoLibros;
import aplicacion.modelo.dominio.Autor;
import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Tomas Fernandez EdM
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{

	private Autor autor;
	private ArrayList<Autor> autores;
	private ListadoLibros libros;
	private Libro libro;
	private String titulo;
	private int precio;
	private int isbn;

	public LibroFormBean() {
		libros = new ListadoLibros();
		autores = new ArrayList();
		autores.add(new Autor ("Tomas", "Fernandez", "42355492"));
		autores.add(new Autor ("Tiago", "Brizuela", "43678512"));
		autores.add(new Autor ("Martin", "Guzman", "42598678"));
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

	/**
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	/**
	 * @return the autores
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}

	/**
	 * @param autores the autores to set
	 */
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}
}

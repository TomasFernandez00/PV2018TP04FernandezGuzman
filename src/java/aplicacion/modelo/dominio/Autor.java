/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class Autor {
	private String nombre;
	private String apellido;
	private String dni;

	public Autor() {
	}

	public Autor(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	@Override
	public boolean equals (Object other) {
		return (other instanceof Autor) && (dni !=null )? dni.equals(((Autor) other).dni):(other == this);
	}

	@Override
	public int hashCode() {
		return (dni!=null)? (this.getClass().hashCode() + dni.hashCode()): super.hashCode();
	}

	@Override
	public String toString() {
		return String.format("Autor: [%s,%s]", apellido, nombre);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}

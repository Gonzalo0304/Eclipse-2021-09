package clases;

import java.time.LocalDate;

public class Libro {
	private String isbn;
	private String nombre;
	private LocalDate fechapub;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechapub() {
		return fechapub;
	}
	public void setFechapub(LocalDate fechapub) {
		this.fechapub = fechapub;
	}
	
	
}

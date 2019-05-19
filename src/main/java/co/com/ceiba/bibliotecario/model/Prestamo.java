package co.com.ceiba.bibliotecario.model;

import java.time.LocalDate;

public class Prestamo {
	
	private String isbn;
	private String nombreUsuario;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	
	public Prestamo() { }
	
	public Prestamo(String isbn, String nombreUsuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
		this.isbn = isbn;
		this.nombreUsuario = nombreUsuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
}

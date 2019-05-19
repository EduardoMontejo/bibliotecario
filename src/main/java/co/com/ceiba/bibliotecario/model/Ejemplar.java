package co.com.ceiba.bibliotecario.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ejemplar {
	
	@Id
	private String isbn;
	private int id;
	private String estado;
	
	public Ejemplar() { }
	
	public Ejemplar(String isbn, int id, String estado) {
		this.isbn = isbn;
		this.id = id;
		this.estado = estado;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}	
}

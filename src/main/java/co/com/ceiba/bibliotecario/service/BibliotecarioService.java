package co.com.ceiba.bibliotecario.service;

import java.time.LocalDate;

public class BibliotecarioService {
	
	public boolean esPalindromo(String isbn) {
		String reverseIsbn = new StringBuilder(isbn).reverse().toString();
		return isbn.equals(reverseIsbn);
	}
	
	public LocalDate calcularFechaDevolucion(String isbn, LocalDate fechaPrestamo) {
		if(sumarIsbn(isbn) > 30) {
			LocalDate aux = fechaPrestamo;
			LocalDate fechaDevolucion = fechaPrestamo;
			int contador = 0;
			
			while(contador < 15) {
				aux.plusDays(1);
				if(aux.getDayOfWeek().getValue() != 7) {
					fechaDevolucion = aux;
					contador++;
				}
			}
			return fechaDevolucion;
		}			
				
		return null;
	}
	
	public int sumarIsbn(String isbn) {
		int suma = 0;
		char[] arr = isbn.toCharArray();
		
		for(char x:arr) {
			if(Character.isDigit(x)) {
				suma += Character.getNumericValue(x);
			}
		}
		
		return suma;
	}
}

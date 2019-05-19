package co.com.ceiba.bibliotecario.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.com.ceiba.bibliotecario.model.Libro;

public class LibrosPrueba {
	private static Map<Integer, Libro> libros = new HashMap<Integer, Libro>();
	private static int index = 3;

	static {
		Libro a = new Libro("1", "el fin del poder");
		libros.put(1, a);
		Libro b = new Libro("2", "el arte de la guerra");
		libros.put(2, b);
		Libro c = new Libro("3", "homo deus");
		libros.put(3, c);	
	}
	
	public static Libro create(Libro libro) {
		++index;
		libro.setIsbn(String.valueOf(index));
		libros.put(index, libro);
		return libro;
	}
	
	public static Libro delete(int id) {
		return libros.remove(id);
	}	
	
	public static Libro get(int id) {
		return libros.get(id);
	}
	
	public static List<Libro> list() {
		return new ArrayList<Libro>(libros.values());
	}
}
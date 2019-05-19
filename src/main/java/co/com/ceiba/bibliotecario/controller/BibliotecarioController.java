package co.com.ceiba.bibliotecario.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.bibliotecario.model.Libro;

@RestController
@RequestMapping("api/v1/")
public class BibliotecarioController {
	
	@RequestMapping(value="libros", method = RequestMethod.POST)
	public Libro create(@RequestBody Libro libro) {
		return LibrosPrueba.create(libro);
	}
	
	@RequestMapping(value = "libros/{id}", method = RequestMethod.DELETE)
	public Libro delete(@PathVariable int id) {
		return LibrosPrueba.delete(id);
	}
	
	@RequestMapping(value = "libros/{id}", method = RequestMethod.GET)
	public Libro prestar(@PathVariable int id) {
		return LibrosPrueba.prestar(id);
	}

	@RequestMapping(value = "libros", method = RequestMethod.GET)
	public List<Libro> list() {
		return LibrosPrueba.list();
	}
}

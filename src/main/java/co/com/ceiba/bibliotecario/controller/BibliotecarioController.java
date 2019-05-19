package co.com.ceiba.bibliotecario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.bibliotecario.model.Libro;
import co.com.ceiba.bibliotecario.repository.LibroRepository;

@RestController
@RequestMapping("api/v1/")
public class BibliotecarioController {
	
	@Autowired
	private LibroRepository libroRepository;
	
	@RequestMapping(value="libros", method = RequestMethod.POST)
	public Libro create(@RequestBody Libro libro) {
//		return LibrosPrueba.create(libro);
		return libroRepository.saveAndFlush(libro);
	}
	
	@RequestMapping(value = "libros/{id}", method = RequestMethod.DELETE)
	public Libro delete(@PathVariable int id) {
//		return LibrosPrueba.delete(id);
		Libro libroExiste = libroRepository.findOne(String.valueOf(id));
		libroRepository.delete(libroExiste);
		return libroExiste;
	}
	
	@RequestMapping(value = "libros/{id}", method = RequestMethod.GET)
	public Libro get(@PathVariable int id) {
//		return LibrosPrueba.get(id);
		return libroRepository.findOne(String.valueOf(id));
	}

	@RequestMapping(value = "libros", method = RequestMethod.GET)
	public List<Libro> list() {
//		return LibrosPrueba.list();
		return libroRepository.findAll();
	}
}

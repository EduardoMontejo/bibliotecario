package co.com.ceiba.bibliotecario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ceiba.bibliotecario.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, String> {

}

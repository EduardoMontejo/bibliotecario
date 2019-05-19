package co.com.ceiba.bibliotecario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ceiba.bibliotecario.model.Ejemplar;

public interface EjemplarRepository extends JpaRepository<Ejemplar, String> {

}

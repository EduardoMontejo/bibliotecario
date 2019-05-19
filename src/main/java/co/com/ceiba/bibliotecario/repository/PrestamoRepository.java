package co.com.ceiba.bibliotecario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ceiba.bibliotecario.model.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, String> {

}

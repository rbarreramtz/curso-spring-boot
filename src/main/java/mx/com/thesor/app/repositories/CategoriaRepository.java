package mx.com.thesor.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.thesor.app.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}

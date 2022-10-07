package io.github.udemy.gvenda.gestaovendas.domain.repository;

import io.github.udemy.gvenda.gestaovendas.domain.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepositoty extends JpaRepository<Categoria, Long> {

    List<Categoria> findByIdCategoria(Long idCategoria);

    Optional<Categoria> findByDescCategoria(String descCategoria);

}

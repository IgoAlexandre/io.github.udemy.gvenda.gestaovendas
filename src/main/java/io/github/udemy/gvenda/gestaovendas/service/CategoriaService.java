package io.github.udemy.gvenda.gestaovendas.service;

import io.github.udemy.gvenda.gestaovendas.domain.entity.Categoria;
import io.github.udemy.gvenda.gestaovendas.domain.repository.CategoriaRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepositoty categoriaRepositoty;

    public List<Categoria> listarTodasCategorias(){
        return categoriaRepositoty.findAll();
    }

    public Optional<Categoria> listarCategoriaPorNome(String descNomeCategoria){
        return categoriaRepositoty.findByDescCategoria(descNomeCategoria);
    }
}

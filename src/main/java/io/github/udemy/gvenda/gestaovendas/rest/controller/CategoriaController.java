package io.github.udemy.gvenda.gestaovendas.rest.controller;

import io.github.udemy.gvenda.gestaovendas.domain.entity.Categoria;
import io.github.udemy.gvenda.gestaovendas.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listarTodasCategorias(){
        return categoriaService.listarTodasCategorias();
    }

    @GetMapping("{descCategoria}")
    public ResponseEntity<Optional<Categoria>> getCategoriaByNomeCategoria(@PathVariable(name = "descCategoria") String descCategoria){
        Optional<Categoria> categoria = categoriaService.listarCategoriaPorNome(descCategoria);
        return categoria.isPresent() ? ResponseEntity.ok(categoria) : ResponseEntity.notFound().build();
    }
}

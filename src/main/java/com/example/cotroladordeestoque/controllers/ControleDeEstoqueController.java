package com.example.cotroladordeestoque.controllers;

import com.example.cotroladordeestoque.entities.ControladorDeEstoqueEntity;
import com.example.cotroladordeestoque.services.ControladorDeEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estoque")
public class ControleDeEstoqueController {

    @Autowired
    ControladorDeEstoqueService controladorDeEstoqueService;

    @GetMapping("/produtos")
    public Page<ControladorDeEstoqueEntity> findAll(Pageable pageable){
        return controladorDeEstoqueService.findAll(pageable);
    }
}

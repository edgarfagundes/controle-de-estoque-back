package com.example.cotroladordeestoque.services;

import com.example.cotroladordeestoque.entities.ControladorDeEstoqueEntity;
import com.example.cotroladordeestoque.repository.ProdutoRepository;
import com.example.cotroladordeestoque.repository.impl.ControladorDeEstoqueRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ControladorDeEstoqueService {

    @Autowired
    ControladorDeEstoqueRepositoryImpl controladorDeEstoqueRepositoryImpl;

    @Autowired
    ProdutoRepository produtoRepository;

    public Page<ControladorDeEstoqueEntity> findAll(Pageable pageable) {
        Page<ControladorDeEstoqueEntity> allProduto = controladorDeEstoqueRepositoryImpl.findAllProduto(pageable);
        if (allProduto.hasContent()) {
            return allProduto;
        }
        throw new IllegalArgumentException("Sem produtos.");
    }
}





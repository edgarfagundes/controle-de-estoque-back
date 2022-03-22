package com.example.cotroladordeestoque.repository.impl;

import com.example.cotroladordeestoque.entities.ControladorDeEstoqueEntity;
import com.example.cotroladordeestoque.repository.ControladorDeEstoqueRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Collections;

@Repository
public class ControladorDeEstoqueRepositoryImpl extends SimpleJpaRepository<ControladorDeEstoqueEntity, Long> implements ControladorDeEstoqueRepository {

    public ControladorDeEstoqueRepositoryImpl(EntityManager em) {
        super(ControladorDeEstoqueEntity.class, em);
    }

    @Override
    public Page<ControladorDeEstoqueEntity> findAllProduto(Pageable pageable) {
        return new PageImpl<>(Collections.emptyList(), pageable, 0L);
    }

    @Override
    public boolean exists(Pageable pageable) {
        return true;
    }

    @Override
    public Page<ControladorDeEstoqueEntity> sendMessage() {
        return null;
    }
}

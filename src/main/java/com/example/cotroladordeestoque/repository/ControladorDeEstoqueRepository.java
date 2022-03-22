package com.example.cotroladordeestoque.repository;

import com.example.cotroladordeestoque.entities.ControladorDeEstoqueEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ControladorDeEstoqueRepository extends JpaRepository<ControladorDeEstoqueEntity, Long> {
    Page<ControladorDeEstoqueEntity> findAllProduto(Pageable pageable);

    boolean exists(Pageable pageable);

    Page<ControladorDeEstoqueEntity> sendMessage();
}

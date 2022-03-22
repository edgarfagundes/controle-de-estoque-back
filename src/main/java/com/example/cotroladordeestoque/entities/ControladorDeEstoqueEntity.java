package com.example.cotroladordeestoque.entities;

import com.sun.istack.NotNull;
import org.springframework.context.annotation.Lazy;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ControladorDeEstoqueEntity {
    @Id
    @Column(name = "controle_de_estoque_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Lazy
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "controle_de_estoque_id")
    private List<ProdutoEntity> produtoEntityList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProdutoEntity> getProdutosEntityList() {
        return produtoEntityList;
    }

    public void setProdutos(List<ProdutoEntity> produtos) {
        this.produtoEntityList = produtos;
    }
}

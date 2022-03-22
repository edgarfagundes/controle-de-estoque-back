CREATE TABLE produto
(
    produto_id INT PRIMARY KEY NOT NULL,
    name       VARCHAR(100)    NOT NULL,
    quantidade INT             NOT NULL,
    controle_de_estoque_id
        CONSTRAINT fk_controle_de_estoque_id REFERENCES controle_de_estoque
)
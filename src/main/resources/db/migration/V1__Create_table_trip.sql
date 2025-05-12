CREATE TABLE trip_item (
    id BIGINT NOT NULL AUTO_INCREMENT,
    destino VARCHAR(150) NOT NULL,
    orcamento FLOAT NOT NULL,
    duracao INT NOT NULL,
    qtd_pessoas INT NOT NULL,
    data_viagem DATE NOT NULL,
    PRIMARY KEY (id)
);
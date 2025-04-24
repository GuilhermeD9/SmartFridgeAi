CREATE TABLE food_item (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(150) NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    quantidade INT NOT NULL,
    validade DATE NOT NULL,
    PRIMARY KEY (id)
);
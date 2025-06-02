CREATE TABLE trip_response (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    trip_id BIGINT NOT NULL,
    resposta_ia TEXT NOT NULL,
    data_geracao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_trip
        FOREIGN KEY (trip_id)
        REFERENCES trip_item(id)
        ON DELETE CASCADE
);
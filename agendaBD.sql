CREATE DATABASE agenda;
USE agenda;
CREATE TABLE contatos (
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(60) NOT NULL,
    telefone VARCHAR(50) NOT NULL,
    observacao VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO contatos (nome, telefone, observacao) VALUES('Maria', '(61)983951104', 'observação 1');
INSERT INTO contatos (nome, telefone, observacao) VALUES('joaquim', '(62)983951004', 'observação 2');
INSERT INTO contatos (nome, telefone, observacao) VALUES('Tereza', '(84)984451004', 'observação 3');
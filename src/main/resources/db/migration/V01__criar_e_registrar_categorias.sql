CREATE TABLE categoria (
	id_categoria BIGINT PRIMARY KEY AUTO_INCREMENT,
	desc_categoria VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

INSERT INTO categoria (desc_categoria) values ('Tecnologia');
INSERT INTO categoria (desc_categoria) values ('Acessórios para veículos');
INSERT INTO categoria (desc_categoria) values ('Esporte e Lazer');
INSERT INTO categoria (desc_categoria) values ('Casa e Eletrodomésticos');
INSERT INTO categoria (desc_categoria) values ('Joias e Relógios');
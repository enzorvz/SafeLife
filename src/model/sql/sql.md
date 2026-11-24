# safelife

USE safelife;

CREATE TABLE gestor (
id_gestor INT PRIMARY KEY IDENTITY,
nome VARCHAR(150) NOT NULL,
email VARCHAR(150) NOT NULL UNIQUE,
telefone VARCHAR(20) NOT NULL,
cpf VARCHAR(11) NOT NULL UNIQUE,
senha VARCHAR(255) NOT NULL
);

CREATE TABLE categoria (
id_categoria INT PRIMARY KEY IDENTITY(700,1),
nome VARCHAR (100) NOT NULL UNIQUE,
descricao VARCHAR (200) NULL
);

CREATE TABLE cliente (
id_cliente INT PRIMARY KEY IDENTITY(200,1),
id_gestor INT NOT NULL,
nome VARCHAR (150) NOT NULL,
telefone VARCHAR(20) NOT NULL,
email VARCHAR(150) NULL,
cpf VARCHAR (11) NOT NULL UNIQUE,
CONSTRAINT fk_cliente_gestor FOREIGN KEY (id_gestor) REFERENCES gestor (id_gestor)
);

CREATE TABLE produto (
id_produto INT PRIMARY KEY IDENTITY(1000,1),
id_categoria INT NOT NULL,
id_gestor INT NOT NULL,
titulo VARCHAR(150) NOT NULL,
descricao VARCHAR(300),
qtd_estoque SMALLINT NOT NULL CHECK (qtd_estoque >= 0),
cod_sku VARCHAR(50) NOT NULL UNIQUE,
min_estoque SMALLINT NOT NULL CHECK (min_estoque >= 0),
data_cad DATETIME NOT NULL DEFAULT GETDATE(),
data_vali DATE NULL,
nr_relacionada VARCHAR(10),
CONSTRAINT fk_produto_categoria FOREIGN KEY (id_categoria) 
REFERENCES categoria (id_categoria),
CONSTRAINT fk_produto_gestor FOREIGN KEY (id_gestor) REFERENCES gestor (id_gestor)
);

CREATE TABLE movimentacao (
id_movimentacao INT PRIMARY KEY IDENTITY (2000,1),
id_gestor INT NOT NULL,
id_produto INT NOT NULL,
tipo_movimentacao VARCHAR(20) NOT NULL CHECK (tipo_movimentacao IN ('Entrada', 'Saída')),
qtd SMALLINT NOT NULL DEFAULT 1 CHECK (qtd > 0),
data_registro DATETIME NOT NULL DEFAULT GETDATE(),
CONSTRAINT fk_movimentacao_gestor FOREIGN KEY (id_gestor) REFERENCES gestor (id_gestor),
CONSTRAINT fk_movimentacao_produto FOREIGN KEY (id_produto) REFERENCES produto (id_produto)
);


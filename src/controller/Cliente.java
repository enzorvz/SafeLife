package controller;

import java.util.Date;

public class Cliente {


    /**
    CREATE TABLE cliente (
     id_cliente INT PRIMARY KEY IDENTITY(200,1),
    id_gestor INT NOT NULL,
    nome VARCHAR (150) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(150) NULL,
    cpf VARCHAR (11) NOT NULL UNIQUE,
    CONSTRAINT fk_cliente_gestor FOREIGN KEY (id_gestor) REFERENCES gestor (id_gestor)
            );**/

    private String nome ,sobrenome,cpf,email,telefone;


    public String getNome() {
        return nome;
    }

    public void atualizacaoNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void atualizacaoSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void atualizacaoCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void atualizacaoEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void atualizacaoTelefone(String telefone) {
        this.telefone = telefone;
    }


    public void criarCliente(String nome, String sobrenome, String cpf, String email, String telefone, Date dt_nasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

}


package controller;

public class Gestor {
    /**
     CREATE TABLE gestor (
     id_gestor INT PRIMARY KEY IDENTITY,
     nome VARCHAR(150) NOT NULL,
     email VARCHAR(150) NOT NULL UNIQUE,
     telefone VARCHAR(20) NOT NULL,
     cpf VARCHAR(11) NOT NULL UNIQUE,
     senha VARCHAR(255) NOT NULL
     );**/

    private String nome,sobrenome,telefone,cpf,email,senha;


    public String getSobrenome() {
        return sobrenome;
    }

    public void atualizacaoSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void atualizacaoNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void atualizacaoTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }
    //colocar regras  depois
    public void atualizacaoCpf(String cpf) {
        this.cpf = cpf;
    }
    //colocar regras depois
    public String getEmail() {
        return email;
    }

    public void atualizacaoEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void atualizacaoSenha(String senha) {
        this.senha = senha;
    }

    public void criarGestor(String nome, String sobrenome, String telefone, String cpf, String email, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }
    public boolean removerGestor(String email){

        return true;
    }
    public boolean logarGestor( String email, String senha){
        return true;
    }
}

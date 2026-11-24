package controller;

public class Categoria {

//    CREATE TABLE categoria (
//            id_categoria INT PRIMARY KEY IDENTITY(700,1),
//    nome VARCHAR (100) NOT NULL UNIQUE,
//    descricao VARCHAR (200) NULL
//);

    private String nome;

    public void criarCategoria(String nome) {
        this.nome = nome;
    }
    public void alterarCategoria(String nome) {
        this.nome = nome;
    }
   public boolean removerCategoria(String nome){

        return false;
   }
}

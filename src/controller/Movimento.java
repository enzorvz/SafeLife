package controller;

import java.util.Date;

public class Movimento {
//    CREATE TABLE movimentacao (
//            id_movimentacao INT PRIMARY KEY IDENTITY (2000,1),
//    id_gestor INT NOT NULL,
//    id_produto INT NOT NULL,
//    tipo_movimentacao VARCHAR(20) NOT NULL CHECK (tipo_movimentacao IN ('Entrada', 'Saída')),
//    qtd SMALLINT NOT NULL DEFAULT 1 CHECK (qtd > 0),
//    data_registro DATETIME NOT NULL DEFAULT GETDATE(),
//    CONSTRAINT fk_movimentacao_gestor FOREIGN KEY (id_gestor) REFERENCES gestor (id_gestor),
//    CONSTRAINT fk_movimentacao_produto FOREIGN KEY (id_produto) REFERENCES produto (id_produto)
//            );
   private String nomeDaTrasacao;
   private Date dataDeMovimento;

    public String getNomeDaTrasacao() {
        return nomeDaTrasacao;
    }

    public void setNomeDaTrasacao(String nomeDaTrasacao) {
        this.nomeDaTrasacao = nomeDaTrasacao;
    }

    public Date getDataDeMovimento() {
        return dataDeMovimento;
    }

    public void setDataDeMovimento(Date dataDeMovimento) {
        this.dataDeMovimento = dataDeMovimento;
    }
    public String typoDeMovimeno(){
        return "";
    }

    public void criarMovimento(String nomeDaTrasacao, Date dataDeMovimento) {
        this.nomeDaTrasacao = nomeDaTrasacao;
        this.dataDeMovimento = dataDeMovimento;
    }
}

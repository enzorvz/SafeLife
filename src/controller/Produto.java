package controller;

import java.util.Date;

public class Produto {

//    CREATE TABLE produto (
//            id_produto INT PRIMARY KEY IDENTITY(1000,1),
//    id_categoria INT NOT NULL,
//    id_gestor INT NOT NULL,
//    titulo VARCHAR(150) NOT NULL,
//    descricao VARCHAR(300),
//    qtd_estoque SMALLINT NOT NULL CHECK (qtd_estoque >= 0),
//    cod_sku VARCHAR(50) NOT NULL UNIQUE,
//    min_estoque SMALLINT NOT NULL CHECK (min_estoque >= 0),
//    data_cad DATETIME NOT NULL DEFAULT GETDATE(),
//    data_vali DATE NULL,
//    nr_relacionada VARCHAR(10),
//    CONSTRAINT fk_produto_categoria FOREIGN KEY (id_categoria)
//    REFERENCES categoria (id_categoria),
//    CONSTRAINT fk_produto_gestor FOREIGN KEY (id_gestor) REFERENCES gestor (id_gestor)
//            );

    private String nome, descricao, codigoSku;
    private int quantidadeDeProduto,minEstoque;
    private Date validade,dtCadastro;








    public void atualizarMinEstoque(int minEstoque) {
        this.minEstoque = minEstoque;
    }



    public void atualizarCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public int getMinEstoque() {
        return minEstoque;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void atualizarNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void atualizarDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoSku() {
        return codigoSku;
    }

    public void atualizarCodigoSku(String codigoSku) {
        this.codigoSku = codigoSku;
    }

    public int getQuantidadeDeProduto() {
        return quantidadeDeProduto;
    }

    public void atualizarQuantidadeDeProduto(int quantidadeDeProduto) {
        this.quantidadeDeProduto = quantidadeDeProduto;
    }

    public Date getValidade() {
        return validade;
    }

    public void atulizacaoValidade(Date validade) {
        this.validade = validade;
    }

    public void criarProduto(String nome, String descricao, String codigoSku, int quantidadeDeProduto, int minEstoque, Date validade, Date dtCadastro) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigoSku = codigoSku;
        this.quantidadeDeProduto = quantidadeDeProduto;
        this.minEstoque = minEstoque;
        this.validade = validade;
        this.dtCadastro = dtCadastro;
    }



    public String alterarProduto(String nome, String descricao, String codigoSku, int quantidadeDeProduto, int minEstoque, Date validade, Date dtCadastro) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigoSku = codigoSku;
        this.quantidadeDeProduto = quantidadeDeProduto;
        this.minEstoque = minEstoque;
        this.validade = validade;
        this.dtCadastro = dtCadastro;

        return "nome: "+nome+" descrição: "+descricao+" codigoSKU: "+codigoSku+" quantidade de produto: "+quantidadeDeProduto+" validade; "
                +validade+" minEstoque: "+minEstoque+" dtcadastro: "+dtCadastro;
    }
    public boolean deletarProduto(){
        return false;
        //logica depois
    }
   public String gerarRelatorioDeProduto(){
        return "fazer a logica";
   }
    public String listarProduto(){
        return "fazer a logica";
    }
}

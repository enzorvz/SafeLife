package dao;

import model.BancoDeDados;

import java.sql.Connection;
import java.sql.SQLException;

public class ProdutoDAO {
    private Connection conn;

    ProdutoDAO() throws SQLException {
        conn= BancoDeDados.conectar();
    }
}

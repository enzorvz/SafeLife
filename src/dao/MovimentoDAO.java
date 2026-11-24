package dao;

import model.BancoDeDados;

import java.sql.Connection;
import java.sql.SQLException;

public class MovimentoDAO {

    private Connection conn;

    MovimentoDAO() throws SQLException {
        conn= BancoDeDados.conectar();
    }

}

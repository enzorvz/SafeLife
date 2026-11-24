package dao;

import controller.Cliente;
import model.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class CategoriaDAO {
    private Connection conn;

    public CategoriaDAO() throws SQLException  {

    conn= BancoDeDados.conectar();
    }

    //CREATE OU C
    public void registrarCliente(Cliente c) {
       String sql = "";
    }

}

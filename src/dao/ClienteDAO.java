package dao;
import controller.Cliente;
import model.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    private Connection conn;

    ClienteDAO() throws SQLException {
        conn= BancoDeDados.conectar();
    }

    public void   criarCliente(Cliente c){
        String sql = "INSERT INTO cliente ()";
    };



    public boolean removeCliente(){
        return false;
        //inventar a a logica depois
    }
    public ArrayList<Cliente> listarCliente(){

        return new ArrayList<>();
    }


}

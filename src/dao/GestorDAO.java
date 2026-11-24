package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

import controller.Gestor;
import model.*;

import javax.swing.*;

public class GestorDAO {
    private static  Connection conn;

    GestorDAO() throws SQLException {
        conn= BancoDeDados.conectar();
    }
    public static void createGestor(Gestor g){
        try {
            String sql = "INSERT INTO gestor (nome,telefone,cpf,email,senha) VALUES (?,?,?,?,?); ";

           PreparedStatement p= conn.prepareStatement(sql);
           p.setString(1,g.getNome());
            p.setString(2,g.getTelefone());
            p.setString(3,g.getCpf());
            p.setString(4,g.getEmail());
            p.setString(5,g.getSenha());
            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
    public static ArrayList<Gestor> readGestor(){
        try { String sql = "SELECT * FROM gestor;";
        Statement p =   conn.createStatement();
        ResultSet rs = p.executeQuery(sql);
        ArrayList<Gestor> listargestor=new ArrayList<>();
        while (rs.next()) {
            Gestor g =new Gestor();
            g.atualizacaoNome(rs.getString("nome"));
           g.atualizacaoTelefone( rs.getString("telefone"));
           g.atualizacaoCpf( rs.getString("cpf"));
           g.atualizacaoEmail( rs.getString("email"));
           g.atualizacaoSenha( rs.getString("senha"));
           listargestor.add(g);
        }
        listargestor.sort((gestor, t1) -> gestor.getNome().compareTo( t1.getNome()));
        return listargestor;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void updateGestor(Gestor g){
        try {
            String sql = "UPDATE  gestor SET (nome=?,telefone=?,cpf=?,email=?,senha=?); ";

            PreparedStatement p= conn.prepareStatement(sql);
            p.setString(1,g.getNome());
            p.setString(2,g.getTelefone());
            p.setString(3,g.getCpf());
            p.setString(4,g.getEmail());
            p.setString(5,g.getSenha());
            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
}

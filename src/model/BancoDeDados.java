package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {
    public static Connection conectar() throws SQLException {

        try {String url="jdbc:mysql://localhost:3306/";
            String user="root";
            String password="";
            return  DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

}}

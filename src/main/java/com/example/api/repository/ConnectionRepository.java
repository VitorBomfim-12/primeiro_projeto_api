package com.example.api.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionRepository {
    public Connection getConnection(){

        Dotenv dotenv = Dotenv.load();
        String senhaBd =  dotenv.get("SENHA_BANCO_DE_DADOS");

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/transacoes_bd","root",senhaBd);
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
    /* 
    código teste para verificar a conexão com o banco de dados, pode ser removido posteriormente
    public static void main(String[] args) {

        ConnectionRepository connectionRepository = new ConnectionRepository();
        Connection connection = connectionRepository.getConnection();
        if (connection != null) {
            System.out.println("Conexão bem-sucedida!");
        } else {
            System.out.println("Falha na conexão.");
        }
    }
        */
}

package com.vinicius;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexão {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory criaConexao = new ConnectionFactory();
        Connection connection = criaConexao.recuperaConexao();

        System.out.println("Fechando conexão /:/");

        connection.close();
    }
}
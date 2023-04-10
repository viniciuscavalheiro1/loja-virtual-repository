package com.vinicius;

import java.sql.*;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory criaConexao = new ConnectionFactory();
        Connection connection = criaConexao.recuperaConexao();

        Statement stm = connection.createStatement();
        stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

        ResultSet rst = stm.getResultSet();

        while (rst.next()) {
            Integer id = rst.getInt("ID");
            System.out.println("id: " + id);
            String nome = rst.getString("NOME");
            System.out.println("Nome: " + nome);
            String descricao = rst.getString("DESCRICAO");
            System.out.println("Descricão: " + descricao);
        }

        connection.close();
    }
}

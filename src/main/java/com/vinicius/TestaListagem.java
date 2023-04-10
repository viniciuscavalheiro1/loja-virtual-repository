package com.vinicius;

import java.sql.*;
import java.util.List;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost/loja_virtual?useTimeZone=true&serverTimeZone=UTC", "root", "Senha123@#");

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

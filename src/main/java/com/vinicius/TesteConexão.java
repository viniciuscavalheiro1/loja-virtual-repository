package com.vinicius;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexão {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost/loja_virtual?useTimeZone=true&serverTimeZone=UTC", "root", "Senha123@#");

        connection.close();
    }
}
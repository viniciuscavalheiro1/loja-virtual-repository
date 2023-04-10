package com.vinicius;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperaConexao() throws SQLException {
        return DriverManager
                .getConnection("jdbc:mysql://localhost/loja_virtual?useTimeZone=true&serverTimeZone=UTC", "root", "Senha123@#");
    }
}

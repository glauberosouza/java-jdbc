package br.com.glauber.jdbc.exerc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConection {
    public static void main(String[] args) throws SQLException {
        var user = "root";
        var password = "root";
        var url = "jdbc:mysql://localhost:3307?verifyServerCertificate=false&useSSL=true";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Conectado com sucesso! ");
        connection.close();
    }
}
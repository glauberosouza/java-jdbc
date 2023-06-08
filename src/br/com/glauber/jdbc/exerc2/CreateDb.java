package br.com.glauber.jdbc.exerc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDb {
    public static void main(String[] args) throws SQLException {

        var user = "root";
        var password = "root";
        var url = "jdbc:mysql://localhost:3307?verifyServerCertificate=false&useSSL=true";
        Connection connection = DriverManager.getConnection(url, user, password);
        var stmt = connection.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS banco_com_jdbc");
        System.out.println("Banco criado com sucesso!");
        connection.close();
    }
}
package br.com.glauber.jdbc.exerc4;

import br.com.glauber.jdbc.exerc3.ConnectionFactory;

import java.sql.SQLException;

public class CreatePerson {
    public static void main(String[] args) throws SQLException {
        var sql = "CREATE TABLE IF NOT EXISTS " +
                "person (idt INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(80) NOT NULL)";
        var connection = ConnectionFactory.get();
        var stmt = connection.createStatement();
        stmt.execute(sql);
        System.out.println("Tabela criada com sucesso!");
        connection.close();
    }
}
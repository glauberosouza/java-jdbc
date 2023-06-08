package br.com.glauber.jdbc.exerc10;

import br.com.glauber.jdbc.exerc3.ConnectionFactory;
import br.com.glauber.jdbc.exerc6.Person;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    private Connection connection;

    public Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection = ConnectionFactory.get();
        return connection;
    }

    public Person savePerson(String name) {
        try {
            var sql = "INSERT INTO person (name) " +
                    "VALUES (?)";
            var stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, name);
            stmt.execute();
            System.out.println("Pessoa incluida com sucesso!");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return new Person();
    }

    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        try {
            var sql = "SELECT * FROM person";
            var stmt = getConnection().createStatement();
            var resultSet = stmt.executeQuery(sql);

            while (resultSet.next()) {
                people.add(new Person(
                        resultSet.getInt("idt"),
                        resultSet.getString("name"))
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return people;
    }

    public void updatePerson(long idt, String name) {
        try {
            var sql = "UPDATE person SET name = ? WHERE idt = ?";
            var stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, name); // 1º do parametro do sql
            stmt.setLong(2, idt); // 2º do parametro do sql
            var effectRows = stmt.executeUpdate();

            if (effectRows > 0) {
                System.out.println("Atualizado com Sucesso!");
            } else {
                System.out.println("Pessoa não encontrada!");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deletePerson(long idt) {
        try {
            var sql = "DELETE FROM person WHERE idt = ?";
            var stmt = getConnection().prepareStatement(sql);
            stmt.setLong(1, idt);
            var effectedRows = stmt.executeUpdate();

            if (effectedRows > 0) {
                System.out.println("Deletado com sucesso!");
            } else {
                System.out.println("Pessoa não encontrada!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
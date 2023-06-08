package br.com.glauber.jdbc.exerc5;

import br.com.glauber.jdbc.exerc10.PersonDAO;
import br.com.glauber.jdbc.exerc3.ConnectionFactory;

import java.sql.SQLException;

public class InsertPerson {
    public static void main(String[] args) throws SQLException {
        PersonDAO personDAO = new PersonDAO();
        personDAO.savePerson("Jorge");
    }
}
//        var sql= "INSERT INTO person (name) " +
//                 "VALUES (?)";
//        var connection = ConnectionFactory.get();
//        var preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1,"Andreza");
//        preparedStatement.execute();
//        System.out.println("Pessoa incluída com sucesso!");
//        connection.close();

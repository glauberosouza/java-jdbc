package br.com.glauber.jdbc.exerc6;

import br.com.glauber.jdbc.exerc10.PersonDAO;

import java.sql.SQLException;
import java.util.List;

public class QueryPerson {
    public static void main(String[] args) throws SQLException {

        PersonDAO personDAO = new PersonDAO();
        List<Person> peopple = personDAO.findAll();
        peopple.forEach(System.out::println);
    }
}
//        var sql = "SELECT * FROM person";
//        var connection = ConnectionFactory.get();
//        var stmt = connection.createStatement();
//        var resultSet = stmt.executeQuery(sql);
//        List<Person> people = new ArrayList<>();
//        while (resultSet.next()) {
//            people.add(new Person(
//                    resultSet.getInt("idt"),
//                    resultSet.getString("name"))
//            );
//        }
//        people.forEach(System.out::println);
//        connection.close();

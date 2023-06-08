package br.com.glauber.jdbc.exerc7;

import br.com.glauber.jdbc.exerc10.PersonDAO;
import br.com.glauber.jdbc.exerc3.ConnectionFactory;

import java.sql.SQLException;

public class UpdatePerson {
    public static void main(String[] args) throws SQLException {
        PersonDAO personDAO = new PersonDAO();
        personDAO.updatePerson(3, "Batman");
    }
}
//        var sql = "UPDATE person SET name = ? WHERE idt = 1";
//        var connection = ConnectionFactory.get();
//        var preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1, "Glauber dos Santos");
//        preparedStatement.execute();
//        System.out.println("Atualizado com Sucesso!");
//        connection.close();

package br.com.glauber.jdbc.exerc8;

import br.com.glauber.jdbc.exerc10.PersonDAO;
import br.com.glauber.jdbc.exerc3.ConnectionFactory;

import java.sql.SQLException;
import java.sql.Statement;

public class DeletePerson {
    public static void main(String[] args) throws SQLException {
        PersonDAO personDAO = new PersonDAO();
        personDAO.deletePerson(2);
    }
}
//        var sql = "DELETE FROM person WHERE idt = 1";
//        var connection = ConnectionFactory.get();
//        var stmt = connection.createStatement();
//        var effectedRows = stmt.executeUpdate(sql);
//        if (effectedRows > 0){
//            System.out.println("Deletado com sucesso!");
//        }else {
//            System.out.println("Pessoa não encontrada!");
//        }
//        connection.close();

package br.com.glauber.jdbc.exerc3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    public static Connection get() {
        try {
            Properties properties = getProperties();
            var user = properties.getProperty("db.user");
            var password = properties.getProperty("db.password");
            var url = properties.getProperty("db.url");

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static Properties getProperties() throws IOException {
        var prop = new Properties();
        var path = "/connection.properties";
        prop.load(ConnectionFactory.class.getResourceAsStream(path));
        return prop;
    }
}
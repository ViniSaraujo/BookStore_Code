package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    // Configurações do banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/booksystem";
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; // Insirir senha se tiver

    public static Connection conectaBD() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
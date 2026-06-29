package dao;

import model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {
    
    public boolean cadastrarLivro(Livro livro) {
        String sql = "INSERT INTO tb_livros (titulo, autor) VALUES (?, ?)";
        
        // Uso do try-with-resources para fechar a conexão automaticamente
        try (Connection conn = ConexaoDAO.conectaBD();
             PreparedStatement pstm = conn.prepareStatement(sql)) {
             
            pstm.setString(1, livro.getTitulo());
            pstm.setString(2, livro.getAutor());
            pstm.execute();
            
            return true; // Retorna sucesso
            
        } catch (SQLException e) {
            // Imprime no console (backend) em vez de abrir janela visual
            System.err.println("Erro ao cadastrar no banco: " + e.getMessage());
            return false; // Retorna falha
        }
    }
}
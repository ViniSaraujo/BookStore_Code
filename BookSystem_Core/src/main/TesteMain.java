package main;

import dao.LivroDAO;
import model.Livro;

public class TesteMain {
    public static void main(String[] args) {
        System.out.println("--- Teste de Integração sem Java Swing ---");
        
        // 1. Cria o objeto livro via código
        Livro novoLivro = new Livro("O Programador Pragmático", "Andrew Hunt");
        LivroDAO dao = new LivroDAO();
        
        System.out.println("Tentando salvar livro no banco de dados...");
        
        // 2. Tenta salvar e guarda o resultado (true ou false)
        boolean sucesso = dao.cadastrarLivro(novoLivro);
        
        // 3. Exibe o resultado direto no terminal
        if (sucesso) {
            System.out.println("RESULTADO: Sucesso! O livro foi salvo usando a arquitetura refatorada.");
        } else {
            System.out.println("RESULTADO: Falha. Verifique a conexão com o banco.");
        }
    }
}
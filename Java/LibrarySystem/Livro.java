package Java.LibrarySystem;

public class Livro {
    String autor;
    String nome;
    String desc;
    boolean emprestado;

    // Construtor
    public Livro(String nome, String autor, String desc) {
        this.nome = nome;
        this.autor = autor;
        this.desc = desc;
        this.emprestado = false;
    }
}

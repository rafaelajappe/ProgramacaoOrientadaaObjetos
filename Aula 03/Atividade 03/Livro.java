public class Livro {
    String titulo;
    Autor autor;
    int ano;
    boolean emprestado;

    Livro(String titulo, Autor autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }

    void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Ano: " + ano);
    }

    void emprestar() {
        if (emprestado) {
            System.out.println("O livro " + titulo + " já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("Livro " + titulo + " emprestado com sucesso.");
        }
    }

    void devolver() {
        if (!emprestado) {
            System.out.println("O livro " + titulo + " não está emprestado.");
        } else {
            emprestado = false;
            System.out.println("Livro " + titulo + " devolvido com sucesso.");
        }
    }
}
#exercicio 2

public class Filme {

    String titulo;
    int duracao;
    double nota;
    boolean assistido;

    // Construtor
    public Filme(String titulo, int duracao, double nota, boolean assistido) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.nota = nota;
        this.assistido = assistido;
    }


    public void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Nota: " + nota);
        System.out.println("Assistido: " + assistido);
        System.out.println("----------------------");
    }

    public void marcarAssistido() {
        assistido = true;
    }

    public void avaliar(double novaNota) {

        if (novaNota >= 0 && novaNota <= 10) {
            nota = novaNota;
            System.out.println("Nota atualizada com sucesso!");
        } else {
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
        }
    }
}



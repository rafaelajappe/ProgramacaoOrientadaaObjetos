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

    // Exibir os dados do filme
    public void exibirFicha() {

        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Nota: " + nota);
        System.out.println("Assistido: " + assistido);
        System.out.println("--------------------");
    }

    // Marcar filme como assistido
    public void marcarAssistido() {

        assistido = true;
    }

    // Avaliar o filme
    public void avaliar(double novaNota) {

        if (novaNota >= 0 && novaNota <= 10) {

            nota = novaNota;
            System.out.println("Nota atualizada com sucesso!");

        } else {

            System.out.println("Nota inválida! A nota deve ser entre 0 e 10.");
        }
    }
}
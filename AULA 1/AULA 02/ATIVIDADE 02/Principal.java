public class Principal {

    public static void main(String[] args) {

        // Criando 3 filmes
        Filme filme1 = new Filme("Vingadores", 143, 8.5, false);
        Filme filme2 = new Filme("Titanic", 195, 9.0, false);
        Filme filme3 = new Filme("Interestelar", 169, 9.5, false);

        // Assistindo o filme 1
        filme1.marcarAssistido();

        // Avaliando o filme 2
        filme2.avaliar(9.8);

        // Exibindo os filmes
        filme1.exibirFicha();
        filme2.exibirFicha();
        filme3.exibirFicha();
    }
}
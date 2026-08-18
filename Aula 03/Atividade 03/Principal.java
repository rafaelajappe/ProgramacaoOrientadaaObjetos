public class Principal {

    public static void main(String[] args) {

        Autor autor1 = new Autor("Machado de Assis", "Brasileiro");
        Autor autor2 = new Autor("J. K. Rowling", "Britânica");

        Livro livro1 = new Livro("Dom Casmurro", autor1, 1899);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", autor1, 1881);
        Livro livro3 = new Livro("Harry Potter e a Pedra Filosofal", autor2, 1997);

        livro1.exibirFicha();

        System.out.println();

        livro2.exibirFicha();

        System.out.println();

        livro3.exibirFicha();

        System.out.println();

        livro1.emprestar();

        System.out.println();

        livro1.emprestar();

        System.out.println();

        livro1.devolver();

        System.out.println();

        livro1.devolver();
    }
}
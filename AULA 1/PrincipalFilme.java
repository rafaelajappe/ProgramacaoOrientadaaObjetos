#exercicio 2
public class PrincipalFilme {

    public static void main(String[] args) {


        Filme filme1 = new Filme("Interestelar", 169, 9.0, false);
        Filme filme2 = new Filme("Toy Story", 81, 8.5, false);
        Filme filme3 = new Filme("Vingadores", 143, 8.0, false);

        filme1.exibirFicha();
        filme2.exibirFicha();
        filme3.exibirFicha();


        filme1.marcarAssistido();

    
        filme2.avaliar(9.5);

        System.out.println("Depois das alterações:");

        filme1.exibirFicha();
        filme2.exibirFicha();
        filme3.exibirFicha();

        filme3.avaliar(11);
    }
}

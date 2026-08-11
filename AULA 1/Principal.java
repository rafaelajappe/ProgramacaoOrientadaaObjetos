#EXERCICIO 01

public class Principal {

    public static void main(String[] args) {

        // Criando 3 produtos
        Produto produto1 = new Produto("Notebook", 3500.00, 10);
        Produto produto2 = new Produto("Mouse", 80.00, 5);
        Produto produto3 = new Produto("Teclado", 150.00, 3);

        // Vendendo 2 unidades do produto 1
        produto1.vender(2);

        // Exibindo todos os produtos
        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();
    }
}

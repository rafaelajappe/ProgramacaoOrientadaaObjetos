public class Principal {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Rafaela", "rafaela@email.com");
        Produto produto1 = new Produto("Notebook", 3500.00);

        Pedido pedido1 = new Pedido(cliente1, produto1, 2);

        pedido1.resumo();

        System.out.println();

        Cliente cliente2 = new Cliente("Augusto", "augusto@email.com");
        Produto produto2 = new Produto("Mouse", 150.00);

        Pedido pedido2 = new Pedido(cliente2, produto2, 3);

        pedido2.resumo();

        System.out.println();

        pedido1.aplicarDesconto(10.0);
        pedido2.aplicarDesconto(20.0);
    }
}
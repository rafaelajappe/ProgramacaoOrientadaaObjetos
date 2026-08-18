public class Pedido {
    Cliente cliente;
    Produto produto;
    int quantidade;

    Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    void resumo() {
        double total = produto.preco * quantidade;

        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Produto: " + produto.nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + total);
    }

    void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual de desconto inválido: " + percentual);
        } else {
            double desconto = produto.preco * quantidade * percentual / 100;
            double total = produto.preco * quantidade - desconto;

            System.out.println("Desconto de " + percentual + "% aplicado.");
            System.out.println("Valor com desconto: R$ " + total);
        }
    }
}
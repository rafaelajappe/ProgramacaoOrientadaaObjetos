#exercicio 1
    
public class Produto {

    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque);
        System.out.println("--------------------");
    }

    public void vender(int qtd) {

        if (qtd <= estoque) {
            estoque = estoque - qtd;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Venda não realizada! Estoque insuficiente.");
        }
    }
}

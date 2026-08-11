public class Produto {
    String nome;
    Double preco;
    int estoque;


    void exibirInfo() {
        System.out.println("Produto:" + nome + "Preço:" + preco + "Estoque atual:" + estoque);
    }

    void vender (int quant) {
        estoque = estoque - quant;
        if (estoque < 0) {

        System.out.println("fOI REDUZIDO " + quant +"do estoque"  + 
            "O estoque atual é : " + estoque);
 

}

public class Titular {

private String nome;

public Titular(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}

public void setNome(String novo) {
    if (novo == null || novo.trim().isEmpty()) {
        System.out.println("Nome inválido.");
    } else {
        nome = novo;
    }
}

}

import java.time.LocalDate;

public class Titular {

private String nome;
private String cpf;
private LocalDate dataNascimento;

public Titular(String nome, String cpf, LocalDate dataNascimento) {
    this.nome = nome;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
}

public String getNome() {
    return nome;
}

public String getCpf() {
    return cpf;
}

public LocalDate getDataNascimento() {
    return dataNascimento;
}

public void setNome(String novo) {
    if (novo == null || novo.trim().isEmpty()) {
        System.out.println("Nome inválido.");
    } else {
        nome = novo;
    }
}

public void setCpf(String novo) {
    if (novo == null || novo.trim().isEmpty()) {
        System.out.println("CPF inválido.");
    } else {
        cpf = novo;
    }
}

public void setDataNascimento(LocalDate nova) {
    if (nova == null) {
        System.out.println("Data de nascimento inválida.");
    } else {
        dataNascimento = nova;
    }
}

}

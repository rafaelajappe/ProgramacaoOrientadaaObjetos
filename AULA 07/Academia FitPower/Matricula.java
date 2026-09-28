public class Matricula {

    private String nomeAluno;
    private double mensalidadeBase;

    public Matricula(String nomeAluno, double mensalidadeBase) {

        if (mensalidadeBase < 80) {
            throw new MensalidadeInvalidaException(
                "Mensalidade mínima é R$ 80,00"
            );
        }

        this.nomeAluno = nomeAluno;
        this.mensalidadeBase = mensalidadeBase;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public double getMensalidadeBase() {
        return mensalidadeBase;
    }

    public double calcularMensalidade() {
        return mensalidadeBase;
    }
}
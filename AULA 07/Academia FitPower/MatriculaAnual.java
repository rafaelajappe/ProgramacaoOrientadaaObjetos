public class MatriculaAnual extends Matricula {

    public MatriculaAnual(String nomeAluno, double mensalidadeBase) {
        super(nomeAluno, mensalidadeBase);
    }

    @Override
    public double calcularMensalidade() {
        return getMensalidadeBase() * 0.85;
    }
}
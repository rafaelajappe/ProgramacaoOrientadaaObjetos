public class MatriculaFamilia extends Matricula {

    private int extras;

    public MatriculaFamilia(
            String nomeAluno,
            double mensalidadeBase,
            int extras) {

        super(nomeAluno, mensalidadeBase);

        if (extras < 1 || extras > 4) {
            throw new IllegalArgumentException(
                "O plano família aceita de 1 a 4 extras."
            );
        }

        this.extras = extras;
    }

    public int getExtras() {
        return extras;
    }

    @Override
    public double calcularMensalidade() {
        return getMensalidadeBase() + (extras * 40);
    }
}
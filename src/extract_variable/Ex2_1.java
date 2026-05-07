package extract_variable;

public class Ex2_1 {

    public void verificarAprovacao(double notaFinal, int frequencia, boolean fezRecuperacao) {

        boolean alunoAprovadoSemRecuperacao = notaFinal >= 6.0 && frequencia >= 75;
        boolean alunoAprovadoComRecuperacao = fezRecuperacao && notaFinal >= 5.0 && frequencia >= 80;
        boolean alunoAprovado = alunoAprovadoSemRecuperacao || alunoAprovadoComRecuperacao;

        if (alunoAprovado) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}

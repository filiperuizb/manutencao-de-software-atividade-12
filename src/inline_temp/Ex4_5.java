package inline_temp;

public class Ex4_5 {

    public void verificarProjeto(double notaDocumento, double notaApresentacao) {
        // mesma coisa do exercício 2, acredito que fique melhor não jogando a expressão direta no if
        // ms como o exercicio era de inline temp eu fiz do jeito que foi ensinado
        if (((notaDocumento * 0.6) + (notaApresentacao * 0.4)) >= 7.0) {
            System.out.println("Projeto aprovado");
        } else {
            System.out.println("Projeto precisa de revisão");
        }
    }

}

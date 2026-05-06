package extract_method;

public class Ex1_2 {

    public void processarMatricula(String aluno, int disciplinas, boolean bolsista) {
        double valorBase = disciplinas * 120.0;

        double desconto = calcularDesconto(valorBase, bolsista);

        double valorFinal = valorBase - desconto;

        imprimirMatricula(aluno, disciplinas, valorBase, desconto, valorFinal);

        imprimirSePrecisaPagarMatricula(valorFinal);

    }

    public double calcularDesconto(double valorBase, boolean bolsista) {

        if(bolsista) {
            return valorBase * 0.4;
        }

        return 0;
    }

    public void imprimirMatricula(String aluno, int disciplinas, double valorBase, double desconto, double valorFinal) {
        System.out.println("Aluno: " + aluno);
        System.out.println("Disciplinas: " + disciplinas);
        System.out.println("Valor base: R$ " + valorBase);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }

    public void imprimirSePrecisaPagarMatricula(double valorFinal) {
        if (valorFinal == 0) {
            System.out.println("Matrícula gratuita");
        } else {
            System.out.println("Pagamento necessário");
        }
    }
}

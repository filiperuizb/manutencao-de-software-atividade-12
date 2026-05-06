package extract_method;

public class Ex1_5 {

    public void avaliarEmprestimo(String cliente, double renda, double valorSolicitado) {
        double limite = renda * 0.3;
        double parcela = valorSolicitado / 12;

        imprimirEmprestimo(cliente, renda, valorSolicitado, parcela, limite);

        imprimirAnaliseEmprestimo(parcela, limite);
    }

    public void imprimirEmprestimo(String cliente, double renda, double valorSolicitado, double parcela, double limite) {
        System.out.println("Cliente: " + cliente);
        System.out.println("Renda mensal: R$ " + renda);
        System.out.println("Valor solicitado: R$ " + valorSolicitado);
        System.out.println("Parcela estimada: R$ " + parcela);
        System.out.println("Limite recomendado: R$ " + limite);
    }

    public void imprimirAnaliseEmprestimo(double parcela, double limite) {
        if (parcela <= limite) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo negado");
        }
    }

}

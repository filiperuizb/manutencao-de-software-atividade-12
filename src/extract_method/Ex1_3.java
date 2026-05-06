package extract_method;

public class Ex1_3 {

    public void gerarRelatorioFuncionario(String nome, int horas, double valorHora) {

        double salarioBruto = horas * valorHora;
        double desconto = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto - desconto;

        imprimirRelatorioFuncionario(nome, horas, valorHora, salarioBruto, desconto, salarioLiquido);
        imprimirFaixaSalarial(salarioLiquido);
    }

    public void imprimirRelatorioFuncionario(String nome, int horas, double valorHora,
                                             double salarioBruto, double desconto, double salarioLiquido) {
        System.out.println("Funcionário: " + nome);
        System.out.println("Horas trabalhadas: " + horas);
        System.out.println("Valor da hora: R$ " + valorHora);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }

    public void imprimirFaixaSalarial(double salarioLiquido) {
        if (salarioLiquido >= 3000) {
            System.out.println("Faixa salarial alta");
        } else {
            System.out.println("Faixa salarial comum");
        }
    }
}

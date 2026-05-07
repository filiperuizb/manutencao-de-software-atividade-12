package extract_variable;

public class Ex2_4 {

    public void verificarDesconto(double totalCompra, boolean clientePremium, int quantidadeItens) {

        boolean compraGrande = totalCompra >= 300 && quantidadeItens >= 3;
        boolean clientePremiumCompraMinima = clientePremium && totalCompra >= 150;
        boolean descontoAplicavel = compraGrande || clientePremiumCompraMinima;

        if (descontoAplicavel) {
            System.out.println("Desconto aplicado");
        } else {
            System.out.println("Sem desconto");
        }
    }

}

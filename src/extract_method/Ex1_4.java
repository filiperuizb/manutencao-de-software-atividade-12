package extract_method;

public class Ex1_4 {

    public void finalizarVenda(String produto, int quantidade, double preco, boolean entregaExpressa) {
        double subtotal = quantidade * preco;
        double frete = calcularFrete(entregaExpressa);
        double total = subtotal + frete;

        imprimirVenda(produto, quantidade, preco, frete, total);

        imprimirTipoDaEntrega(entregaExpressa);
    }

    public double calcularFrete(boolean entregaExpressa) {
        if(entregaExpressa) {
            return 40;
        }

        return 20;
    }

    public void imprimirVenda(String produto, int quantidade, double preco, double frete, double total) {
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Frete: R$ " + frete);
        System.out.println("Total: R$ " + total);
    }

    public void imprimirTipoDaEntrega(boolean entregaExpressa) {
        if (entregaExpressa) {
            System.out.println("Entrega expressa selecionada");
        } else {
            System.out.println("Entrega comum selecionada");
        }
    }
}

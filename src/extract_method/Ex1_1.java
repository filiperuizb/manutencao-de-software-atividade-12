package extract_method;

public class Ex1_1 {
    public void emitirRecibo(String cliente, int quantidade, double precoUnitario) {

        double subtotal = quantidade * precoUnitario;
        double imposto = subtotal * 0.10;
        double total = subtotal + imposto;

        imprimirRecibo(cliente, quantidade, precoUnitario, subtotal, imposto, total);
        imprimirCategoriaDaCompra(total);
    }

    public void imprimirRecibo(String cliente, int quantidade, double precoUnitario, double subTotal, double imposto, double total) {
        System.out.println("Cliente: " + cliente);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Subtotal: R$ " + subTotal);
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Total: R$ " + total);
    }

    public void imprimirCategoriaDaCompra(double total) {
        if (total > 500) {
            System.out.println("Compra de alto valor");
        } else {
            System.out.println("Compra comum");
        }
    }
}

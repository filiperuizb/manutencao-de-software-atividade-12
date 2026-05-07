package inline_method;

public class Ex3_5 {

    public void exibirTipoFrete(double totalCompra) {
        if (totalCompra >= 200) {
            System.out.println("Frete grátis");
        } else {
            System.out.println("Frete pago");
        }
    }

}

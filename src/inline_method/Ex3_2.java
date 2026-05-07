package inline_method;

public class Ex3_2 {
    public void confirmarPedido(double total) {
        if (total >= 50) {
            System.out.println("Pedido confirmado");
        } else {
            System.out.println("Valor mínimo não atingido");
        }
    }
}

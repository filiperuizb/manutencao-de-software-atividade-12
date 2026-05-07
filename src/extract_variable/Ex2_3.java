package extract_variable;

public class Ex2_3 {

    public void avaliarEntrega(boolean entregouNoPrazo, double nota, boolean justificativaAceita) {

        boolean validaEntregaNormal = entregouNoPrazo && nota >= 6.0;
        boolean validaEntregaComJustificativaDeAtraso = !entregouNoPrazo && justificativaAceita && nota >= 7.0;
        boolean validaEntrega = validaEntregaNormal || validaEntregaComJustificativaDeAtraso;

        if (validaEntrega) {
            System.out.println("Trabalho aceito");
        } else {
            System.out.println("Trabalho recusado");
        }
    }

}

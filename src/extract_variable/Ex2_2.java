package extract_variable;

public class Ex2_2 {

    public void verificarAcesso(boolean usuarioAtivo, boolean senhaCorreta, boolean admin, boolean bloqueado) {

        boolean usuarioComumValido  = usuarioAtivo && senhaCorreta && !bloqueado;
        boolean adminValido = admin && senhaCorreta;
        boolean validaAcesso = usuarioComumValido || adminValido;

        if (validaAcesso) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }
    }

}

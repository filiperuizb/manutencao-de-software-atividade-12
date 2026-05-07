package inline_method;

public class Ex3_1 {

    public void cadastrarParticipante(int idade) {
        if (idade >= 18) {
            System.out.println("Cadastro permitido");
        } else {
            System.out.println("Cadastro negado");
        }
    }

}

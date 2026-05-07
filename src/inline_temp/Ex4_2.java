package inline_temp;

public class Ex4_2 {

    public void verificarMedia(double prova1, double prova2) {
        // nesse caso eu não concordo muito com esse if não seria melhor com a variável media
        if (((prova1 + prova2) / 2) >= 6.0) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }

}

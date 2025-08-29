package src.academy.devdojo.maratonajava.introdução;

public class OperadoresLógicos {
    public static void main(String[] args) {
        int idade = 18;
        float dinheiro = 1500f;
        boolean podeTirarHabilitacao = idade >= 18 && dinheiro >= 1360;
        boolean notPodeTirarHabilitacao =  idade < 18 && dinheiro <= 1360;


        System.out.println("Pode tirar a habilitação " + podeTirarHabilitacao);
        System.out.println("Não pode tirar a habilitação " + notPodeTirarHabilitacao);

        if (podeTirarHabilitacao) {
            System.out.println("Você pode tirar a habilitação! ");
        }
        else {
            System.out.println("Você não pode tirar a habilitação!");
        }
    }
}

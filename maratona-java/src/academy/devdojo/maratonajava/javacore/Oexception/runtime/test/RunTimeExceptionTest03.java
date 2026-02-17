package src.academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Manipulando arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    public static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Manipulando arquivo");
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}

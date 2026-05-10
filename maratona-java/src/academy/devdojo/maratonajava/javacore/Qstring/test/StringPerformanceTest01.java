package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main() {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + " ms");

        long inicio1 = System.currentTimeMillis();
        concatStringBuilder(30_000);
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuild: " + (fim1 - inicio1) + " ms");

        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(30_000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim2 - inicio2) + " ms");
    }

    private static void concatString(int size) {
        String texto = "";
        for (int i = 0; i < size; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }
}

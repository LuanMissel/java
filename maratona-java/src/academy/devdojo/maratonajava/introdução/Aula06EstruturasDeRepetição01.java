package src.academy.devdojo.maratonajava.introdução;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while, do while, for
        int cont = 0;
        while(cont < 10) {
            System.out.println(cont);
            cont+= 1;
        }
        cont = 0;
        do {
            System.out.println("Dentro do do-while" + cont++);
        }  while (cont < 10);

        for (int i=0; i<10; i++) {
            System.out.println("For" + i);
        }
    }
}

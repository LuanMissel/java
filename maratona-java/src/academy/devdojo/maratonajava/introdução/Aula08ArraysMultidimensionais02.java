package src.academy.devdojo.maratonajava.introdução;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int numbers[][] = new int [3][];
        
        numbers[0] = new int[6];
        numbers[1] = new int [4];
        numbers[2] = new int [3];

        for (int[] num : numbers) {
            System.out.println("\n ------------");
            for(int i : num) {
                System.out.print(i);
            }
        }

    }
}

    package src.academy.devdojo.maratonajava.introdução;
    public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;
        
        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;
        
        dias[2][0] = 31;
        dias[2][1] = 30;
        dias[2][2] = 31;
        
        /*  for (int i = 0; i < dias.length; i++) {
                for (int j = 0; j < dias[0].length; j++) {
                    System.out.println(dias[i][j]); 
                }
            }
        */
        for (int[] arrBase : dias) { 
                for (int num : arrBase) {
                System.out.println(num);
                }
            }
        }
        
}

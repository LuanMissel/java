package src.academy.devdojo.maratonajava.javacore.introducaometodos.dominio;


public class Funcionarios {
    public String[]  nome = new String[3];
    public int idade[] = new int[3];
    public double [] salario = new double[3];
    public double somaTotal = 0;
    public int totalFuncionarios = 0;
    public double media = 0;
    @SuppressWarnings("ForLoopReplaceableByForEach")
    public void ImprimirDados(){
        System.out.println("----------------------------------------");
        salario [0] = 6600;
        salario [1] = 5250;
        salario [2] = 3500;
     
        for (int i = 0; i < nome.length; i++) {
            if (nome [i] != null) {
                System.out.println("Funcionário: " + nome[i]);
            }
        }
        
     
        
        for (int i = 0; i < idade.length; i++){
            if (idade[i] != 0) {
            System.out.println (nome [i] + " tem " + idade [i] + " anos");
            }
        }
        


        for (int i = 0; i < salario.length; i++) {
            if (salario[i] != 0) {
                    System.out.println("O salário do " + nome[i] + " é: "+ salario[i]);
            }
        }
    }

     public void calcularMediaSalario(){
        if (salario != null) {
            double media1 = 0;
            for (int i = 0; i < salario.length; i++) {
                media1  = media1 +  salario[i];
            }
            System.out.println("A média dos salários é: "+ media1/nome.length);

        }
    }
    
}


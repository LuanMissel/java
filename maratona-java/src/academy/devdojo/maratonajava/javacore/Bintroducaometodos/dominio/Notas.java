package src.academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Notas {
    public String nome;
    public String turma;
    public double nota1;
    public double nota2;

    public void dadosDoAluno (String nome, String turma){
        this.nome = nome;
        this.turma = turma;
    }
    public double calculaMediaAluno(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
        return (nota1 + nota2) / 2;
    }

    public void imprimirNaTela(){
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua turma é: "+ turma);
        System.out.println("Sua nota1 é: " + nota1);
        System.out.println("Sua nota2 é: " + nota2);
    }
}

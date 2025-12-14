package src.academy.devdojo.maratonajava.javacore.Gassociacao.test;

import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.AlunoSeminario;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ProfessorSeminario;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;


public class SeminarioTest {
    public static void main(String[] args) {
        ProfessorSeminario professor = new ProfessorSeminario("Wictor", "Química");
        ProfessorSeminario professor2 = new ProfessorSeminario("Saulo", "Tecnologia da informação");
        AlunoSeminario aluno1 = new AlunoSeminario("Lucas", 17);
        AlunoSeminario aluno2 = new AlunoSeminario("Saul", 18);
        AlunoSeminario aluno3 = new AlunoSeminario("Pablo", 23);
        AlunoSeminario aluno4 = new AlunoSeminario("Gabriel", 19);
        AlunoSeminario aluno5 = new AlunoSeminario("Diniz",  24);
        AlunoSeminario aluno6 = new AlunoSeminario("Lucas", 29);
        AlunoSeminario [] alunosSeminario = {aluno1, aluno2, aluno3, aluno4, aluno5, aluno6};
        AlunoSeminario aluno7 = new AlunoSeminario("Matheus", 30);
        AlunoSeminario aluno8 = new AlunoSeminario("Paulo", 31);
        AlunoSeminario aluno9 = new AlunoSeminario("Elielson", 32);
        AlunoSeminario aluno10 = new AlunoSeminario("João", 33);
        AlunoSeminario aluno11 = new AlunoSeminario("Felipe", 34);
        AlunoSeminario [] alunosSeminario2 = {aluno7, aluno8, aluno9, aluno10, aluno11};
        Local local =  new Local("São Paulo");
        Seminario seminario= new Seminario("O olhar para o futuro!!!", professor, alunosSeminario,local);
        Seminario seminario2 = new Seminario("A Ia é o futuro do mundo!", professor2, alunosSeminario2,local);
        seminario.Imprimir();
        System.out.println("================================================================================");
        seminario2.Imprimir();


        System.out.println("O aluno: " + aluno1.getNome() + " está presente no seminário: " + aluno1.getSeminario().getTitulo());
    }
}

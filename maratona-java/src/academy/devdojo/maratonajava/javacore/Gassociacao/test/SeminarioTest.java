package src.academy.devdojo.maratonajava.javacore.Gassociacao.test;

import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.AlunoSeminario;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ProfessorSeminario;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        ProfessorSeminario professor = new ProfessorSeminario("Wictor", "Química");
        AlunoSeminario aluno1 = new AlunoSeminario("Lucas", 17);
        AlunoSeminario aluno2 = new AlunoSeminario("Saul", 18);
        AlunoSeminario aluno3 = new AlunoSeminario("Pablo", 23);
        AlunoSeminario aluno4 = new AlunoSeminario("Gabriel", 19);
        AlunoSeminario aluno5 = new AlunoSeminario("Diniz",  24);
        AlunoSeminario aluno6 = new AlunoSeminario("Lucas", 29);
        AlunoSeminario [] aluno = {aluno1, aluno2, aluno3, aluno4, aluno5, aluno6};
        Local local =  new Local("São Paulo");
        Seminario seminario = new Seminario("O olhar para o futuro!!!", professor, aluno,local);
        seminario.Imprimir();

    }
}

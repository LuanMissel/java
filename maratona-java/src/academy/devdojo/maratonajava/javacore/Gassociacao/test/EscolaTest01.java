package src.academy.devdojo.maratonajava.javacore.Gassociacao.test;

import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args){
        Professor professor1 = new Professor("Matheus");
        Professor professor2 = new Professor("Áthila");
        Professor professor3 = new Professor("Epitacio");
        Professor professor4 = new Professor("Gabriel");
        Professor [] professor = {professor1,professor2,professor3,professor4};

        Escola escola = new Escola("Colégio Selectus", professor);

        escola.Imprime();
    }
}

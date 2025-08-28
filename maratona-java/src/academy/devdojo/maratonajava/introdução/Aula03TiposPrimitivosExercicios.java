package src.academy.devdojo.maratonajava.introdução;

import java.util.Date;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String name = "Luan Missel";
        String address = "Quadra A5, Lote 14a - Mansões Olinda - Águas Lindas de Goiás";
        double salario = 2000;
        Date data = new Date();
        String relatorio = "Eu " + name + ", morando no endereço " + address + " confirmo que recebi o salário de " + salario + " na data de " + data;
        System.out.println(relatorio);
    }
}

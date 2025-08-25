package horadosistema; // Define o pacote onde está sua classe. Ajuda a organizar o projeto.

import java.util.Date; // Importa a classe Date, que serve para trabalhar com datas e horas.

public class HoradoSistema { // Declara a classe chamada HoradoSistema.
    public static void main(String[] args) { // Método principal, onde o programa começa a rodar.
        Date relogio = new Date(); // Declara a variável 'relogio' do tipo Date e cria um novo objeto Date com a data e hora atual.
        System.out.println("A hora do sistema é"); // Mostra o texto "A hora do sistema é" na tela.
        System.out.println(relogio.toString()); // Mostra a data e hora atual na tela, usando o objeto relogio.
    }
}


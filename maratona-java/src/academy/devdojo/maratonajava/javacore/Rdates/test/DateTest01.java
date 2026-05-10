package src.academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    static void main() {
        Date date = new Date(); // já depreciado pode ser removido em futuras versões do java
        date.setTime(date.getTime() + 3_600_000); // adiciona 1 hora
        System.out.println(date);
    }
}

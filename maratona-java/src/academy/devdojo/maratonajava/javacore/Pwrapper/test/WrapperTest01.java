package src.academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    static void main() {
    byte byteP =1;
    short shortP = 1;
    int integerP = 1;
    long longP = 1L;
    float floatP = 1.0F;
    double doubleP = 1.0;
    char characterP = 'A';
    boolean booleanP = true;
    /*
    * Tipos primitivos tem uma classe wrapper, ou seja, uma classe que envolve o tipo primitivo e tem métodos para manipular esse tipo.
    * Os tipos primitivos não são objetos, mas as classes wrapper são objetos. As classes wrapper tem um construtor que recebe o tipo primitivo e um metofo valueOf que retorna um objeto wrapper a partir do tipo primitivo.
    * */
    Byte byteW = 1;
    Short shortW = 1;
    Integer integerW = 1;
    Long longW = 1L;
    Float floatW = 1.0F;
    Double doubleW = 1.0;
    Character characterW = 'A';
    Boolean booleanW = true;     // Autoboxing - conversão automática de tipos primitivos para wrapper

    int i = integerW; // Unboxing - conversão automática de wrapper para tipos primitivos
        System.out.println(Character.isAlphabetic(1));

    }
}

package src.academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    int MaX_DATA_SIZE = 1000; // public static final is redudant
    void load();

    default void checkPermission() {
        System.out.println("Checking permissions...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do método retrieveMaxDataSize na interface");
    }
}

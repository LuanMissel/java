package src.academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Loading data from database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões para acessar banco de dados...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do método retrieveMaxDataSize na classe DatabaseLoader");
    }
}

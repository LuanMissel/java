package src.academy.devdojo.maratonajava.javacore.Oexception.exception.repositorio;

public class UsuarioRepositorioSql implements Repositorio {
    @Override
    public void salvar(String cpf) {
        System.out.println("Salvando usuário no banco de dados SQL: " + cpf);
     }

}

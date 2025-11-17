package src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class ProfessorSeminario {
    private String nome;
    private String materia;
    private Seminario seminario;

    public  ProfessorSeminario(String nome) {
        this.nome = nome;
    }

    public ProfessorSeminario(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

}

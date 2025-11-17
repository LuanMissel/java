package src.academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private ProfessorSeminario professor;
    private AlunoSeminario[] aluno;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, ProfessorSeminario professor, AlunoSeminario[] aluno, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.aluno = aluno;
        this.local = local;

        if (professor != null) {
            this.professor.setSeminario(this);
        }

        if (aluno != null) {
            for (AlunoSeminario a : aluno) {
                a.setSeminario(this);
            }
        }

        if (local != null) {
            this.local.setSeminario(this);
        }
    }


    public void Imprimir() {
        System.out.println("Estamos todos reunidos para o seminário: " + titulo + " que está sendo realizado em " + local.getEndereco());
        if (this.professor == null) return;
        System.out.println("Teremos hoje a palestra do professor: " + professor.getNome() + " que ministra a matéria: " + professor.getMateria());
        if (this.aluno == null) return;
        System.out.println("E conteremos com a presença dos alunos: ");
        for (AlunoSeminario aluno : this.aluno) {
            System.out.println(aluno.getNome());
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public ProfessorSeminario getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorSeminario professor) {
        this.professor = professor;
    }

    public AlunoSeminario[] getAluno() {
        return aluno;
    }

    public void setAluno(AlunoSeminario[] aluno) {
        this.aluno = aluno;
    }

}

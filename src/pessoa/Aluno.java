package pessoa;

import curso.Curso;

public class Aluno extends Pessoa {

    private long matricula;
    private Curso curso;


    public Aluno(String nome, String sobrenome, String email, long matricula, Curso curso, long cpf) {
        super(nome, sobrenome, email, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aluno{");
        sb.append("matricula=").append(matricula);
        sb.append(", curso=").append(curso);
        sb.append('}');
        sb.append(' ').append(super.toString());
        return sb.toString();
    }
}

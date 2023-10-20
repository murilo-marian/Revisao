package necessidades;

import pessoa.Professor;

import java.time.LocalDate;

public abstract class Necessidades {
    private Professor professor;
    private LocalDate data;

    public Necessidades(Professor professor, LocalDate data) {
        this.professor = professor;
        this.data = data;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Necessidades{");
        sb.append("professor=").append(professor);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}

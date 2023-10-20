package fase;

import disciplina.Disciplina;

import java.util.ArrayList;

public class Fase {
    private long id;
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Fase(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fase{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", disciplinas=").append(disciplinas);
        sb.append('}');
        return sb.toString();
    }
}

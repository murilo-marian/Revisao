package curso;

import fase.Fase;
import pessoa.Professor;

import java.util.ArrayList;
import java.util.Arrays;

public class Curso {
    private long id;
    private String nome;
    private ArrayList<Fase> fases;
    private Professor coordenador;

    public Curso(long id, String nome, Professor coordenador) {
        this.id = id;
        this.nome = nome;
        this.coordenador = coordenador;
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

    public ArrayList<Fase> getFases() {
        return fases;
    }

    public void setFases(ArrayList<Fase> fases) {
        this.fases = fases;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", fases=").append(fases);
        sb.append(", coordenador=").append(coordenador);
        sb.append('}');
        return sb.toString();
    }
}

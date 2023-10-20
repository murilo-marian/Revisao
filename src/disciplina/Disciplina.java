package disciplina;

import pessoa.Aluno;
import necessidades.Avaliacao;
import necessidades.Chamada;
import pessoa.Professor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Disciplina {
    private long idDisciplina;
    private String nome;
    private String ementa;
    private String descricao;
    private boolean ofertada;
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Aluno> matriculados;
    private ArrayList<Avaliacao> avaliacoes;
    private ArrayList<Chamada> chamadas;

    public void fazerChamada(LocalDate data, Professor professor, Map<Aluno, Boolean> notas) {
        Chamada chamada = new Chamada(professor, data);
        chamadas.add(chamada);
    }

    public void fazerAvaliacao(LocalDate data, Professor professor, Map<Aluno, Float> notas, int peso) {
        Avaliacao avaliacao = new Avaliacao(professor, data, peso);
        avaliacoes.add(avaliacao);
    }

    public Disciplina(long idDisciplina, String nome, String ementa, String descricao, boolean ofertada) {
        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.ementa = ementa;
        this.descricao = descricao;
        this.ofertada = ofertada;
    }

    public boolean adicionarProfessor(Professor professor) {
        if (professores.size() < 4) {
            professores.add(professor);
            return true;
        }
        return false;
    }

    public void adicionarAluno(Aluno aluno) {
        matriculados.add(aluno);
    }

    public long getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isOfertada() {
        return ofertada;
    }

    public void setOfertada(boolean ofertada) {
        this.ofertada = ofertada;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(ArrayList<Aluno> matriculados) {
        this.matriculados = matriculados;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public ArrayList<Chamada> getChamadas() {
        return chamadas;
    }

    public void setChamadas(ArrayList<Chamada> chamadas) {
        this.chamadas = chamadas;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Disciplina{");
        sb.append("idDisciplina=").append(idDisciplina);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append(", ofertada=").append(ofertada);
        sb.append('}');
        return sb.toString();
    }
}

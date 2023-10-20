package necessidades;

import pessoa.Aluno;
import pessoa.Professor;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Avaliacao extends Necessidades {
    private int peso;
    private Map<Aluno, Float> notas = new HashMap<Aluno, Float>();

    public Avaliacao(Professor professor, LocalDate data, int peso) {
        super(professor, data);
        this.peso = peso;
    }

    public Map<Aluno, Float> getNotas() {
        return notas;
    }

    public void setNotas(Map<Aluno, Float> notas) {
        this.notas = notas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Avaliacao{");
        sb.append("peso=").append(peso);
        sb.append(", notas=").append(notas);
        sb.append('}');
        sb.append(' ').append(super.toString());
        return sb.toString();
    }
}

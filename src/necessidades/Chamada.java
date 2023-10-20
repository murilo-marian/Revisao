package necessidades;

import pessoa.Aluno;
import pessoa.Professor;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Chamada extends Necessidades {
    private Map<Aluno, Boolean> presenca = new HashMap<Aluno, Boolean>();

    public Chamada(Professor professor, LocalDate data) {
        super(professor, data);
    }

    public Map<Aluno, Boolean> getPresenca() {
        return presenca;
    }

    public void setPresenca(Map<Aluno, Boolean> presenca) {
        this.presenca = presenca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chamada{");
        sb.append("presenca=").append(presenca);
        sb.append('}');
        sb.append(' ').append(super.toString());
        return sb.toString();
    }
}

import atividades.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Workflow {

    private List<Atividade> atividades;

    public Workflow() {
        this.atividades = new ArrayList<>();
    }

    public List<Atividade> getAtividades()  {
        return atividades;
    }

    public void registrarAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }
}

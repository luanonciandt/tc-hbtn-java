import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws IllegalArgumentException {
        for (Tarefa value : this.tarefas) {
            if (value.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
            }
        }
        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for(Tarefa value : this.tarefas) {
            if(value.getIdentificador() == identificador) {
                value.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for(Tarefa value : this.tarefas) {
            if(value.getIdentificador() == identificador) {
                value.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for(Tarefa value : this.tarefas) {
            value.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for(Tarefa value : this.tarefas) {
            value.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for(Tarefa value : this.tarefas) {
            String feita = value.isEstahFeita() ? "X" : " ";
            System.out.printf("[%s]  Id: %d - Descricao: %s\n", feita, value.getIdentificador(), value.getDescricao());
        }
    }
}

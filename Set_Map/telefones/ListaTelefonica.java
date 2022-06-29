import java.util.*;

public class ListaTelefonica {

    private Map<String, ArrayList<Telefone>> clientes;

    public ListaTelefonica() {
        this.clientes = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        if (!this.clientes.containsKey(nome)) {
            this.clientes.put(nome, new ArrayList<>());
        }
        this.clientes.get(nome).add(telefone);
    }

    public ArrayList<Telefone> buscar(String nome) {
        if (this.clientes.containsKey(nome)) {
            return this.clientes.get(nome);
        }
        return null;
    }
}

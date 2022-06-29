import java.util.*;

public class ListaTelefonica {

    private Map<String, HashSet<Telefone>> clientes;

    public ListaTelefonica() {
        this.clientes = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) throws IllegalArgumentException {
        if (!this.clientes.containsKey(nome)) {
            this.clientes.put(nome, new HashSet<>());
        }
        if (this.clientes.get(nome).contains(telefone)) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }
        for (String cliente : this.clientes.keySet()) {
            if (cliente.equals(nome)) continue;
            Iterator<Telefone> it = this.clientes.get(cliente).iterator();
            Telefone tel;
            while(it.hasNext()) {
                tel = it.next();
                if (tel.equals(telefone)) {
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        }
        this.clientes.get(nome).add(telefone);
    }

    public HashSet<Telefone> buscar(String nome) {
        if (this.clientes.containsKey(nome)) {
            return this.clientes.get(nome);
        }
        return null;
    }
}

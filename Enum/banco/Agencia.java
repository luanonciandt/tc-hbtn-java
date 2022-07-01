import java.util.ArrayList;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean novoCliente(String nome, double transacaoInicial) {
        if (buscarCliente(nome) == null) {
            this.clientes.add(new Cliente(nome, transacaoInicial));
            return true;
        }  else {
            return false;
        }
    }

    public boolean adicionarTransacaoCliente(String nome, double transacao) {
        if (buscarCliente(nome) != null) {
            this.buscarCliente(nome).adicionarTransacao(transacao);
            return true;
        } else {
            return false;
        }
    }

}

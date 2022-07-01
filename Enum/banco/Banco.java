import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nome) {
        for (Agencia agencia : agencias) {
            if (agencia.getNome().equals(nome)) {
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        if (buscarAgencia(nomeAgencia) == null) {
            this.agencias.add(new Agencia(nomeAgencia));
            return true;
        } else {
            return false;
        }
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double transacaoInicial) {
        if (buscarAgencia(nomeAgencia).buscarCliente(nomeCliente) == null) {
            buscarAgencia(nomeAgencia).novoCliente(nomeCliente, transacaoInicial);
            return true;
        } else {
            return false;
        }
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double transacao) {
        if (buscarAgencia(nomeAgencia).buscarCliente(nomeCliente) != null) {
            buscarAgencia(nomeAgencia).adicionarTransacaoCliente(nomeCliente, transacao);
            return true;
        } else {
            return false;
        }
    }

    public boolean listarClientes(String agencia, boolean imprimeTransacoes) {
        int countCliente = 1;
        int countTransacao = 1;
        if (buscarAgencia(agencia) != null) {
            if (imprimeTransacoes) {
                for (Cliente cliente : buscarAgencia(agencia).getClientes()) {
                    System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), countCliente);
                    for (Double transacao : cliente.getTransacoes()) {
                        System.out.printf("[%d] valor %.2f\n", countTransacao, transacao);
                        countTransacao++;
                    }
                    countTransacao = 1;
                    countCliente++;
                }
            } else {
                for (Cliente cliente : buscarAgencia(agencia).getClientes()) {
                    System.out.printf("Cliente: %s [%d]", cliente.getNome(), countCliente);
                    countCliente++;
                }
            }
            return true;
        } else {
            return false;
        }

    }
}

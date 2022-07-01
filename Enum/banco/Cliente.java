import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, double transacaoInicial) {
        this.nome = nome;
        this.transacoes = new ArrayList<>(List.of(transacaoInicial));
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valorTransacao) {
        this.transacoes.add(valorTransacao);
    }
}

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkup = 10;

    public Supplier<Double> precoComMarkup = () -> this.preco + (this.preco * this.percentualMarkup / 100);
    public Consumer<Double> atualizarMarkup = (d) -> this.percentualMarkup = d;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

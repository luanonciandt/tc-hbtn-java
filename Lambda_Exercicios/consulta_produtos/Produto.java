public class Produto {

    private String nome;
    private double preco;
    private double peso;
    private int quantidadeEmEstoque;
    private TiposProduto tipos;

    public Produto(String nome, double preco, double peso, int quantidadeEmEstoque, TiposProduto tipos) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.tipos = tipos;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setTipos(TiposProduto tipos) {
        this.tipos = tipos;
    }

    @Override
    public String toString() {
        return String.format("%s %.6f %.6f %d %s",
                this.nome,
                this.preco,
                this.peso,
                this.quantidadeEmEstoque,
                this.tipos);
    }
}

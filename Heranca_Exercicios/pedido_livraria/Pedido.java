public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido itemPedido : this.getItens()) {
            total += itemPedido.getProduto().obterPrecoLiquido() * itemPedido.getQuantidade();
        }
        return total - (total * this.getPercentualDesconto() / 100);
    }
}

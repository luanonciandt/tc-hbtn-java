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
        return subTotal() - desconto(subTotal());
    }

    public double subTotal() {
        double total = 0.0;
        for (ItemPedido itemPedido : this.getItens()) {
            total += itemPedido.getProduto().obterPrecoLiquido() * itemPedido.getQuantidade();
        }
        return total;
    }

    public double desconto(double total) {
        return total * this.getPercentualDesconto() / 100;
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido itemPedido : this.getItens()) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                    itemPedido.getProduto().getClass().getSimpleName(),
                    itemPedido.getProduto().getTitulo(),
                    itemPedido.getProduto().obterPrecoLiquido(),
                    itemPedido.getQuantidade(),
                    itemPedido.getProduto().obterPrecoLiquido() * itemPedido.getQuantidade());
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", desconto(subTotal()));
        System.out.printf("TOTAL PRODUTOS: %.2f\n", subTotal());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");

    }
}

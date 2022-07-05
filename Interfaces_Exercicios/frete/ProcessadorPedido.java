import provedores.Frete;
import provedores.ProvedorFrete;

public class ProcessadorPedido {

    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public ProvedorFrete getProvedorFrete() {
        return provedorFrete;
    }

    public void setProvedorFrete(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
        pedido.setFrete(this.provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));
    }
}

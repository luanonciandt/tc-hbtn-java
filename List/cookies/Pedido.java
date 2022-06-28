import java.util.ArrayList;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie cookie) {
        this.cookies.add(cookie);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for(PedidoCookie cookie : this.cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int count = 0;
        for(int i = 0; i < this.cookies.size(); ++i) {
            if (this.cookies.get(i).getSabor().equals(sabor)) {
                count += this.cookies.get(i).getQuantidadeCaixas();
                this.cookies.remove(i);
            }
        }
        return count;
    }
}

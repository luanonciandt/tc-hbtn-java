import java.util.Map;
import java.util.TreeMap;

public class Armazem<T> implements Armazenavel<T> {

    Map<String, T> items;

    public Armazem() {
        this.items = new TreeMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        this.items.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return this.items.get(nome);
    }
}

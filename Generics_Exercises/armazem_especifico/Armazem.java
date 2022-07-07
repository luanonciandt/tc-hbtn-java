import java.util.TreeMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T> {

    protected Map<String, T> items;

    public Armazem() {
        this.items = new TreeMap<>();
    }

    public Map<String, T> getItems() {
        return items;
    }
}

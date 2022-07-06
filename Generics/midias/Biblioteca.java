import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {

    private List<T> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    public List<T> getMidias() {
        return midias;
    }

    public void adicionarMidia(T midia) {
        this.midias.add(midia);
    }

    public String obterListaMidias() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.midias.size(); i++) {
            String ap = (i == this.midias.size()-1) ? this.midias.get(i) + "]" : this.midias.get(i) + ", ";
            sb.append(ap);
        }
        return sb.toString();
    }
}

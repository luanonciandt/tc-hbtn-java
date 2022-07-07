public class ArmazemDeComida extends Armazem<Comida> {

    public void adicionarAoInventario(String nome, Comida comida) {
        this.items.put(nome, comida);
    }

    public Comida obterDoInventario(String nome) {
        return this.items.get(nome);
    }
}

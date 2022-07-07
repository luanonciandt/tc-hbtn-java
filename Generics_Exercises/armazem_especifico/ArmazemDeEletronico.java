public class ArmazemDeEletronico extends Armazem<Eletronico> {
    @Override
    public void adicionarAoInventario(String nome, Eletronico eletronico) {
        this.items.put(nome, eletronico);
    }

    @Override
    public Eletronico obterDoInventario(String nome) {
        return this.items.get(nome);
    }
}

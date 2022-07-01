import java.util.ArrayList;
import java.util.List;

public class Celular {

    private List<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public int obterPosicaoContato(String nome) {
        for (int i = 0; i < this.contatos.size(); i++) {
            if (this.contatos.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato) throws IllegalArgumentException {
        if (this.obterPosicaoContato(contato.getNome()) != -1) {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
        this.contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato contatoNovo) throws IllegalArgumentException {
        int indexAntigo = this.obterPosicaoContato(contatoAntigo.getNome());
        int indexNovo = this.obterPosicaoContato(contatoNovo.getNome());
        if (indexAntigo == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }
        if (!this.contatos.get(indexAntigo).getNome().equals(contatoNovo.getNome())) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }
        this.contatos.set(indexAntigo, contatoNovo);
    }

    public void removerContato(Contato contato) throws IllegalArgumentException {
        if (this.obterPosicaoContato(contato.getNome()) == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }
        this.contatos.remove(contato);
    }

    public void listarContatos() {
        for (Contato contato : this.contatos) {
            System.out.println(contato);
        }
    }

}

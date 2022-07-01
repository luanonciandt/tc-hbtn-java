import java.util.Objects;

public class Contato {

    private String nome;
    private String numero;
    private TipoNumero tipoNumero;

    public Contato(String nome, String numero, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numero = numero;
        this.tipoNumero = tipoNumero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return String.format("%s -> %s (%s)", this.nome, this.numero, this.tipoNumero.name());
    }
}

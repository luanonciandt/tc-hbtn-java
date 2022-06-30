import java.util.Objects;

public class Autor implements Comparable<Autor>{

    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this. nome + " " + this.sobrenome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(getNome(), autor.getNome()) && Objects.equals(getSobrenome(), autor.getSobrenome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSobrenome());
    }

    @Override
    public int compareTo(Autor autor) {
        return this.toString().compareTo(autor.toString());
    }
}

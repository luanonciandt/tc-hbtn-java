import java.util.Objects;

public class Telefone {

    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", this.codigoArea, this.numero);
    }

    @Override
    public boolean equals(Object o) {
        Telefone outro = (Telefone) o;
        return this.numero.equals(outro.getNumero());
    }

    @Override
    public int hashCode() {
        return this.numero.charAt(3);
    }
}

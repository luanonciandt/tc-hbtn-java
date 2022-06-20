import comida.Comida;
import humor.*;

public class Personagem {

    private int pontosDeFelicidade;

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    private Humor obterHumorAtual() {
        if (this.pontosDeFelicidade < -5) {
            return new Irritado();
        } else if (this.pontosDeFelicidade <= 0) {
            return new Triste();
        } else if (this.pontosDeFelicidade <= 15) {
            return new Feliz();
        } else {
            return new MuitoFeliz();
        }
    }

    public void comer(Comida[] comidas) {
        for (Comida comida : comidas) {
            setPontosDeFelicidade(getPontosDeFelicidade() + comida.getPontosDeFelicidade());
        }
    }

    @Override
    public String toString() {
        return getPontosDeFelicidade() + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}

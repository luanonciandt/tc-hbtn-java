public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual(saudeAtual);
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        if (saudeAtual >= 0 && saudeAtual <= 100) {
            this.saudeAtual = saudeAtual;
        }
        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else  {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() > 0) {
            this.nome = nome;
        }
    }

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano) {
        if (this.saudeAtual >= quantidadeDeDano) {
            setSaudeAtual(this.getSaudeAtual() - quantidadeDeDano);
        } else {
            setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        if (quantidadeDeCura <= 100 - this.saudeAtual) {
            setSaudeAtual(this.getSaudeAtual() + quantidadeDeCura);
        } else {
            setSaudeAtual(100);
        }
    }

}

public class InteiroPositivo {
    private Integer valor;

    public InteiroPositivo(int valor) {
        if (valor < 0) {
            throw new RuntimeException("Valor nao eh um inteiro positivo");
        }
        this.valor = valor;
    }

    public InteiroPositivo(String valor) {
        int val = Integer.parseInt(valor);
        if (val < 0) {
            throw new RuntimeException("Valor nao eh um inteiro positivo");
            //System.out.println("Valor nao eh um inteiro positivo");
        }
        this.valor = val;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        if (valor < 0) {
            throw new RuntimeException("Valor nao eh um inteiro positivo");
        }
        this.valor = valor;
    }

    public boolean ehPrimo() {
        if (this.valor == 1) {
            return false;
        }
        if (this.valor <= 2) {
            return true;
        }
        return !(this.valor % 2 == 0);
    }

}

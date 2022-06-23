import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    protected double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para saque deve ser maior que 0");
        }
        if (this.saldo < valor) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        this.saldo -= valor;
    }

    public double calcularTarifaMensal() {
        return (10 <= this.saldo * 0.1) ? 10 : this.saldo * 0.1;
    }

    public double calcularJurosMensal() {
        if (this.saldo == 0.0) {
            return 0.0;
        }
        return (this.taxaJurosAnual / 100) / 12;
    }

    public void aplicarAtualizacaoMensal() {
        double saldoAtual = this.saldo;
        this.saldo = this.saldo - calcularTarifaMensal();
        this.saldo = this.saldo + (saldoAtual * this.calcularJurosMensal());
    }
}

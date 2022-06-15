public class Empregado {

    private String nome;
    private int codigo;
    private Endereco endereco;

    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void apresentar() {
        String informacoesEmpregado = "Codigo: " + getCodigo() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Bairro: " + getEndereco().getBairro() + "\n" +
                "Cidade: " + getEndereco().getCidade() + "\n" +
                "Pais: " + getEndereco().getPais();
        System.out.print(informacoesEmpregado);

    }
}

// Classe abstrata Pessoa
abstract class Pessoa {
    // Variável de instância comum a todas as subclasses
    protected String nome;

    // Construtor da classe abstrata
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void exibirDados();
}

// Subclasse concreta PessoaFisica
class PessoaFisica extends Pessoa {
    // Variável de instância específica da subclasse
    private String cpf;

    // Construtor da subclasse
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    // Implementação do método abstrato da classe pai
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}

// Subclasse concreta PessoaJuridica
class PessoaJuridica extends Pessoa {
    // Variável de instância específica da subclasse
    private String cnpj;

    // Construtor da subclasse
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    // Implementação do método abstrato da classe pai
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
    }
}

// Exemplo de utilização das classes
public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "123.456.789-01");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "12.345.678/0001-90");

        pessoaFisica.exibirDados();
        System.out.println();
        pessoaJuridica.exibirDados();
    }
}

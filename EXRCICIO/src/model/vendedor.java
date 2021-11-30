package model;
import java.time.LocalDate;

public class vendedor {
    private int id;
    private String nome;
    private LocalDate dataDeNascimento;
    private long cpf;
    private double salario;
    private String endereco;

    public vendedor (String nome, LocalDate dataDeNascimento, long cpf, double salario, String endereco) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.salario = salario;
        this.endereco = endereco;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

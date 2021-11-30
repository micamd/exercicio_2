package model;
import java.time.LocalDate;

public class cliente {
	private int id;
    private String nome;
    private String telefone;
    private LocalDate dataDeNascimento;
    private long cpf;
    private String endereco;

    public cliente(String nome, String telefone, LocalDate dataDeNascimento, long cpf, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
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

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

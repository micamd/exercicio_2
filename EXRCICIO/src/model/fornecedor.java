package model;

public class fornecedor {
    private int id;
    private String nome;
    private String razaoSocial;
    private long cnpj;
    private String endereço;

    public fornecedor(String nome, String razaoSocial, long cnpj, String endereço) {
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereço = endereço;
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

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public long getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getendereço() {
        return this.endereço;
    }

    public void setendereço(String endereço) {
        this.endereço = endereço;
    }
    
}

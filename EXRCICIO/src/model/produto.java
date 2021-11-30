package model;

public class produto {
    private int id;
    private String nomeProduto;
    private double valorProduto;
    private String codProduto;
    private double cupomProduto;
    private String descriscaoProduto;

    public produto (String nomeProduto, double valorProduto, String codProduto, double cupomProduto, String descriscaoProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.codProduto = codProduto;
        this.cupomProduto = cupomProduto;
        this.descriscaoProduto = descriscaoProduto;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return this.valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getCodProduto() {
        return this.codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public double getCupomProduto() {
        return this.cupomProduto;
    }

    public void setCupomProduto(double cupomProduto) {
        this.cupomProduto = cupomProduto;
    }

    public String getDescriscaoProduto() {
        return this.descriscaoProduto;
    }

    public void setDescriscaoProduto(String descriscaoProduto) {
        this.descriscaoProduto = descriscaoProduto;
    }
}

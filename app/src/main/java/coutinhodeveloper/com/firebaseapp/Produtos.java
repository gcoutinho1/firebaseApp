package coutinhodeveloper.com.firebaseapp;

public class Produtos {

    private String descricaoProduto;
    private String corProduto;
    private String fabricanteProduto;

    // generate + constructor
    public Produtos() {
    }

    // generate + getters and setters + select all objects
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getCorProduto() {
        return corProduto;
    }

    public void setCorProduto(String corProduto) {
        this.corProduto = corProduto;
    }

    public String getFabricanteProduto() {
        return fabricanteProduto;
    }

    public void setFabricanteProduto(String fabricanteProduto) {
        this.fabricanteProduto = fabricanteProduto;
    }


}

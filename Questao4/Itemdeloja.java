package Questao4;

public class Itemdeloja {
    
    private int CodigoDoItem;
    private String NomeDoItem;
    private String DescricaoDoItem;
    private double ValorDoItem;
    
    public int getCodigoDoItem() {
        return CodigoDoItem;
    }
    public void setCodigoDoItem(int codigoDoItem) {
        CodigoDoItem = codigoDoItem;
    }
    public String getNomeDoItem() {
        return NomeDoItem;
    }
    public void setNomeDoItem(String nomeDoItem) {
        NomeDoItem = nomeDoItem;
    }
    public String getDescricaoDoItem() {
        return DescricaoDoItem;
    }
    public void setDescricaoDoItem(String descricaoDoItem) {
        DescricaoDoItem = descricaoDoItem;
    }
    public double getValorDoItem() {
        return ValorDoItem;
    }
    public void setValorDoItem(double valorDoItem) {
        ValorDoItem = valorDoItem;
    }

    public int getIdentificador(){
        return this.CodigoDoItem;
    }

    
}

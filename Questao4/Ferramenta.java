package Questao4;

public class Ferramenta extends Itemdeloja{
    private String Categoria;
    private Integer Serial;
    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String categoria) {
        this.Categoria = categoria;
    }
    public Integer getSerial() {
        return Serial;
    }
    public void setSerial(Integer serial) {
        this.Serial = serial;
    }

    @Override
    public int getIdentificador(){
        return this.Serial;
    }

    public void Separar(String Categoria){
        System.out.println(this.Categoria);
    }
    
}

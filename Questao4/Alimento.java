package Questao4;

public class Alimento extends Itemdeloja {
    private Integer Selo;

    public Integer getSelo() {
        return Selo;
    }

    public void setSelo(Integer selo) {
        Selo = selo;
    }

    @Override
    public int getIdentificador(){
        return this.Selo;
    }
}

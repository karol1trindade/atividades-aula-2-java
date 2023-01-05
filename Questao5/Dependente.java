package Questao5;

import java.util.Date;

public class Dependente {
    private int sequencial;
    private String nomecompleto;
    private Date datanasc;
    private Integer sexo;
    private boolean participarplano;
    
    public int getSequencial() {
        return sequencial;
    }
    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
    public String getNomecompleto() {
        return nomecompleto;
    }
    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }
    public Date getDatanasc() {
        return datanasc;
    }
    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }
    public Integer getSexo() {
        return sexo;
    }
    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }
    public boolean isParticiparplano() {
        return participarplano;
    }
    public void setParticiparplano(boolean participarplano) {
        this.participarplano = participarplano;
    }
    
}

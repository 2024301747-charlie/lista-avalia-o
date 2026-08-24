package avaliacao.formula;
public class Engenheiro extends Pessoa{
    private Piloto colega; 

    public Engenheiro(int idade, String nome, String pais, Piloto colega) {
        super(idade,nome,pais);
        this.colega = colega;
    }

    public Piloto getcolega(){ 
        return colega;
    }
    public void setcolega(Piloto colega) {
        this.colega = colega;
    }
} 
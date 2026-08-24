package avaliacao.formula;
public class Piloto extends Pessoa{
    private int NumVict; 

    public Piloto(int idade, String nome, String pais, int NumVict) {
        super(idade,nome,pais);
        this.NumVict = NumVict;
    }

    public int getNumVict(){ 
        return NumVict;
    }
    public void setNumVict(int NumVict) {
        this.NumVict = NumVict;
    }
} 
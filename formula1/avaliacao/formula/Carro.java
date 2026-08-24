package avaliacao.formula;
public class Carro {

    private int numero, posicao;
    private Equipe equipe;
    private Piloto piloto;

    Carro(int numero, int posicao, Equipe equipe, Piloto piloto) {
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
    }

    public int getNumero(){ 
        return numero;
    }
    public void setNumero(int numero){ 
        this.numero = numero;
    }

    public int getposicao(){ 
        return posicao;
    }
    public void setposicao(int posicao){ 
        this.posicao = posicao;
    }

    public Equipe getEquipe(){
        return equipe;
    }

    public void setEquipe(Equipe equipe){
        this.equipe = equipe;
    }

    public Piloto getPiloto(){
        return piloto;
    }

    public void setPiloto(Piloto piloto){
        this.piloto = piloto;
    }
}
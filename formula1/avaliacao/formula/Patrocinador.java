package  avaliacao.formula;
public class Patrocinador{
    String nome;
    float valor;

    public Patrocinador(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public float getvalor(){
        return valor;
    }

    public void setvalor(float valor){
        this.valor = valor;
    }
}
package avaliacao.formula;
public class Pessoa{
    protected int idade;
    protected String nome, pais; 

    public Pessoa(int idade, String nome, String pais) {
        this.idade = idade;
        this.nome = nome;
        this.pais = pais;
    }

    public int getidade(){ 
        return idade;
    }
    public void setidade(int idade){
        this.idade = idade;
    }

    public String getnome(){ 
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }

    public String getpais(){ 
        return pais;
    }
    public void setpais(String pais){ 
        this.pais = pais;
    }
} 
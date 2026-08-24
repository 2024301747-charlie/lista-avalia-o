package avaliacao.formula;
public class Equipe{
    private int ano;
    private String nome;
    private Patrocinador[] Patrocinadores; 

    public Equipe(String nome, int ano, Patrocinador[] Patrocinadores){
        this.nome = nome;
        this.ano = ano;
        this.Patrocinadores = Patrocinadores;
    }

    public int getano(){ 
        return ano;
    }
    public void setano(int ano){
        this.ano = ano;
    }

    public String getnome(){ 
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }

    public Patrocinador[] getPatrocinadores(){
        return Patrocinadores;
    }

    public void setPatrocinadores(Patrocinador[] Patrocinadores){
        this.Patrocinadores = Patrocinadores;
    }
}
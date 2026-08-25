import java.util.Scanner;
public class Estudante{
    private String nome;
    private double[] notas;
    private double media, menor;

    public Estudante(String nome){
        this.nome=nome;
        this.notas=new double[5];
        this.media=0;
        this.menor=0;
    }

    public void insereNotas(){
        Scanner notinhas = new Scanner(System.in);
        for(int i=0;i<5;i++){
        System.out.print("\nInsira as notas:");
        notas[i] = Double.parseDouble(notinhas.nextLine());
        }
    }

    public double calc(){
        double soma=0.0; 
        for(int i=0;i<5; i++){
           soma += notas[i];
        }
        media = soma/5;
        return media;
    }

    public double calc(Integer[] pesos){
        double soma=0.0;    
        int pesos=0;
        for (int i=0; i<pesos.size();i++){
            soma += notas.get(i) * pesos[i];
            pesos += pesos[i];
        }

        return soma/pesos;
    }

    public double menorNota(){
        for(int i=0;i<5; i++){
            if(i==0 || menor<notas[i]){
                menor=notas[i];
            }
        }
        return menor;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public double[] getNotas(){
        return notas;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getNome(){
        return nome;
    }
    public void setMedia(double media){
        this.media = media;
    }

    public double getMedia(){
        return media;
    }
    public void setMenor(double menor){
        this.menor = menor;
    }

    public double getMenor(){
        return menor;
    }
}

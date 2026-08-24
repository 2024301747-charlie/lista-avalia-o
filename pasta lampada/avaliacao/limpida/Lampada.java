package avaliacao.limpida;
public class Lampada{//criando o construct do código. nosso molde para varias outras lampadas no testelampada
    private boolean ligado; // variaveis descrevendo a lampada
    private float poten;

    Lampada(boolean estado, float luz){//descrevendo valores que dariamos pra lampada. ex.:se temos um gato(estado) é pq ele é um animal(ligado)
        ligado = estado;
        poten = luz;
    }
    Lampada(){// a lampada começa apagada
        ligado = false;
    }

    public void interruptor(){// lampada sempre vai apagar e acender
        ligado = !ligado;

        exibirEstado();
    }
    public void exibirEstado(){//mostrar como que ta a lampada depois do interruptor
        if(ligado==true) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        } 
    }
    public float getPoten(){// confere qual a potencia
        return poten;
    }
    public void setPoten(float val){//ajusta a potencia para ser entre 1 e 1000
        if (val >= 1 && val <= 1000) {
        poten = val;
        } else {
            poten = -1;
        }
    }
 }
package avaliacao.limpida;
public class LampadaTeste {//nossa classe para testar o molde lampada de fazer lampadas
    public static void main(String[] args) {//executando o codigo
        Lampada lampada = new Lampada(false, 60.0f);// criando uma nova lampada com seus atributos
        Lampada padrao = new Lampada();
        
        lampada.exibirEstado();//testando se exibir estado ta funcionando
        lampada.interruptor();//teste do iterruptor pra ligar
        lampada.interruptor();// desligar de novo
        padrao.exibirEstado();//testando se exibir estado ta funcionando
        padrao.interruptor();//teste do iterruptor pra ligar
        padrao.interruptor();// desligar de novo
        
        System.out.println(lampada.getPoten());//ver se chega os 60 indicados
        
        lampada.setPoten(1500.0f);
        System.out.println(lampada.getPoten());//ver como reage a um valor invalido
        
        lampada.setPoten(120.0f);
        System.out.println(lampada.getPoten());//testar valor valido pra ver se altera
    }
}
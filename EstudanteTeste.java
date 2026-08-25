import java.util.ArrayList;
import java.util.Scanner;
public class EstudanteTeste{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int option;
        
        ArrayList<String> aprovados = new ArrayList<>();

        System.out.print("\nQuantos estudantes são na turma? ");
        int quant = leitor.nextInt();
        leitor.nextLine();

        Estudante[] turma = new Estudante[quant];
        for(int i=0; i<quant;i++){
        System.out.print("\nNome do estudante "+(i+1)+": ");
        String nome = leitor.nextLine();

        }
        do{
            System.out.print("\nVoce gostaria de media simples(1) ou media ponderada(2)? ");
            option = Integer.parseInt(leitor.nextLine());
            switch(option){ 
                case 1:
                    for (int i = 0; i < quant; i++) {
                            turma[i].insereNotas();
                            if (turma[i].calc()>=6.0) {
                                aprovados.add(turma[i].getNome());   
                            } 
                        }
                        break;
                case 2:
                    Integer[] pesos = new Integer[5];
                    for(int i=0;i<5;i++){
                        System.out.print("\nInsira as notas:");
                        pesos[i] = Integer.parseInt(leitor.nextLine());
                    }
                    for(int i=0;i<quant;i++){
                        if (turma[i].calc(pesos)>=6.0) {
                                aprovados.add(turma[i].getNome());   
                        } 
                    }
                    break;
                default:
                    System.out.print("\nNUMERO INVALIDO");
                    option=3;
                    break;
            }

        }while(option==3);

        if(!aprovados.isEmpty()){
            System.out.println("\n\tLISTA DE APROVADOS ("+aprovados.size()+")\t");
            for (String nomeAprovado : aprovados) {
                System.out.println("\t "+nomeAprovado);
            }

           
        }
        else {
            System.out.println("\nNenhum estudante obteve média superior a 6.0.");
        }
         leitor.close();
    }
}

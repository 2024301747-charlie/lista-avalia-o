import java.util.Scanner;
import java.util.ArrayList;
public class EstudanteTeste{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ArrayList<String> aprovados = new ArrayList<>();

        System.out.print("\nQuantos estudantes são na turma? ");
        int quant = leitor.nextInt();
        leitor.nextLine();

        for (int i = 0; i < quant; i++) {
            System.out.print("\nNome do estudante "+(i+1)+": ");
            String nome = leitor.nextLine();

            Estudante estudante = new Estudante(nome);
            estudante.insereNotas();
            if (estudante.calc()>=6.0) {
                aprovados.add(estudante.getNome());   
            } 
        }

        if(!aprovados.isEmpty()){
            System.out.println("\n\tLISTA DE APROVADOS ("+aprovados.size()+")\t");
            for (String nomeAprovado : aprovados) {
                System.out.println("\t "+nomeAprovado);
            }

            leitor.close();
        }
        else {
            System.out.println("\nNenhum estudante obteve média superior a 6.0.");
        }
    }
}

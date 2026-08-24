    import java.util.Scanner;
public class EstudanteTeste{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nQuantos estudantes você quer cadastrar?");
        int quant = leitor.nextInt();
        leitor.nextLine();

        Estudante[] turma = new Estudante[quant];

        for (int i = 0; i < turma.length; i++) {
            System.out.print("\nDigite o nome do estudante " + (i + 1) + ": ");
            String nomeDigitado = leitor.nextLine();

            turma[i] = new Estudante(nomeDigitado);
        }
    }
}

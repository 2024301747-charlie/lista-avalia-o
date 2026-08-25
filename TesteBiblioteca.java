import java.util.ArrayList;
import java.util.Scanner;

public class TesteBiblioteca {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Acervo> acervo = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1 - Inserir livro");
            System.out.println("2 - Inserir periódico");
            System.out.println("3 - Ver itens disponíveis");
            System.out.println("4 - Alterar disponibilidade de livro");
            System.out.println("5 - Listar acervo");
            System.out.println("0 - Sair");

            option=lerInteiro(teclado, "Escolha uma opção: ");

            switch (option) {
                case 1 -> {

                    String titulo = lerTexto(teclado,"Digite o título do livro: ");

                    Livro livro = new Livro(titulo);

                    acervo.add(livro);

                    System.out.println(
                        "Livro cadastrado com sucesso!"
                    );
                }
                case 2 -> {

                    String titulo = lerTexto(teclado,"Digite o título do periódico: ");

                    int volume = lerVolume(teclado);

                    Periodico periodico =
                        new Periodico(titulo, volume);

                    acervo.add(periodico);

                    System.out.println("Periódico cadastrado com sucesso!");
                }
                case 3 -> {

                    System.out.println("\n\t LIVROS DISPONÍVEIS\t");

                    boolean encontrou = false;

                    for (Acervo item : acervo) {
                        if (item instanceof Livro) {
                            Livro livro = (Livro) item;
                            if (livro.isDisponivel()) {
                                System.out.println("Livro: "+ livro.getTitulo());
                                encontrou = true;
                            }
                        }
                    }

                    if (!encontrou) {
                        System.out.println( "Nenhum livro disponível.");
                    }
                }

                case 4 -> {
                    alterarDisponibilidade(acervo,teclado);
                }
                    
                case 5 -> {
                    listarAcervo(acervo);
                }

                case 0 -> {
                    System.out.println("\nEncerrando o programa...");
                }

                default -> {

                    System.out.println("Opção inválida!");
                }
            }

        } while (opcao != 0);

        teclado.close();
    }

    private static int lerInteiro(
            Scanner teclado,
            String mensagem) {

        while (true) {

            System.out.print(mensagem);

            String entrada = teclado.nextLine();

            try {

                return Integer.parseInt(entrada);

            } catch (NumberFormatException e) {

                System.out.println("Digite apenas um número inteiro válido.");
            }
        }
    }

    private static String lerTexto(
            Scanner teclado,
            String mensagem) {

        while (true) {

            System.out.print(mensagem);

            String texto = teclado.nextLine().trim();

            if (texto.isEmpty()) {
                System.out.println("O campo não pode ficar vazio." );
            } 
            else if (!texto.matches( ".*[a-zA-ZÀ-ÿ].*")) {
                System.out.println("Digite um título válido, contendo letras.");
            } 
            else {
                return texto;
            }
        }
    }

    private static int lerVolume(
            Scanner teclado) {

        while (true) {

            int volume = lerInteiro(teclado, "Digite o número do volume: ");

            if (volume <= 0) {
                System.out.println( "O volume deve ser maior que zero.");

            } 
            else {
                return volume;
            }
        }
    }

    private static void alterarDisponibilidade(
            ArrayList<Acervo> acervo,
            Scanner teclado) {

        ArrayList<Livro> livros =
            new ArrayList<>();

        for (Acervo item : acervo) {
            if (item instanceof Livro) {
                Livro livro = (Livro) item;
                livros.add(livro);
            }
        }
        if (livros.isEmpty()) {
            System.out.println("\nNão existem livros cadastrados.");
            return;
        }

        System.out.println("\n\t LIVROS\t");

        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            String disponibilidade;
            if (livro.isDisponivel()) {
                disponibilidade = "Disponível";
            } 
            else {
                disponibilidade = "Indisponível";
            }
            System.out.println((i + 1)+ " - "+ livro.getTitulo()+ " | "+ disponibilidade);
        }

        int numero = lerInteiro( teclado,"\nDigite o número do livro: " );

        if (numero < 1 ||numero > livros.size()) {
            System.out.println("Número de livro inválido.");
            return;
        }

        Livro livroSelecionado = livros.get(numero - 1);

        System.out.println( "\nLivro selecionado: " + livroSelecionado.getTitulo() );

        System.out.println("\n1 - Disponibilizar");
        System.out.println("2 - Indisponibilizar");

        int opcao = lerInteiro( teclado, "Escolha uma opção: " );

        if (opcao == 1) {
            livroSelecionado.devolver();
            System.out.println("Livro agora está disponível." );
        } 
        else if (opcao == 2) {
            livroSelecionado.emprestar();
            System.out.println("Livro agora está indisponível.");
        } 
        else {
            System.out.println("Opção inválida.");
        }
    }
    private static void listarAcervo(
            ArrayList<Acervo> acervo) {

        System.out.println("\n\t ACERVO\t");

        if (acervo.isEmpty()) {
            System.out.println("O acervo está vazio.");
            return;
        }
        int numeroLivro = 1;

        for (Acervo item : acervo) {
            if (item instanceof Livro) {
                Livro livro = (Livro) item;
                System.out.println(numeroLivro+ " - Livro: "+ livro.getTitulo()+ " | Disponível: "+ (livro.isDisponivel()? "Sim": "Não"));
                numeroLivro++;
            } 
            else if(item instanceof Periodico){

                Periodico periodico =
                    (Periodico) item;

                System.out.println( "Periódico: "+ periodico.getTitulo() + " | Volume: "+ periodico.getNumeroVolume());
            }
        }
    }
}

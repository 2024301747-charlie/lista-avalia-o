package avaliacao.formula;
public class Teste {

    public static void main(String[] args) {

        Piloto pilotoPudim = new Piloto(25, "Pudim Verstappen", "Holanda", 8);
        Patrocinador[] patrocPudim = { new Patrocinador("Leite Moça", 1000.0f) };
        Equipe equipePudim = new Equipe("Equipe Pudim", 2020, patrocPudim);

        Piloto pilotoBiscoito = new Piloto(30, "Biscoito Norris", "Inglaterra", 5);
        Patrocinador[] patrocBiscoito = { new Patrocinador("Bauducco", 500.0f) };
        Equipe equipeBiscoito = new Equipe("Equipe Biscoito", 2015, patrocBiscoito);

        Piloto pilotoGelatina = new Piloto(22, "Gelatina Leclerc", "Mônaco", 3);
        Patrocinador[] patrocGelatina = { new Patrocinador("Royal", 200.0f) };
        Equipe equipeGelatina = new Equipe("Equipe Gelatina", 2022, patrocGelatina);

        Carro carro2 = new Carro(10, 10, equipePudim, pilotoPudim);
        Carro carro3 = new Carro(2, 3, equipeBiscoito, pilotoBiscoito);
        Carro carro4 = new Carro(7, 7, equipeGelatina, pilotoGelatina);

        int numeroCarro2  = carro2.getNumero();

        carro2.setNumero(11);

        System.out.println("O número antigo era " + numeroCarro2 + ", mas agora o carro do " + carro2.getPiloto().getnome() + " é o numero " + carro2.getNumero());
    }
}
import ru.ifmo.se.pokemon.*;

public class Main {

    int x = 12;
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon tornadus = new Tornadus("Tornadus", 100);
        Pokemon altaria = new Altaria("Altaria", 40);
        Pokemon kirlia = new Kirlia("Kirlia", 99);

        Ralts ralts = new Ralts("Ralts", 99);
        Swablu swablu = new Swablu("Swablu", 40);
        Gallade gallade = new Gallade("Gallade", 99);

        battle.addAlly(tornadus);
        battle.addAlly(altaria);
        battle.addAlly(kirlia);
        battle.addFoe(swablu);
        battle.addFoe(ralts);
        battle.addFoe(gallade);

        battle.go();
    }
}
import ru.ifmo.se.pokemon.*;
public class Main {

    public static void main(String[] args) {
        System.out.println(Stat.SPECIAL_ATTACK);
        Battle battle = new Battle();
        Tornadus tornadus = new Tornadus("Tornadus", 1);
        Altaria altaria = new Altaria("Altaria", 1);

        Swablu swablu = new Swablu("Swablu", 1);

        battle.addAlly(tornadus);
        battle.addAlly(altaria);
        battle.addFoe(swablu);

        battle.go();
    }

}
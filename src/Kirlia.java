import ru.ifmo.se.pokemon.*;

public class Kirlia extends Ralts {

    private static double hp = 38;
    private static double attack = 35;
    private static double defense = 35;
    private static double specialAttack = 65;
    private static double specialDefence = 55;
    private static double speed = 50;

    public Kirlia(String name, int level) {
        super(name, level);
        setStats(hp, attack, defense, specialAttack, specialDefence, speed);
        addMove(new DrainingKiss(Type.FAIRY, 50, 1));
    }
}

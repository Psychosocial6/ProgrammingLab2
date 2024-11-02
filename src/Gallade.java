import ru.ifmo.se.pokemon.*;

public class Gallade extends Kirlia {

    private static double hp = 68;
    private static double attack = 125;
    private static double defense = 65;
    private static double specialAttack = 65;
    private static double specialDefence = 115;
    private static double speed = 80;

    public Gallade(String name, int level) {
        super(name, level);
        setStats(hp, attack, defense, specialAttack, specialDefence, speed);
        addMove(new LeafBlade(Type.GRASS, 90, 1));
    }
}

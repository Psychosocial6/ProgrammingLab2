import ru.ifmo.se.pokemon.*;

public class Gallade extends Kirlia {

    private double hp = 68;
    private double attack = 125;
    private double defense = 65;
    private double specialAttack = 65;
    private double specialDefence = 115;
    private double speed = 80;

    public Gallade(String name, int level) {
        super(name, level);
        setStats(hp, attack, defense, specialAttack, specialDefence, speed);
        addMove(new LeafBlade(Type.GRASS, 90, 1));
    }
}

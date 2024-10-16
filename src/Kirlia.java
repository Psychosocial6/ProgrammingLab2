import ru.ifmo.se.pokemon.*;

public class Kirlia extends Ralts {

    private double hp = 38;
    private double attack = 35;
    private double defense = 35;
    private double specialAttack = 65;
    private double specialDefence = 55;
    private double speed = 50;

    public Kirlia(String name, int level) {
        super(name, level);
        setStats(hp, attack, defense, specialAttack, specialDefence, speed);
        addMove(new DrainingKiss(Type.FAIRY, 50, 1));
    }
}

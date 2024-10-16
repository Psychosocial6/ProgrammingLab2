import ru.ifmo.se.pokemon.*;

public class Altaria extends Swablu {

    private double hp = 75;
    private double attack = 70;
    private double defense = 90;
    private double specialAttack = 70;
    private double specialDefence = 105;
    private double speed = 80;

    public Altaria(String name, int level) {
        super(name, level);
        setStats(hp, attack, defense, specialAttack, specialDefence, speed);
        addMove(new Flamethrower(Type.FIRE, 90, 1));
    }
}

import ru.ifmo.se.pokemon.*;

public class Altaria extends Swablu {

    private static double hp = 75;
    private static double attack = 70;
    private static double defense = 90;
    private static double specialAttack = 70;
    private static double specialDefence = 105;
    private static double speed = 80;

    public Altaria(String name, int level) {
        super(name, level);
        setStats(hp, attack, defense, specialAttack, specialDefence, speed);
        addMove(new Flamethrower(Type.FIRE, 90, 1));
    }
}

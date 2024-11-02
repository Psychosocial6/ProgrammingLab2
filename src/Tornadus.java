import ru.ifmo.se.pokemon.*;

public class Tornadus extends Pokemon {

    private static double hp = 79;
    private static double attack = 115;
    private static double defense = 70;
    private static double specialAttack = 125;
    private static double specialDefence = 80;
    private static double speed = 111;

    public Tornadus(String name, int level) {
        super(name, level);
        setStats(hp, attack, defense, specialAttack, specialDefence, speed);
        addMove(new Extrasensory(Type.PSYCHIC, 80, 1.0D));
        addMove(new SludgeWave(Type.POISON, 95, 1.0D));
        addMove(new Confide(Type.NORMAL, 0, 0));
        addMove(new Swagger(Type.NORMAL, 0, 0.85D));
    }
}

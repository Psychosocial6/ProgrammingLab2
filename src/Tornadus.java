import ru.ifmo.se.pokemon.*;

public class Tornadus extends Pokemon {

    private double hp = 79;
    private double attack = 115;
    private double defense = 70;
    private double specialAttack = 125;
    private double specialDefence = 80;
    private double speed = 111;

    public Tornadus(String name, int level) {
        super(name, level);
        setStats(hp, attack, defense, specialAttack, specialDefence, speed);
        addMove(new Extrasensory(Type.PSYCHIC, 80, 1.0D));
        addMove(new SludgeWave(Type.POISON, 95, 1.0D));
        addMove(new Confide(Type.NORMAL, 0, 0));
        addMove(new Swagger(Type.NORMAL, 0, 0.85D));
    }
}

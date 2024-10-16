import ru.ifmo.se.pokemon.*;

public class Ralts extends Pokemon {

    private double hp = 28;
    private double attack = 25;
    private double defense = 25;
    private double specialAttack = 45;
    private double specialDefence = 35;
    private double speed = 40;

    public Ralts(String name, int level) {
        super(name, level);
        setStats(hp, attack, defense, specialAttack, specialDefence, speed);
        addMove(new CalmMind(Type.PSYCHIC, 0, 1.0D));
        addMove(new DazzlingGleam(Type.FAIRY, 80, 1));
    }
}

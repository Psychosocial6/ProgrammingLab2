import ru.ifmo.se.pokemon.*;

public class Swablu extends Pokemon {

    private double hp = 45;
    private double attack = 40;
    private double defense = 60;
    private double specialAttack = 40;
    private double specialDefence = 75;
    private double speed = 50;

    public Swablu(String name, int level) {
        super(name, level);
        setStats(hp, attack, defense, specialAttack, specialDefence, speed);
        addMove(new DoubleTeam(Type.NORMAL, 0, 1.0D));
        addMove(new AerialAce(Type.FLYING, 60, 0));
        addMove(new Sing(Type.NORMAL, 0, 0.55D));
    }
}

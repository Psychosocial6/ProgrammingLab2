import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swablu extends Pokemon {

    public Swablu(String name, int level) {
        super(name, level);
        setStats(45, 40, 60, 40, 75, 50);
        addMove(new DoubleTeam(Type.NORMAL, 0, 0));
        addMove(new AerialAce(Type.FLYING, 60, 0));
        addMove(new Sing(Type.NORMAL, 0, 0.55D));
    }

}

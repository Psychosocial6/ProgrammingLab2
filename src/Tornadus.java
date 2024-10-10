import ru.ifmo.se.pokemon.*;

public class Tornadus extends Pokemon {

    public Tornadus(String name, int level) {
        super(name, level);
        setStats(79, 115, 70, 125, 80, 111);
        addMove(new Extrasensory(Type.PSYCHIC, 80, 1.0D));
        addMove(new SludgeWave(Type.POISON, 95, 1.0D));
        addMove(new Confide(Type.NORMAL, 0, 0));
        addMove(new Swagger(Type.NORMAL, 0, 0.85D));
    }

}

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {

    public DoubleTeam(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, 1);
        System.out.println("Повышение evasion на 1");
    }

    @Override
    protected String describe() {
        return "Использует атаку Double Team";
    }
}

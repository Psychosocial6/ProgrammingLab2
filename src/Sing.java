import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Sing extends StatusMove {

    public Sing(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
        System.out.println("Применен эффект sleep");
    }

    @Override
    protected String describe() {
        return "Использует атаку Sing";
    }
}

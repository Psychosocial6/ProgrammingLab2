import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class Flamethrower extends SpecialMove {

    public Flamethrower(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Random random = new Random();
        int percentage = random.nextInt(1, 101);
        if (percentage <= 10) {
            Effect.burn(pokemon);
            System.out.println("Применен эффект burn");
        }
    }

    @Override
    protected String describe() {
        return "Использует атаку Flamethrower";
    }
}

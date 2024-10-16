import ru.ifmo.se.pokemon.*;
import java.util.Random;

public class Sing extends StatusMove {

    public Sing(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Random random = new Random();
        int moves = random.nextInt(2, 5);
        Effect effect = new Effect().chance(1).turns(moves);
        effect.sleep(pokemon);
        //System.out.println("Применен эффект sleep");
    }

    @Override
    protected String describe() {
        return "Использует атаку Sing";
    }
}

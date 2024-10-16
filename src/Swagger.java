import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class Swagger extends StatusMove {

    public Swagger(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 2);
        Random random = new Random();
        int turns = random.nextInt(2, 6);
        Effect effect = new Effect().turns(turns);
        effect.confuse(pokemon);
        //System.out.println("Атака увеличена на 2, применен эффект confuse");
    }

    @Override
    protected String describe() {
        return "Использует атаку Swagger";
    }
}

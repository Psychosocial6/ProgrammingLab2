import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {

    public CalmMind(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
        //System.out.println("Повышение special attack и special defence на 1");
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe() {
        return "Использует атаку Calm Mind";
    }
}

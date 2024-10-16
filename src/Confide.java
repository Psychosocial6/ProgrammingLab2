import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {;
        pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
        //System.out.println("Специальная атака уменьшена на 1");
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe() {
        return "Использует атаку Confide";
    }
}

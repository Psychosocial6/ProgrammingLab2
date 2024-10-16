import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {

    public AerialAce(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe() {
        return "Использует атаку Aerial Ace";
    }
}

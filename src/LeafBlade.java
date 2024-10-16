import ru.ifmo.se.pokemon.*;
import java.util.Random;

public class LeafBlade extends PhysicalMove {

    public LeafBlade(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        Random random = new Random();
        double percentage = random.nextDouble(1, 101);
        if (percentage <= 12.5D) {
            return 2;
        }
        return 1;
    }

    @Override
    protected String describe() {
        return "Использует атаку Leaf Blade";
    }
}

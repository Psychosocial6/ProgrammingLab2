import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove {

    public DazzlingGleam(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected String describe() {
        return "Использует атаку Dazzling Gleam";
    }
}

import ru.ifmo.se.pokemon.*;

public class DrainingKiss extends SpecialMove {

    public DrainingKiss(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        double damage = pokemon.getStat(Stat.SPECIAL_ATTACK) / pokemon1.getStat(Stat.SPECIAL_DEFENSE);
        double hp = pokemon.getStat(Stat.HP);
        double attack = pokemon.getStat(Stat.ATTACK);
        double defense = pokemon.getStat(Stat.DEFENSE);
        double specialAttack = pokemon.getStat(Stat.SPECIAL_ATTACK);
        double specialDefence = pokemon.getStat(Stat.DEFENSE);
        double speed = pokemon.getStat(Stat.SPEED);
        pokemon.setStats(hp + 0.75D * damage, attack, defense, specialAttack, specialDefence, speed);
        //System.out.println("Исцеляет " + 0.75D * damage + " hp");
        return 0.25D * damage;
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        double damage = pokemon.getStat(Stat.SPECIAL_ATTACK) / pokemon1.getStat(Stat.SPECIAL_DEFENSE);
        double hp = pokemon.getStat(Stat.HP);
        double attack = pokemon.getStat(Stat.ATTACK);
        double defense = pokemon.getStat(Stat.DEFENSE);
        double specialAttack = pokemon.getStat(Stat.SPECIAL_ATTACK);
        double specialDefence = pokemon.getStat(Stat.DEFENSE);
        double speed = pokemon.getStat(Stat.SPEED);
        pokemon.setStats(hp + 0.75D * damage, attack, defense, specialAttack, specialDefence, speed);
        //System.out.println("Исцеляет " + 0.75D * damage + " hp");
        return 0.25D * damage;
    }

    @Override
    protected String describe() {
        return "Использует атаку Draining Kiss";
    }
}

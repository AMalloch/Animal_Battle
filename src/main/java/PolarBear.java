public class PolarBear extends Mammal implements IRegenerate{
    public PolarBear(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public int regenerate(int amount) {
        return 0;
    }
}

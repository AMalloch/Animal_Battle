public class Tiger extends Mammal implements IRegenerate {
    public Tiger(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public int regenerate(int amount) {
        return 0;
    }
}

public class Tiger extends Mammal implements IRegenerate {
    public Tiger(String name, int health, int attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public int regenerate(Mammal mammal, int amount) {
        return 0;
    }

    // regen is blank because I was wanting to make a method of regen that could only be called
    // on the tiger and the polar bear but not the buffalo, ally said it would be inher chain hell lol
}

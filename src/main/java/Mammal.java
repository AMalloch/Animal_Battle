public abstract class Mammal {
    private String name;
    private int health;
    private AttackDamage attackDamage;

    public Mammal(String name, int health, AttackDamage attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public AttackDamage getAttackDamage() {
        return attackDamage;
    }

}

// possible properties health, name, attack damage or type ?
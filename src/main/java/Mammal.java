public abstract class Mammal {
    private String name;
    private int health;
    private int attackDamage;

    public Mammal(String name, int health, int attackDamage) {
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

    public int getAttackDamage() {
        return attackDamage;
    }

    public void canAttack(Mammal mammal){
        mammal.health -= this.attackDamage;
    }

}

// possible properties health, name, attack damage or type ?
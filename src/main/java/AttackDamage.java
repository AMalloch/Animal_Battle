public enum AttackDamage {
    POLARBEAR(25),
    TIGER(40),
    BUFFALO(20);

    private int attackDamage;
    private String type;

    AttackDamage(int attackDamage){
        this.attackDamage = attackDamage;
        this.type = type;
    }

    public int getAttackDamage(){
        return this.attackDamage;
    }
}

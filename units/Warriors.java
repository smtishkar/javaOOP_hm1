package units;

public abstract class Warriors extends BaseHero{

    protected int stamina, maxStamina, damageMin;
    protected String name;


    public Warriors(int hp, int maxHp, int atack, int def, int damageMax, int speed, 
    int stamina, int maxStamina, String name, int posX, int posY, int damageMin) {
        super(hp, maxHp, atack, def, damageMax, speed, posX, posY);
        this.stamina = stamina;
        this.maxStamina = maxStamina;
        this.name = name;
        this.damageMin = damageMin;
    }

}

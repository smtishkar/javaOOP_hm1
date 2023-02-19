package units;

public abstract class Warriors extends BaseHero{

    protected int stamina, maxStamina;
    protected String name;


    public Warriors(int hp, int maxHp, int atack, int def, int dam, int speed, int stamina, int maxStamina, String name) {
        super(hp, maxHp, atack, def, dam, speed);
        this.stamina = stamina;
        this.maxStamina = maxStamina;
        this.name = name;
    }



    
    // public String getInfo() {
    //     return String.format("%s stamina: %d", super.getInfo(), this.stamina);
    // }

    /**
     * Метод описывает снижение запаса сил после удара;
     * @param stamina
     */
    // public void stamina(int stamina) {
    
        // }

}

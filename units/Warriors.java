package units;

public abstract class Warriors extends BaseHero{

    private int stamina, maxStamina;


    public Warriors(int hp, int maxHp, int atack, int def, int stamina2, int maxStamina2) {
        super(hp, maxHp, atack, def);
        this.stamina = stamina;
        this.maxStamina = maxStamina;
        //TODO Auto-generated constructor stub
    }


    public String getInfo() {
        return String.format("%s stamina: %d", super.getInfo(), this.stamina);
    }

    /**
     * Метод описывает снижение запаса сил после удара;
     * @param stamina
     */
    // public void stamina(int stamina) {
    
        // }

}

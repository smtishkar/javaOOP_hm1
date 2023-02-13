package units;

public class Warriors extends BaseHero{

    private int stamina;


    public Warriors(String name, int hp, int atack, int stamina) {
        super(name, hp, atack);
        this.stamina = stamina;
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

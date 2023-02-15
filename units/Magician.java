package units;

public abstract class Magician extends BaseHero{

    protected int mp, maxMp;
    protected String name;

    public Magician(int hp, int maxHp, int atack, int def, int mp, int maxMp, String name) {
        super(hp, maxHp, atack, def);
        this.mp = mp;
        this.maxMp = maxMp;
        this.name = name;
    }




    
    // public String getInfo() {
    //     return String.format("%s mp: %d", super.getInfo(), this.mp);
    // }

    /**
    * Метод описывает логику снижение манны после удара
    * @param mp
    */
    // public void mpReduction(int mp) {
    
    // }



}

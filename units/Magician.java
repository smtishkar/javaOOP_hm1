package units;

public abstract class Magician extends BaseHero{

    private int mp, maxMp;

    public Magician(int hp, int maxHp, int atack, int def, int mp2, int maxMp2) {
        super(hp, maxHp, atack, def);
        this.mp = mp;
        this.maxMp = maxMp;
    }

    public String getInfo() {
        return String.format("%s mp: %d", super.getInfo(), this.mp);
    }

    /**
    * Метод описывает логику снижение манны после удара
    * @param mp
    */
    // public void mpReduction(int mp) {
    
    // }



}

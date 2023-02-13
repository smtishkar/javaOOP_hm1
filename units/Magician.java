package units;

public class Magician extends BaseHero{

    private int mp;

    public Magician(String name, int hp, int atack, int mp) {
        super(name, hp, atack);
        this.mp = mp;
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

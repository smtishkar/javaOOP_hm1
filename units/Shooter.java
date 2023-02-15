package units;

public abstract class Shooter extends BaseHero{

    protected int arrows, maxArrows;
    protected String name;

    public Shooter(int hp, int maxHp, int atack, int def, int arrows, int maxArrows, String name) {
        super(hp, maxHp, atack, def);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
        this.name = name;
    }


    // public String getInfo() {
    //     return String.format("%s ammocount: %d", super.getInfo(), this.arrows);
    // }


    /**
    * Метод описывает логику снижение количества стрел после выстрела;
    * @param ammocount
    */
    // public void ammocountReduction(int ammocount) {
    
    // }
    

}

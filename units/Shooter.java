package units;

public abstract class Shooter extends BaseHero{

    private int arrows, maxArrows;

    public Shooter(int hp, int maxHp, int atack, int def, int arrows2, int maxArrows2) {
        super(hp, maxHp, atack, def);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
        //TODO Auto-generated constructor stub
    }


    public String getInfo() {
        return String.format("%s ammocount: %d", super.getInfo(), this.arrows);
    }


    /**
    * Метод описывает логику снижение количества стрел после выстрела;
    * @param ammocount
    */
    // public void ammocountReduction(int ammocount) {
    
    // }
    

}

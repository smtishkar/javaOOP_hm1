package units;

public abstract class Shooter extends BaseHero{

    protected int arrows, maxArrows;
    protected String name;

    public Shooter(int hp, int maxHp, int atack, int def, int dam, int speed, 
    int arrows, int maxArrows, String name, int posX, int posY) {
        super(hp, maxHp, atack, def, dam, speed, posX, posY);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
        this.name = name;
    }
   
}

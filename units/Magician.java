package units;

public abstract class Magician extends BaseHero{

    protected int mp, maxMp;
    protected String name;

    public Magician(int hp, int maxHp, int atack, int def, int dam, int speed, int mp,
     int maxMp, String name, int posX, int posY) {
        super(hp, maxHp, atack, def, dam, speed, posX, posY );
        this.mp = mp;
        this.maxMp = maxMp;
        this.name = name;
    }

}

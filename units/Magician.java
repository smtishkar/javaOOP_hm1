package units;

public abstract class Magician extends BaseHero{

    protected int mp, maxMp;
    protected String name;

    public Magician(int hp, int maxHp, int atack, int def, int dam, int speed, int mp, int maxMp, String name) {
        super(hp, maxHp, atack, def, dam, speed);
        this.mp = mp;
        this.maxMp = maxMp;
        this.name = name;
    }

}

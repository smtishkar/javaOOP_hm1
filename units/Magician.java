package units;

public class Magician extends BaseHero{

    private int mp;

    public Magician(String name, int hp, int atack, int mp) {
        super(name, hp, atack);
        this.mp = mp;
        // super(String.format("Это маг №%d"),
        //     Magician.r.nextInt(100, 59));
        //     this.mp = Magician.r.nextInt(555);
        //TODO Auto-generated constructor stub
    }
    // public String getInfo() {
    //     return String.format("Name: %s  Hp: %d Atack: %d mp:%d",
    //             this.name, this.hp, this.atack, this.mp, this.getClass().getSimpleName());
    // }
    public String getInfo() {
        return String.format("%s mp: %d", super.getInfo(), this.mp);
    }
}

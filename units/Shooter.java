package units;

public class Shooter extends BaseHero{

    private int ammocount;

    public Shooter(String name, int hp, int atack, int ammocount) {
        super(name, hp, atack);
        this.ammocount = ammocount;
        //TODO Auto-generated constructor stub
    }
    // public String getInfo() {
    //     return String.format("Name: %s  Hp: %d Atack: %d ammocount:%d",
    //             this.name, this.hp, this.atack, this.ammocount, this.getClass().getSimpleName());
    // }

    public String getInfo() {
        return String.format("%s ammocount: %d", super.getInfo(), this.ammocount);
    }

}

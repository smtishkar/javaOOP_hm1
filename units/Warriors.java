package units;

public class Warriors extends BaseHero{

    private int stamina;


    public Warriors(String name, int hp, int atack, int stamina) {
        super(name, hp, atack);
        this.stamina = stamina;
        //TODO Auto-generated constructor stub
    }
    
    // public String getInfo() {
    //     return String.format("Name: %s  Hp: %d Atack: %d Stamina:%d",
    //             this.name, this.hp, this.atack, this.stamina, this.getClass().getSimpleName());
    // }

    public String getInfo() {
        return String.format("%s stamina: %d", super.getInfo(), this.stamina);
    }

}

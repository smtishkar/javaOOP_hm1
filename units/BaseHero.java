package units;
public abstract class BaseHero {
    protected String name;              
    // protected int heroID;
    protected int hp;
    protected int atack;


    public BaseHero(String name, int hp, int atack){
        this.name = name;
        this.hp = hp;
        this.atack = atack;
    }

    public String getInfo() {
        return String.format("Name: %s; Type: %s;  Hp: %d;  Atack: %d; ",
        this.name, this.getClass().getSimpleName(), this.hp, this.atack);
    }


}

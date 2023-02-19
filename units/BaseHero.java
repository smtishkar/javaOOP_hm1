package units;
public abstract class BaseHero implements InGameInterface {
            
    protected int hp, atack, def, maxHp, dam, speed;
  


    public BaseHero(int hp, int maxHp, int atack, int def, int dam, int speed){
        this.hp = hp;
        this.atack = atack;
        this.def = def;
        this.maxHp = maxHp;
        this.dam = dam;
        this.speed = speed;
    }

    // public String getInfo() {
    //     return String.format("Name: %s; Type: %s;  Hp: %d;  Atack: %d; ",
    //     this.getClass().getSimpleName(), this.hp, this.atack);
    // }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else {
            System.out.println("Персонаж умер");
        }
    }

    public void Attack(BaseHero target) {
        int damage = this.atack;
        target.GetDamage(damage);
    }


    @Override
    public void step() {
        
    }

    @Override
    public String getInfo(){return "null";}

}

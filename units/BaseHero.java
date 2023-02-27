package units;

import java.util.ArrayList;

public abstract class BaseHero implements InGameInterface {
            
    protected int hp, atack, def, maxHp, damageMax , speed;
    protected Vector2D coords;
    protected String state;

    protected BaseHero(int hp, int maxHp, int atack, int def, int damageMax, int speed, int posX, int posY){
        this.hp = hp;
        this.atack = atack;
        this.def = def;
        this.maxHp = maxHp;
        this.damageMax = damageMax;
        this.speed = speed;
        coords = new Vector2D(posX, posY);
        state = "Stand";

        
    }

    // public String getInfo() {
    //     return String.format("Name: %s; Type: %s;  Hp: %d;  Atack: %d; ",
    //     this.getClass().getSimpleName(), this.hp, this.atack);
    // }

    // public void GetDamage(int damage) {
    //     if (this.hp - damage > 0) {
    //         this.hp -= damage;
    //     } else {
    //         System.out.println("Персонаж умер");
    //     }
    // }

    // public void Attack(BaseHero target) {
    //     int damage = this.atack;
    //     target.GetDamage(damage);
    // }


    @Override
    public void step() {
        
    }

    @Override
    public String getInfo(){return "null";}

    
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {}

    public int findNearest(ArrayList<BaseHero> team){
        double min = 10;     //Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords)) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }

    protected void getDamage(float damage){
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }

    @Override
    public int getSpeed(){
        return speed;
    }
    @Override
    public int getAtack(){
        return atack;
    }

    @Override
    public int getHp(){
        return hp;
    }

}

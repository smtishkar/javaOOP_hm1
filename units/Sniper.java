package units;

public class Sniper extends Shooter{

    

    public Sniper(String name) {
        super(100, 150, 200, 300, 5, 10, name);

    // public Sniper(int hp, int maxHp, int atack, int def, int arrows, int maxArrows) {
    //     super(hp, maxHp, atack, def, arrows, maxArrows);

    }
    

    @Override
    public String getInfo(){
        // return super.toString();            //Будет возвращать строеку которая формируется в супер классе
        return "Снайпер " + name;
    }



}

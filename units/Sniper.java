package units;

public class Sniper extends Shooter{

    

    public Sniper(String name) {
        super(15, 15, 12, 10, 10, 9, 32, 32, name);

    // public Sniper(int hp, int maxHp, int atack, int def, int arrows, int maxArrows) {
    //     super(hp, maxHp, atack, def, arrows, maxArrows);

    }
    

    @Override
    public String getInfo(){
        // return super.toString();            //Будет возвращать строеку которая формируется в супер классе
        return "Снайпер " + name + "; "+ "Скорость " + speed + "; "+ "Атака " + atack;
    }

    @Override
    public int getSpeed(){
        return speed;
    }
    @Override
    public int getAtack(){
        return atack;
    }


}

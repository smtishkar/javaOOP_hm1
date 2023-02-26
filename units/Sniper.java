package units;

public class Sniper extends Shooter {

    public Sniper(String name, Vector2D coords) {
        super(15, 15, 12, 10, 10, 9, 32, 32, name, coords.posX, coords.posY);

    }

    @Override
    public String getInfo() {
        // return super.toString(); //Будет возвращать строеку которая формируется в
        // супер классе
        return "Снайпер " + name + "    |     Speed:" + speed + 
        "    |     Atack: " + atack + "    |     HP: " + hp + "    |     "
         + coords.posX  + "    "+   coords.posY; 
    
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getAtack() {
        return atack;
    }

    @Override
    public int getHp(){
        return hp;
    }
}

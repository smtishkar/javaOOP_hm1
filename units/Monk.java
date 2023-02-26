package units;

public class Monk extends Magician{

    public Monk(String name, Vector2D coords) {
        super(30, 30, 12, 7, -4, 5, 10, 10, name, coords.posX, coords.posY);
    }
    


    @Override
    public String getInfo(){
        return "Монах " + name + "    |     Speed:" + speed + 
        "    |     Atack: " + atack + "    |     HP: " + hp + "    |     "
         + coords.posX  + "    "+   coords.posY + "    |     MP:" + mp; 
    
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

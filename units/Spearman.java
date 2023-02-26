package units;

public class Spearman extends Warriors{

    public Spearman(String name, Vector2D coords) {
        super(10, 10, 4, 5, 3, 4, 100, 150, name, coords.posX, coords.posY, 1);
    }
    @Override
    public String getInfo(){           
        return "Копейщик " + name + "    |     Speed:" + speed + 
        "    |     Atack: " + atack + "    |     HP: " + hp + "    |     "
         + coords.posX  + "    "+   coords.posY; 
    
    }

    // @Override
    // public int getSpeed(){
    //     return speed;
    // }
    // @Override
    // public int getAtack(){
    //     return atack;
    // }

    // @Override
    // public int getHp(){
    //     return hp;
    // }
}

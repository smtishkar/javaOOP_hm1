package units;

public class Raider extends Warriors {

    public Raider(String name, Vector2D coords) {
        super(10, 10, 8, 3, 4, 6, 50, 150, name, coords.posX, coords.posY);
     }
 
     @Override
     public String getInfo(){         
         return "Разбойник " + name + "    |     Speed:" + speed + 
         "    |     Atack: " + atack + "    |     HP: " + hp + "    |     "
          + coords.posX  + "    "+   coords.posY; 
        
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

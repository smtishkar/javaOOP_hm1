package units;

public class Raider extends Warriors {

    public Raider(String name, Vector2D coords) {
        super(30, 30, 8, 3, 4, 6, 50, 150, name, coords.posX, coords.posY, 2);
     }
 
     @Override
     public String getInfo(){         

        return String.format("Разб: %7s | Sp: %2d | At: %2d | HP: %2d | XY  %2d -%2d | %3s |         ", name, speed, atack,hp, coords.posY, coords.posX, state);
       



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

package units;



public class Wizard extends Magician{

    public Wizard(String name, Vector2D coords) {
        super(30, 30, 17, 12, -5, 9, 10, 10, name, coords.posX, coords.posY);
    }
    
    @Override
    public String getInfo(){  
       
        // return "Волшебник: " + name + "    |     Speed:" +  speed + 
        // "    |     Atack: " + atack + "    |     HP: " + hp + "    |     "
        //  + coords.posX  + "    "+   coords.posY + "    |     MP:" + mp;
    
        return String.format("Волшебник: %11s |  Speed: %3d  |  Atack:  %3d  |  HP:  %3d  |  XY  %3d -%3d  |  MP:  %3d", name, speed, atack,hp, coords.posY, coords.posX, mp );

    
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

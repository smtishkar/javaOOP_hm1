package units;

public class Peasant extends Warriors {

    protected int ammo;

    public Peasant(String name, Vector2D coords) {
        super(1, 1, 1, 1, 1, 3, 50, 150, name, coords.posX, coords.posY,1 );
        this.ammo = 1;

        
    }

    @Override
    public String getInfo(){         
        return "Крестьянин " + name + "    |     Speed:" + speed + 
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

package units;

import java.util.ArrayList;

public class Peasant extends Warriors {

    protected int ammo;

    public Peasant(String name, Vector2D coords) {
        super(30, 30, 1, 1, 1, 3, 50, 150, name, coords.posX, coords.posY,1 );
        this.ammo = 1;

        
    }

    @Override
    public String getInfo(){         

        return String.format("Крестьянин: %10s |  Speed: %3d  |  Atack:  %3d  |  HP:  %3d  |  XY  %3d -%3d  |  State:  %5s  |  ", name, speed, atack,hp, coords.posY, coords.posX, state);

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

    // @Override
    // public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
    // if (!state.equals("Die")) state = "Stand";
    // }


}

package units;



public class Crossbowman extends Shooter{


    public Crossbowman(String name, Vector2D coords) {
        super(30, 30, 6, 5, 3, 4, 13, 13, name, coords.posX, coords.posY, 2);
    }

    @Override
    public String getInfo(){

        return String.format("Арбалетчик: %10s |  Speed: %3d  |  Atack:  %3d  |  HP:  %3d  |  XY  %3d -%3d  |  State:  %5s  |  Arrows:  %1d", name, speed, atack,hp, coords.posY, coords.posX, state,arrows );

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



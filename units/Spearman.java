package units;

public class Spearman extends Warriors{

    public Spearman(String name, Vector2D coords) {
        super(30, 30, 4, 5, 3, 4, 100, 150, name, coords.posX, coords.posY, 1);
    }
    @Override
    public String getInfo(){           

        return String.format("Копейщик: %12s |  Speed: %3d  |  Atack:  %3d  |  HP:  %3d  |  XY  %3d -%3d  |  State:  %5s  |  ", name, speed, atack,hp, coords.posY, coords.posX, state);
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

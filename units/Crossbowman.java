package units;



public class Crossbowman extends Shooter{


    public Crossbowman(String name, Vector2D coords) {
        super(10, 10, 6, 5, 3, 4, 0, 0, name, coords.posX, coords.posY, 2);
    }
    
    // public Crossbowman(String name, int hp) {                   // Можно сделать более гибкий конструктор, добавив еще переменную
    //     super(hp, 200, 300, 400, 3, 5, name);
    // }



    @Override
    public String getInfo(){
        // return "Арбалетчик " + name + "    |     Speed:" + speed + 
        // "    |     Atack: " + atack + "    |     HP: " + hp + "    |     "
        //  + coords.posX  + "    "+   coords.posY + "    |     Arrows:" + arrows; 
    
        return String.format("Арбалетчик: %10s |  Speed: %3d  |  Atack:  %3d  |  HP:  %3d  |  XY  %3d -%3d  |  Arrows:  %3d", name, speed, atack,hp, coords.posY, coords.posX, arrows );

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



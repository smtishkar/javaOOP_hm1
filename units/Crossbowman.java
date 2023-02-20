package units;

public class Crossbowman extends Shooter{


    public Crossbowman(String name) {
        super(10, 10, 6, 5, 3, 4, 16, 16, name);
    }
    
    // public Crossbowman(String name, int hp) {                   // Можно сделать более гибкий конструктор, добавив еще переменную
    //     super(hp, 200, 300, 400, 3, 5, name);
    // }



    @Override
    public String getInfo(){
        return "Арбалетчик " + name + "; "+ "Скорость " + speed + "; "+ "Атака " + atack;
    }

    @Override
    public int getSpeed(){
        return speed;
    }


    @Override
    public int getAtack(){
        return atack;
    }

}



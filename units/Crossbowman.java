package units;

public class Crossbowman extends Shooter{

    public Crossbowman(String name) {
        super(150, 200, 300, 400, 3, 5, name);
    }
    
    // public Crossbowman(String name, int hp) {                   // Можно сделать более гибкий конструктор, добавив еще переменную
    //     super(hp, 200, 300, 400, 3, 5, name);
    // }



    @Override
    public String getInfo(){
        // return super.toString();            //Будет возвращать строеку которая формируется в супер классе
        return "Арбалетчик" + name;
    }


}



package units;

public class Monk extends Magician{

    public Monk(String name) {
        super(30, 30, 12, 7, -4, 5, 1, 1, name);
    }
    


    @Override
    public String getInfo(){
        return "Монах " + name + "; "+ "Скорость " + speed;
    }

    @Override
    public int getSpeed(){
        return speed;
    }

}

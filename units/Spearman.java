package units;

public class Spearman extends Warriors{

    public Spearman(String name) {
        super(10, 10, 4, 5, 3, 4, 100, 150, name);
    }
    @Override
    public String getInfo(){           
        return "Копейщик " + name + "; "+ "Скорость " + speed;
    }

    @Override
    public int getSpeed(){
        return speed;
    }
}

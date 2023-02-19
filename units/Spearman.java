package units;

public class Spearman extends Warriors{

    public Spearman(String name) {
        super(10, 10, 4, 5, 3, 4, 100, 150, name);
    }
    @Override
    public String getInfo(){           
        return "Копейщик " + name + "; "+ "Скорость " + speed + "; "+ "Атака " + atack;
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

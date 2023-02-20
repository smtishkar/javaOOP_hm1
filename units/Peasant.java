package units;

public class Peasant extends Warriors {

    protected int delivery;

    public Peasant(String name, int delivery) {
        super(1, 1, 1, 1, 1, 3, 50, 150, name);
        this.delivery = delivery;

        
    }

    @Override
    public String getInfo(){         
        return "Крестьянин " + name + "; "+ "Скорость " + speed + "; "+ "Атака " + atack;
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

package units;

public class Peasant extends Warriors {

    protected int delivery;

    public Peasant(String name, int delivery) {
        super(1, 1, 1, 1, 1, 3, 50, 150, name);
        this.delivery = delivery;

        
    }

    @Override
    public String getInfo(){
        // return super.toString();            
        return "Крестьянин " + name;
    }

}

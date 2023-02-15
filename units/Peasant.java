package units;

public class Peasant extends Warriors {
    public Peasant(String name) {
        super(200, 250, 20, 50, 50, 150, name);

        
    }

    @Override
    public String toString(){
        // return super.toString();            
        return "Крестьянин " + name;
    }

}

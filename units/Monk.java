package units;

public class Monk extends Magician{

    public Monk(String name) {
        super(120, 170, 0, 40, 150, 300, name);
    }
    

    @Override
    public String toString(){
        // return super.toString();            
        return "Монах " + name;
    }

}

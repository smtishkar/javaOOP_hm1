package units;



public class Wizard extends Magician{

    public Wizard(String name) {
        super(100, 150, 0, 50, 200, 500, name);
    }
    
    @Override
    public String toString(){
        // return super.toString();            
        return "Волшебник " + name;
    }
    
}

package units;



public class Wizard extends Magician{

    public Wizard(String name) {
        super(30, 30, 17, 12, -5, 9, 1, 1, name);
    }
    
    @Override
    public String getInfo(){          
        return "Волшебник " + name;
    }
    
}

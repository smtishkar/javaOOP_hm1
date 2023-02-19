package units;

public class Raider extends Warriors {

    public Raider(String name) {
        super(10, 10, 8, 3, 4, 6, 50, 150, name);
     }
 
     @Override
     public String getInfo(){         
         return "Разбойник " + name;
     }

}

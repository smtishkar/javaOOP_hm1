package units;

public class Raider extends Warriors {

    public Raider(String name) {
        super(200, 250, 20, 50, 50, 150, name);
     }
 
     @Override
     public String toString(){
         // return super.toString();            
         return "Разбойник " + name;
     }

}

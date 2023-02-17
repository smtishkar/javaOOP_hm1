package units;

public class Spearman extends Warriors{

    public Spearman(String name) {
        super(500, 700, 200, 250, 100, 150, name);
    }
    @Override
    public String getInfo(){           
        return "Копейщик " + name;
    }
}

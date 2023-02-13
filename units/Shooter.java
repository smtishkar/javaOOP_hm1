package units;

public class Shooter extends BaseHero{

    private int ammocount;

    public Shooter(String name, int hp, int atack, int ammocount) {
        super(name, hp, atack);
        this.ammocount = ammocount;
        //TODO Auto-generated constructor stub
    }


    public String getInfo() {
        return String.format("%s ammocount: %d", super.getInfo(), this.ammocount);
    }


    /**
    * Метод описывает логику снижение количества стрел после выстрела;
    * @param ammocount
    */
    // public void ammocountReduction(int ammocount) {
    
    // }
    

}

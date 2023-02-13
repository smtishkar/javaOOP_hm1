import units.BaseHero;
import units.Crossbowman;
import units.Magician;
import units.Monk;
import units.Peasant;
import units.Raider;
import units.Shooter;
import units.Sniper;
import units.Spearman;
import units.Warriors;
import units.Wizard;

/**
 * program
 */
public class program {

    public static void main(String[] args) {

        BaseHero hero1 = new Monk("Сергей", 100, 5, 70);
        System.out.println(((Magician) hero1).getInfo());

        BaseHero hero2 = new Raider("Артём", 200, 30, 500);
        System.out.println(((Warriors) hero2).getInfo());

        BaseHero hero3 = new Crossbowman("Олег", 200, 50, 10);
        System.out.println(((Shooter) hero3).getInfo());

        BaseHero hero4 = new Peasant("Василий", 100, 2, 100);
        System.out.println(((Warriors) hero4).getInfo());

        BaseHero hero5 = new Sniper("Иван", 150, 25, 5);
        System.out.println(((Shooter) hero5).getInfo());

        BaseHero hero6 = new Spearman("Дмитрий", 350, 30, 200);
        System.out.println(((Warriors) hero6).getInfo());

        BaseHero hero7 = new Wizard("Игорь", 100, 50, 250);
        System.out.println(((Magician) hero7).getInfo());


        System.out.println("--------------------------------------------");
        System.out.println("Let's play");


        hero1.Attack(hero7);
        System.out.println(((Magician) hero7).getInfo());
        hero2.Attack(hero4);
        System.out.println(((Warriors) hero4).getInfo());
        hero2.Attack(hero4);
        System.out.println(((Warriors) hero4).getInfo());
        hero2.Attack(hero4);
        System.out.println(((Warriors) hero4).getInfo());
        hero2.Attack(hero4);

    }
}

import java.util.ArrayList;

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


        ArrayList<BaseHero> list = new ArrayList<>();
        list.add(new Sniper("Sergey"));
        list.add(new Crossbowman("Petr"));
        list.add(new Monk("Petr"));
        list.add(new Wizard("Petr"));
        list.add(new Raider("Petr"));
        list.add(new Peasant("Petr"));
        list.add(new Spearman("Petr"));
        


        // Sniper sniper1 = new Sniper("Ваня");

        // System.out.println(sniper1);                // Если есть в классе override - тогда можно выводить на экран информацию таким способом

        list.forEach(n-> System.out.println(n));


        // BaseHero hero1 = new Monk("Сергей", 100, 5, 70);
        // System.out.println(((Magician) hero1).getInfo());

        System.out.println("--------------------------------------------");
        System.out.println("Let's play");


        // hero1.Attack(hero7);
        // System.out.println(((Magician) hero7).getInfo());
        // hero2.Attack(hero4);
        // System.out.println(((Warriors) hero4).getInfo());
        // hero2.Attack(hero4);
        // System.out.println(((Warriors) hero4).getInfo());
        // hero2.Attack(hero4);
        // System.out.println(((Warriors) hero4).getInfo());
        // hero2.Attack(hero4);

    }
}

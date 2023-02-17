import java.util.ArrayList;
import java.util.Random;

import units.BaseHero;
import units.Crossbowman;
import units.InGameInterface;
import units.Monk;
import units.Peasant;
import units.Raider;
import units.Sniper;
import units.Spearman;
import units.Wizard;

/**
 * program
 */
public class program {

    public static void main(String[] args) {

        int maxteamlenght = 10;
        ArrayList<BaseHero> team = new ArrayList<>();
        for (int i = 0; i < maxteamlenght; i++) {

            switch (new Random().nextInt(0, 6)) {
                case 0:
                    team.add(new Sniper(getName()));
                    break;

                case 1:
                    team.add(new Crossbowman(getName()));
                    break;

                case 2:
                    team.add(new Monk(getName()));
                    break;

                case 3:
                    team.add(new Wizard(getName()));
                    break;

                case 4:
                    team.add(new Raider(getName()));
                    break;

                case 5:
                    team.add(new Peasant(getName()));
                    break;

                case 6:
                    team.add(new Spearman(getName()));
                    break;
            }
        }

        team.forEach(n -> System.out.println(n.getInfo()));
        System.out.println(team.get(1).getInfo());          // Вывод одного элемента массива
    }

    
    private static String getName() {

        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);

    }

}

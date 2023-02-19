import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Comparator;
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
        ArrayList<BaseHero> team2 = new ArrayList<>();
        for (int i = 0; i < maxteamlenght; i++) {

            switch (new Random().nextInt(0, 4)) {
                case 0:
                    team.add(new Sniper(getName()));
                    break;

                case 1:
                    team.add(new Wizard(getName()));
                    break;

                case 2:
                    team.add(new Raider(getName()));
                    break;

                case 3:
                    team.add(new Peasant(getName(), 1));
                    break;

            }
        }

        for (int i = 0; i < maxteamlenght; i++) {

            switch (new Random().nextInt(0, 4)) {

                case 0:
                    team2.add(new Crossbowman(getName()));
                    break;

                case 1:
                    team2.add(new Monk(getName()));
                    break;

                case 2:
                    team2.add(new Peasant(getName(), 1));
                    break;

                case 3:
                    team2.add(new Spearman(getName()));
                    break;
            }
        }

        // System.out.println("Команда 1");
        // team.forEach(n -> System.out.println(n.getInfo()));
        // System.out.println("-------------------------------");
        // System.out.println("Команда 2");
        // team2.forEach(n -> System.out.println(n.getInfo()));
        // System.out.println(team.get(1).getInfo());          // Вывод одного элемента массива

        team.sort(new Comparator<BaseHero>(){

            @Override
            public int compare(BaseHero o1, BaseHero o2) {
            return o2.getSpeed() - o1.getSpeed();         
            }
        });


        team2.sort(new Comparator<BaseHero>(){

            @Override
            public int compare(BaseHero o1, BaseHero o2) {
            return o2.getSpeed() - o1.getSpeed();         
            }
        });


        System.out.println("Команда 1");
        System.out.println();
        team.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("Команд 2");
        System.out.println();
        team2.forEach(n -> System.out.println(n.getInfo()));


    }

    
    private static String getName() {

        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);

    }

}

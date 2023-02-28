
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import units.BaseHero;
import units.Crossbowman;

import units.Monk;
import units.Peasant;
import units.Raider;
import units.Sniper;
import units.Spearman;
import units.Vector2D;
import units.Wizard;

/**
 * program
 */
public class program {

    static final int maxteamlenght = 10;

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();
        ArrayList<BaseHero> allmembers = new ArrayList<>();
        createTeam(team1, 0, 1);
        createTeam(team2, 3, 10);
        allmembers.addAll(team1);
        allmembers.addAll(team2);
        sortTeam(allmembers);

        System.out.println("Команда 1");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println();
        System.out.println("Команда 2");
        team2.forEach(n -> System.out.println(n.getInfo()));
        System.out.println();
        System.out.println("Все участники");
        allmembers.forEach(n -> System.out.println(n.getInfo()));
        System.out.println();

        String stop = "";
        while (stop.equals("")) {
            for (BaseHero human : allmembers) {
                if (team1.contains(human)) {
                    human.step(team1, team2);

                } else {
                    human.step(team2, team1);
                }
            }


            
            allmembers.forEach(n -> System.out.println(n.getInfo()));
            stop = user_input.nextLine();
        }

    }

    static void createTeam(ArrayList team, int offset, int posY) {
        for (int i = 0; i < maxteamlenght; i++) {
            switch (new Random().nextInt(4) + offset) {
                case 0:
                    team.add(new Sniper(getName(), new Vector2D(i + 1, posY)));
                    break;

                case 1:
                    team.add(new Wizard(getName(), new Vector2D(i + 1, posY)));
                    break;

                case 2:
                    team.add(new Raider(getName(), new Vector2D(i + 1, posY)));
                    break;

                case 3:
                    team.add(new Peasant(getName(), new Vector2D(i + 1, posY)));
                    break;

                case 4:
                    team.add(new Crossbowman(getName(), new Vector2D(i + 1, posY)));
                    break;

                case 5:
                    team.add(new Monk(getName(), new Vector2D(i + 1, posY)));
                    break;

                case 6:
                    team.add(new Spearman(getName(), new Vector2D(i + 1, posY)));
                    break;

            }
        }
    }

    static void sortTeam(ArrayList<BaseHero> team) {
        team.sort(new Comparator<BaseHero>() {

            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                if (o2.getSpeed() == o1.getSpeed())
                    return o2.getHp() - o1.getHp();
                else
                    return o2.getSpeed() - o1.getSpeed();
            }
        });
    }

    private static String getName() {

        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);

    }

}

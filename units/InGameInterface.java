package units;

import java.util.ArrayList;

public interface InGameInterface {

    boolean step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);

    String getInfo();

    int getSpeed();

    int getAtack();

    int getHp();

}

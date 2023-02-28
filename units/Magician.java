package units;

import java.util.ArrayList;

public abstract class Magician extends BaseHero {

    protected int mp, maxMp;
    protected String name;

    public Magician(int hp, int maxHp, int atack, int def, int damageMax, int speed, int mp,
            int maxMp, String name, int posX, int posY) {
        super(hp, maxHp, atack, def, damageMax, speed, posX, posY);
        this.mp = mp;
        this.maxMp = maxMp;
        this.name = name;
    }

    protected int findIll(ArrayList<BaseHero> team) {
        double minHp = 0;
        int index = 0;

        for (int i = 0; i < team.size(); i++) {
            if (minHp < team.get(i).maxHp - team.get(i).hp && team.get(i).hp > 0) {
                index = i;
                minHp = team.get(i).maxHp - team.get(i).hp;
            }
        }
        return index;
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Stand") && mp > 0) {
            BaseHero tareget = team1.get(findIll(team1));
            tareget.getDamage(damageMax);
            mp--;
        }
    }
}

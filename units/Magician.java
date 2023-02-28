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

    protected BaseHero findIll(ArrayList<BaseHero> team) {
        double minHp = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (minHp > team.get(i).maxHp - team.get(i).hp) {
                index = i;
                minHp = team.get(i).maxHp - team.get(i).hp;
            }
        }System.out.println(index);
        return team.get(index);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Stand") && mp > 0) {
            BaseHero tareget = findIll(team1);
            // if (tareget.hp != tareget.maxHp) {
            // if (tareget.hp != tareget.maxHp && tareget.state.equals("Stand")) {
            tareget.getDamage(damageMax);
            mp--;
            // }else{System.out.println("Все здоровы");}
            // Проблема в том, что лечит постоянно, даже если у всех HP - 100%
        }

    }

}

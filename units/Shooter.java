package units;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero {

    protected int arrows, maxArrows, damageMin;
    protected String name;

    public Shooter(int hp, int maxHp, int atack, int def, int damageMax, int speed,
            int arrows, int maxArrows, String name, int posX, int posY, int damageMin) {
        super(hp, maxHp, atack, def, damageMax, speed, posX, posY);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
        this.name = name;
        this.damageMin = damageMin;
    }

    @Override
    public boolean step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Stand")) {
            if (arrows > 0) {
                BaseHero tareget = team2.get(findNearest(team2));
                float damage = (tareget.def - atack) > 0 ? damageMin
                        : (tareget.def - atack) < 0 ? damageMax : (damageMin + damageMax) / 2;
                tareget.getDamage(damage);

                for (BaseHero human : team1) {
                    if (human.getInfo().toString().split(":")[0].equals("Ферм") && human.state.equals("Stand")) {
                        human.state = "Busy";
                        return false;
                    }
                }
                arrows--;
                return false;
            }
            return false;
        }
        return true;

    }

}

package units;

import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

public abstract class Warriors extends BaseHero {

    protected int stamina, maxStamina, damageMin;
    protected String name;

    public Warriors(int hp, int maxHp, int atack, int def, int damageMax, int speed,
            int stamina, int maxStamina, String name, int posX, int posY, int damageMin) {
        super(hp, maxHp, atack, def, damageMax, speed, posX, posY);
        this.stamina = stamina;
        this.maxStamina = maxStamina;
        this.name = name;
        this.damageMin = damageMin;
    }

    @Override
    public boolean step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        if (state.equals("Die"))
            return true;
        BaseHero tareget = team2.get(findNearest(team2));
        if (tareget.coords.getDistance(coords) < 2) {
            float damage = (tareget.def - atack) > 0 ? damageMin
                    : (tareget.def - atack) < 0 ? damageMax : (damageMin + damageMax) / 2;
            tareget.getDamage(damage);
            
        } 
        else {
            Vector2D temptar = coords.chooseWay(tareget.coords);
            if (Math.abs(temptar.posX) < Math.abs(temptar.posY)) {
                if (coords.chooseWay(tareget.coords).posY > 0) {
                    coords.posY--;
                } else {
                    coords.posY++;
                }

            } else {
                if (coords.chooseWay(tareget.coords).posX > 0) {
                    coords.posX--;
                } else {
                    coords.posX++;
                }
            }

        }
        return false;

    }
}
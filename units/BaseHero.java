package units;

import java.util.ArrayList;

public abstract class BaseHero implements InGameInterface {

    protected int hp, atack, def, maxHp, damageMax, speed;
    protected Vector2D coords;
    protected String state;

    protected BaseHero(int hp, int maxHp, int atack, int def, int damageMax, int speed, int posX, int posY) {
        this.hp = hp;
        this.atack = atack;
        this.def = def;
        this.maxHp = maxHp;
        this.damageMax = damageMax;
        this.speed = speed;
        coords = new Vector2D(posX, posY);
        state = "Stand";

    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "null";
    }

    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
    }

    public int findNearest(ArrayList<BaseHero> team) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).state.equals("Stand") && min > coords.getDistance(team.get(i).coords)) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }

        }
        return index;

    }

    protected void getDamage(float damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp)
            hp = maxHp;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getAtack() {
        return atack;
    }

    @Override
    public int getHp() {
        return hp;
    }

}

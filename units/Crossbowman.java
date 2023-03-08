package units;

public class Crossbowman extends Shooter {

    public Crossbowman(String name, Vector2D coords) {
        super(30, 30, 6, 5, 3, 7, 9, 9, name, coords.posX, coords.posY, 2);
    }

    @Override
    public String getInfo() {

        return String.format("Арба: %7s | Sp: %2d | At: %2d | HP: %2d | XY  %2d -%2d | %3s | Arr: %1d ", name, speed,
                atack, hp, coords.posY, coords.posX, state, arrows);

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

package units;

public class Monk extends Magician {

    public Monk(String name, Vector2D coords) {
        super(30, 30, 12, 7, -8, 2, 10, 10, name, coords.posX, coords.posY);
    }

    @Override
    public String getInfo() {

        return String.format("Монах: %6s | Sp: %2d | At: %2d | HP: %2d | XY  %2d -%2d | %3s | MP: %1d ", name, speed,
                atack, hp, coords.posY, coords.posX, state, mp);

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

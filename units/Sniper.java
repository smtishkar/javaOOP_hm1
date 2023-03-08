package units;

public class Sniper extends Shooter {

    public Sniper(String name, Vector2D coords) {
        super(30, 30, 9, 10, 9, 9, 10, 10, name, coords.posX, coords.posY, 5);

    }

    @Override
    public String getInfo() {

        return String.format("Снай: %7s | Sp: %2d | At: %2d | HP: %2d | XY  %2d -%2d | %3s | Arr: %1d |", name, speed,
                atack, hp, coords.posY, coords.posX, state, arrows);

    }

}

package units;

public class Spearman extends Warriors {

    public Spearman(String name, Vector2D coords) {
        super(30, 30, 4, 10, 3, 4, 100, 150, name, coords.posX, coords.posY, 1);
    }

    @Override
    public String getInfo() {

        return String.format("Копе: %7s | Sp: %2d | At: %2d | HP: %2d | XY  %2d -%2d | %3s |     ", name, speed, atack,
                hp, coords.posY, coords.posX, state);
    }

}

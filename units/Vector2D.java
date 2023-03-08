package units;

public class Vector2D {
    protected int posX;
    protected int posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected double getDistance(Vector2D oponent) {
        return Math.sqrt(Math.pow(posX - oponent.posX, 2) + Math.pow(posY - oponent.posY, 2));
    }

    protected Vector2D chooseWay(Vector2D oponent) {
        return new Vector2D(posX - oponent.posX, posY - oponent.posY);
    }
}

package tij.chapter20;

interface HasColor {
    java.awt.Color getColor();
}

class Coord {
    public int x, y;
}

public class WithColorCoord<T extends Coord & HasColor> {
    T item;

    public static void main(String[] args) {

    }

    java.awt.Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }
}

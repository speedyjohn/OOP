package Models;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(Point dest) {
        double deltaX = dest.getX() - this.x;
        double deltaY = dest.getY() - this.y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public String toString() {
        return "Coordinates: " + x + y;
    }
}
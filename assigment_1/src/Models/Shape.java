package Models;
import java.util.ArrayList;
import java.util.Arrays;

public class Shape {
    private ArrayList<Point> points = new ArrayList<Point>();

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        return Arrays.stream(getSides()).sum();
    }

    public double getAverageSide() {
        return calculatePerimeter() / points.size();
    }

    public double getLongestSide() {
        return Arrays.stream(getSides()).max().getAsDouble();
    }

    private double[] getSides() {
        double[] sides = new double[points.size()];
        for(int i = 0; i < points.size(); i++) {
            int nextIndex = (i + 1) % points.size();
            sides[i] = points.get(i).getDistance(points.get(nextIndex));
        }

        return sides;
    }

    public String toString() {
        return "Shape";
    }
}
package Models;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<Point>();

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0.0;
        int numPoints = points.size();

        for(int i = 0; i < numPoints; i++) {
            int nextIndex = (i + 1) % numPoints;
            perimeter += points.get(i).distanceTo(points.get(nextIndex));
        }

        return perimeter;
    }

    public double getAverageSide() {
        return calculatePerimeter() / points.size();
    }

    public double getLongestSide() {
        double longestSide = 0.0;
        int numPoints = points.size();

        for(int i = 0; i < numPoints; i++) {
            int nextIndex = (i + 1) % numPoints;
            double currentSide = points.get(i).distanceTo(points.get(nextIndex));

            if(currentSide > longestSide) {
                longestSide = currentSide;
            }
        }

        return longestSide;
    }

    public String toString() {
        return "Shape";
    }
}
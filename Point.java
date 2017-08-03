import java.util.*;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distanceTo(Point from, Point to) {
        // Distance formula: sqrt( (x2-x1)^2 + (y2-y1)^2 )
        return Math.sqrt(Math.pow((to.x - from.x), 2) + Math.pow((to.y - from.y), 2));
    }
}

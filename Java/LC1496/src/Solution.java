import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Solution {
    public boolean isPathCrossing(String path) {
        Point currPoint = new Point(0, 0);
        Set<Point> set = new LinkedHashSet<>(Set.of(currPoint));

        for (char ch : path.toCharArray()) {
            currPoint = move(currPoint, ch);
            if (!set.add(currPoint)) {
                return true;
            }
        }

        return false;
    }

    private Point move(Point p, char ch) {
        Point newPoint = new Point(p.x, p.y);
        switch (ch) {
            case 'N' -> newPoint.y++;

            case 'S' -> newPoint.y--;

            case 'E' -> newPoint.x++;

            case 'W' -> newPoint.x--;
        }
        return newPoint;
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
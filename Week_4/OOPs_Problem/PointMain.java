class Point {
    private int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class PointMain {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        p.display();

        p.setXY(5, 15);
        p.display();
    }
}
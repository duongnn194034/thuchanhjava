package baithuchanh1;
public class TestPoint {
    public static void Main(String args[]) {
        Point p1 = new Point();
        Point p2 = new Point(2f, 1f, 0.5f);
        Point p3 = new Point(p2);

        p1.setX(3f);
        p1.setY(1.5f);
        p1.setZ(2f);

        System.out.println("p1.z = " + p1.getY());
        System.out.println("p2.x = " + p2.getZ());
        System.out.println("p3.x = " + p3.getZ());

        p3.setZ(5.6f);

        System.out.println("p3.x = " + p3.getZ());
    }
}

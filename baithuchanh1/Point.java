package baithuchanh1;
public class Point {
    private float x, y, z;
    
    public Point () {

    }
    public Point (float xx, float yy, float zz) {
        this.x = xx;
        this.y = yy;
        this.z = zz;
    }
    public Point (Point P) {
        this.x = P.getX();
        this.y = P.getY();
        this.z = P.getZ();
    }

    public float getX () {
        return x;
    }
    public float getY () {
        return y;
    }
    public float getZ ()  {
        return z;
    }

    public void setX (float xx) {
        this.x = xx;
    }
    public void setY (float yy) {
        this.y = yy;
    }
    public void setZ (float zz) {
        this.z = zz;
    }
}
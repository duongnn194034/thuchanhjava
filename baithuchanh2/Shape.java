package baithuchanh2;

public class Shape {
    private float x, y;
    
    public Shape () {} 
    public Shape (float xx, float yy) {
        this.x = xx;
        this.y = yy;
    }

    public float getX () {
        return x;
    }
    public float getY () {
        return y;
    }
    public void setX (float xx) {
        this.x = xx;
    }
    public void setY (float yy) {
        this.y = yy;
    }

    public float Square () {
        return 0;
    }
}


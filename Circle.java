package baithuchanh2;

public class Circle extends Shape {
    private float r;

    public Circle () {

    }
    public Circle(float xx, float yy, float rr) {
        super(xx, yy);
        this.r = rr;
    }
    
    public float getR () {
        return r;
    } 
    public void setR (float rr) {
        this.r = rr;
    }

    public float Square() {
        return r * r * (float)Math.PI;
    }
}

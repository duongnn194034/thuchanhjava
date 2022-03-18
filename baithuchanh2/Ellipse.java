package baithuchanh2;

public class Ellipse {
    private float a, b;

    public float getA () {
        return a;
    }
    public float getB () {
        return b;
    }
    public void setA (float aa) {
        this.a = aa;
    }
    public void setB (float bb) {
        this.b = bb;
    }
    public float Square () {
        return a * b * (float)Math.PI / 4f;
    }
}
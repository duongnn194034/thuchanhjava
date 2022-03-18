package baithuchanh1;

public class TestComplex {
    public static void main(String args[]) {
        Complex a = new Complex();
        Complex b = new Complex(10f);
        Complex c = new Complex(4f, 3f);

        a.setReal(5f);
        a.setImage(4.5f);

        Complex d = new Complex(a.add(b));
        Complex e = new Complex(b.mutiply(c));
        Complex f = new Complex(c.divide(a));
        
        System.out.println(a.getReal() + " + " + a.getImage() + "i");
        System.out.println(b.getReal() + " + " + b.getImage() + "i");
        System.out.println(c.getReal() + " + " + c.getImage() + "i");
        System.out.println(d.getReal() + " + " + d.getImage() + "i");
        System.out.println(e.getReal() + " + " + e.getImage() + "i");
        System.out.println(f.getReal() + " + " + f.getImage() + "i");
    }
}

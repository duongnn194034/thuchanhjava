package baithuchanh1;

public class Complex {
    private float real, image;

    //constructor
    public Complex () {}
    public Complex (float real) {
        this.real = real;
        this.image = 0;
    }
    public Complex (float real, float img) {
        this.real = real;
        this.image = img;
    }
    public Complex (Complex complex) {
        this.real = complex.getReal();
        this.image = complex.getImage();
    }

    //getter & setter
    public float getReal () {
        return real;
    }
    public float getImage () {
        return image;
    }
    public void setReal (float real) {
        this.real = real;
    }
    public void setImage (float image) {
        this.image = image;
    }

    //+, -, *, /
    public Complex add (Complex complex) {
        Complex res = new Complex();
        res.setReal(real + complex.getReal());
        res.setImage(image + complex.getImage());
        return res;
    }
    public Complex sub (Complex complex) {
        Complex res = new Complex();
        res.setReal(real - complex.getReal());
        res.setImage(image - complex.getImage());
        return res;
    }
    public Complex mutiply (Complex complex) {
        Complex res = new Complex();
        res.setReal(real * complex.getReal() - image * complex.getImage());
        res.setImage(real * complex.getImage() + image * complex.getReal());
        return res;
    }
    public float sqrComplexModule () {
        return real*real + image * image;
    }
    
    public Complex divide (Complex complex) {
        Complex res = new Complex();
        res.setReal((real * complex.getReal() + image * complex.getImage()) / complex.sqrComplexModule());
        res.setImage((- real * complex.getImage() + image * complex.getReal()) / complex.sqrComplexModule());
        return res;
    }


}

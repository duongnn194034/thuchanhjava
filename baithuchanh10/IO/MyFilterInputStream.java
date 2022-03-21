package baithuchanh10;

//import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyFilterInputStream extends FilterInputStream{
    public MyFilterInputStream (InputStream in) {
        super(in);
    }
    
    @Override
    public int read () {
        try {
            if(super.read() >= 65 && super.read() <= 90) return super.read() + 32;
            else return super.read();
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }     
    }
}

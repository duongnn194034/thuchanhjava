package baithuchanh6;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class PhanSo {
    private int tu = 1, mau = 1;
    private void toiGian () {
        int a = tu, b = mau;
        if(a<b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while(b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        tu /= a;
        mau /= a;
    }
    public PhanSo () {}
    public PhanSo(int n, int d) {
        try {
            this.tu = n;
            if(d == 0) throw new Exception();
            this.mau = d;
            this.toiGian();
        } catch (Exception e) {
            System.err.println("Mau so khong the bang khong!");
        }
    }
    
    public int getTu () {
        return tu;
    }
    public int getMau () {
        return mau;
    }
    public void setTu (int n) {
        this.tu = n;
    }
    public void setMau (int d) {
        try {
            if(d == 0) throw new Exception();
            this.mau = d;
        } catch (Exception e) {
            System.err.println("Mau so khong the bang khong!");
        }
    }

    public final PhanSo add (final PhanSo a) {
        PhanSo res = new PhanSo();
        res.setTu(tu * a.getMau() + mau * a.getTu());
        res.setMau(mau * a.getMau());
        res.toiGian();
        return res;
    }
    public final PhanSo sub (final PhanSo a) {
        PhanSo res = new PhanSo();
        res.setTu(tu * a.getMau() - mau * a.getTu());
        res.setMau(mau * a.getMau());
        res.toiGian();
        return res;
    }
    public final PhanSo mutiple (final PhanSo a) {
        PhanSo res = new PhanSo();
        res.setTu(tu * a.getTu());
        res.setMau(mau * a.getMau());
        res.toiGian();
        return res;
    }
    public final PhanSo divide (final PhanSo a) {
        try {
            if(a.getTu() == 0) throw new Exception();
            PhanSo res = new PhanSo();
            res.setTu(tu * a.getMau());
            res.setMau(mau * a.getTu());
            res.toiGian();
            return res;
        } catch (Exception e) {
            System.err.println("Khong the chia cho khong!");
            return this;
        }
    }
    public void input (String filename) {
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            
            int data1 = myReader.nextInt();
            int data2 = myReader.nextInt();
            
            this.setTu(data1);
            this.setMau(data2);
            this.toiGian();

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public String toString () {
        return tu + "/" + mau;
    }
}

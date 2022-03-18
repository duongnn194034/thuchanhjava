package baithuchanh5;
import java.util.ArrayList;
public class Toabao {
    private String tenTB;
    private ArrayList<Nhanvien> nhanViens = new ArrayList<Nhanvien>();

    public Toabao () {}
    public Toabao (Toabao tb) {
        this.tenTB = tb.getTenTB();
    }
    
    public String getTenTB () {
        return tenTB;
    } 
    public void setTenTB (String name) {
        this.tenTB = name;
    }

    public void boSung (Nhanvien nv) {
        nhanViens.add(nv);
    }

    public void saThai (Nhanvien nv) {
        nhanViens.remove(nv);
    }
    public void inDanhSachNV () {
        for(Nhanvien i : nhanViens)
            i.inThe();
    }
}
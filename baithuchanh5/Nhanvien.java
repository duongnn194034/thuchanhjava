package baithuchanh5;

public abstract class Nhanvien {
    private Toabao toaBao;
    private String ten;

    public String getTen () {
        return ten;
    }
    public Toabao getToabao () {
        return new Toabao(toaBao);
    }
    public void inThe () {
        System.out.println(toaBao.getTenTB());
        System.out.println("Ho va ten: " + this.getTen());
    } 
    public void boSung (Toabao tb) {
        this.toaBao = tb;
    }
    public void saThai () {
        this.toaBao = null;
    }
}

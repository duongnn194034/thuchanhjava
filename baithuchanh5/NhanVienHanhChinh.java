package baithuchanh5;

public class NhanVienHanhChinh extends Nhanvien {
    private String chucVu;

    public void inThe () {
        super.inThe();
        System.out.println("Chuc vu: " + chucVu);
    }
}

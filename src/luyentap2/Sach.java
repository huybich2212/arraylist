package luyentap2;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(int maTaiLieu, String tenNhaXB, String tenTacGia1, int soTrang) {
        super(maTaiLieu, tenNhaXB);
        this.tenTacGia = tenTacGia1;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString() +"Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}

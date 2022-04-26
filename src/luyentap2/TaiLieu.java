package luyentap2;

public class TaiLieu {
    private int maTaiLieu;
    private String tenNhaXB;


    public TaiLieu() {
    }

    public TaiLieu(int maTaiLieu, String tenNhaXB) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXB = tenNhaXB;

    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }



    @Override
    public String toString() {
        return super.toString()+ "TaiLieu{" +
                "maTaiLieu=" + maTaiLieu +
                ", tenNhaXB='" + tenNhaXB + '\'' +
                '}';
    }
}

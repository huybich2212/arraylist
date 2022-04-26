package tuyensinh;

public class KhoiA extends ThiSinhDuThi {
    private static final String toan = "toan";
    private static final String ly = "ly";
    private static final String hoa = "hoa";

    public KhoiA() {
    }

    public KhoiA(int soBaoDanh, String hoVaTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoVaTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "KhoiA{}";
    }
}




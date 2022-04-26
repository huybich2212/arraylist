package tuyensinh;

public class KhoiB extends ThiSinhDuThi{
    private static final String toan = "toan";
    private static final String hoa = "hoa";
    private static final String sinh = "sinh";

    public KhoiB() {
    }

    public KhoiB(int soBaoDanh, String hoVaTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoVaTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "KhoiB{}";
    }
}

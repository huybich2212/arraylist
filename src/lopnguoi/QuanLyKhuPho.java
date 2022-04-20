package lopnguoi;

import java.util.Arrays;

public class QuanLyKhuPho {
    private KhuPho khuPho;

    public QuanLyKhuPho() {

    }
    public QuanLyKhuPho(KhuPho khuPho) {
        this.khuPho = khuPho;
    }
    public void hienMenuKhuPho() {
        System.out.println(" Quản lý khu phố");
        System.out.println("1:Hộ gia đình");
        System.out.println("2:Khu Phố ");
        System.out.println("0:Quay lại menu");
    }
    public void hienMenuGiaDinh() {
        System.out.println("Quản lý gia đình");
        System.out.println("1:xem thành viên");
        System.out.println("2:sửa thành viên");
        System.out.println("3:xoá theo cmnd");
        System.out.println("4:Tìm kiếm theo tên");
    }

}

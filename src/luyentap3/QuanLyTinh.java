package luyentap3;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTinh implements QuanLy<Tinh>{
    List<Tinh> tinhs = new ArrayList<>();

    public QuanLyTinh() {
        QuanLyTinh quanLyTinh = new QuanLyTinh();
        quanLyTinh.them(new Tinh("v145","NA","1tr",3000));
        quanLyTinh.them(new Tinh("h123","HN","1tr",3000));
        quanLyTinh.them(new Tinh("g145","HT","1tr",3000));
        quanLyTinh.them(new Tinh("b213","QN","1tr",3000));
        quanLyTinh.them(new Tinh("c125","TH","1tr",3000));

    }

    @Override
    public void them(Tinh tinh) {
       this.tinhs.add(tinh);
    }

    @Override
    public int timKiem(String ten) {

        return 0;
    }

    @Override
    public void xoa(String ten) {

    }

    @Override
    public void hienThi() {
        for (int i = 0; i < tinhs.size() ; i++) {
            System.out.println(tinhs.get(i).toString());
        }
        System.out.println("----------------------------------------");
    }

    }


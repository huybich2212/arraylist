package luyentap2;

import java.util.ArrayList;

public class QuanLySach implements QuanLy<TaiLieu> {
    ArrayList<TaiLieu> taiLieus = new ArrayList<TaiLieu>();

    @Override
    public void add(TaiLieu taiLieu) {
        this.taiLieus.add(taiLieu);
    }

    @Override
    public void xoa(int ma) {

    }


    @Override
    public void hienThi() {
        for (int i = 0; i < taiLieus.size() ; i++) {
            System.out.println(taiLieus.get(i).toString());
        }
        System.out.println("------------------------");
    }

    @Override
    public int timKiem() {
        return 0;
    }
}

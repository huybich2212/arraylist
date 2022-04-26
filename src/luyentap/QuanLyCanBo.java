package luyentap;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCanBo implements QuanLy<CanBo> {
   List<CanBo> canBoList= new ArrayList<CanBo>();
   private int size = 0;

    @Override
    public void themCanBo(CanBo t) {
        this.canBoList.add(t);

    }

    @Override
    public int timKiem(String ten) {
        for (int i = 0; i < canBoList.size(); i++) {
            if(this.canBoList.get(i).getHoTen().equals(ten)) {
                return i;
            }
        }
        return -1;
    }
    public void hienThi() {
        for (int i = 0; i < canBoList.size() ; i++) {
            System.out.println(canBoList.get(i).toString());
        }
        System.out.println("----------------------------------------");
    }
    public int thoatCT() {
        System.exit(0);
        return 0;
    }
}

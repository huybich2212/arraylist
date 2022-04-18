package lopnguoi;

import java.util.ArrayList;

public class KhuPho  {
    ArrayList<HoGiaDinh> KhuPholist;

    public KhuPho() {
        this.KhuPholist = new ArrayList<>();
    }
    public void add(HoGiaDinh hoGiaDinh) {
        KhuPholist.add(hoGiaDinh);
    }
    public void display(HoGiaDinh hoGiaDinh) {
        for (int i = 0; i < KhuPholist.size() ; i++) {
            System.out.println(KhuPholist.get(i));

        }
    }
    public void edit(String ten, HoGiaDinh hoGiaDinh) {

        int indexOfHoGiaDinh = hoGiaDinh.findByName(ten);
        if (indexOfHoGiaDinh == -1) {
            System.out.println("không có");
        }else {
            KhuPholist.set(indexOfHoGiaDinh,hoGiaDinh);
        }

    }
    public void delete(String name) {
        int indexOfHoGiaDinh = -1;
        for(int i = 0; i< KhuPholist.size();i++){
             indexOfHoGiaDinh = KhuPholist.get(i).findByName(name);
        }

        if (indexOfHoGiaDinh == -1) {
            System.out.println("không có");
        }else {
            KhuPholist.remove(indexOfHoGiaDinh);
        }
    }
}


package lopnguoi;

import java.util.ArrayList;
import java.util.Comparator;

public class KhuPho  {
    ArrayList<HoGiaDinh> khuPholist;

    public KhuPho() {

    }
    public void add(HoGiaDinh hoGiaDinh) {
        khuPholist.add(hoGiaDinh);
    }
    public void display(HoGiaDinh hoGiaDinh) {
        for (int i = 0; i < khuPholist.size() ; i++) {
            System.out.println(khuPholist.get(i));

        }
    }
    public void edit(String ten, HoGiaDinh hoGiaDinh) {

        int indexOfHoGiaDinh = hoGiaDinh.findByName(ten);
        if (indexOfHoGiaDinh == -1) {
            System.out.println("không có");
        }else {
            khuPholist.set(indexOfHoGiaDinh,hoGiaDinh);
        }

    }
    public void delete(String name) {
        int indexOfHoGiaDinh = -1;
        for(int i = 0; i< khuPholist.size(); i++){
             indexOfHoGiaDinh = khuPholist.get(i).findByName(name);
        }

        if (indexOfHoGiaDinh == -1) {
            System.out.println("không có");
        }else {
            khuPholist.remove(indexOfHoGiaDinh);
        }

    }
    public void hoGiaDinh() {
        int max = khuPholist.get(0).getSoNguoi();
        for (int i = 0; i < khuPholist.size() ; i++) {
            if (max < khuPholist.get(i).getSoNguoi()){
                max = khuPholist.get(i).getSoNguoi();
            }

        }
        System.out.println("hộ gia đình nhiều thành viên nhất" + max);
    }
    public void agemin() {
        ArrayList collections = null;
        collections.sort((Comparator) khuPholist);
    }
}


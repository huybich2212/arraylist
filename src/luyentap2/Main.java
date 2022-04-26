package luyentap2;

public class Main {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        quanLySach.add(new Sach(1223,"abc","ádaw",234));
        quanLySach.add(new Bao(123,"ádasd","123"));

        quanLySach.hienThi();
    }
}

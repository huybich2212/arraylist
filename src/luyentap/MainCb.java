package luyentap;

import java.util.Scanner;

public class MainCb {
    public static void main(String[] args) {
      QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        Scanner scanner = new Scanner(System.in);

      quanLyCanBo.themCanBo(new CanBo("sad",25,"namn","hn"));
      quanLyCanBo.themCanBo(new KySu("ádsa",24,"nam","hn","Cntt"));
      quanLyCanBo.themCanBo(new CongNhan("abc",28,"nsm","na",5));
      quanLyCanBo.hienThi();
      System.out.println("Nhập tên cần tìm");
      String ten = scanner.nextLine();
      System.out.println(quanLyCanBo.timKiem(ten));
      System.out.println("Nhấn 0 để thoát chương trình");
      scanner.nextInt();
      System.out.println(quanLyCanBo.thoatCT());


    }
}

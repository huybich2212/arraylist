package lopnguoinew;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        HoGiaDinh hoGiaDinh = new HoGiaDinh();
        int choice=0;
        do {
            System.out.println("-----MENU------");
            System.out.println(    "chọn chức năng ");
            System.out.println(
                    "1. Thêm người vào List .\n" +
                            " 2. In List người ra màn hình.\n" +
                            " 3. xoá người trong list.\n" +
                            " 4. Tìm kiếm người theo số cmnd.\n" +
                            " 5. Xuất ra danh sách người có tuổi từ cao đến thấp.\n" +
                            " 0. Thoát chương trình."
            );
            choice = sc.nextInt();
            sc.nextLine();
            if(choice==1) {
                System.out.println("Nhập họ tên người:");
                String hoTen = sc1.nextLine();
                System.out.println("Nhập số tuổi");
                int tuoi = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhâph nghề nghiệp:");
                String ngheNghiep = sc1.nextLine();
                System.out.println("Nhập cmnd :");
                int cmnd = sc.nextInt();
                Nguoi nguoi = new Nguoi(hoTen,tuoi,ngheNghiep,cmnd);
                System.out.println("nhập địa chỉ");

                String diaChi=sc1.nextLine();
                hoGiaDinh.setDiaChi(diaChi);
                hoGiaDinh.add(nguoi);
            }else if (choice == 2){
                hoGiaDinh.display();
            }else if (choice == 3){
            }else if (choice == 4){
            }else if (choice == 5){
            }
        }while (choice!=0);

    }
}

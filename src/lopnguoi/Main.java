package lopnguoi;

public class Main {
    public static void main(String[] args) {
        HoGiaDinh hoGiaDinh1 = new HoGiaDinh("hn",3);
        hoGiaDinh1.add(new LopNguoi("linh", "hs", 21, 223));
        hoGiaDinh1.add(new LopNguoi("mạnh", "cn", 21, 435));
        hoGiaDinh1.add(new LopNguoi("tài", "hs", 17, 223));
        hoGiaDinh1.display();
        System.out.println("---------add----------");
        HoGiaDinh hoGiaDinh2 = new HoGiaDinh("qN",3);
        hoGiaDinh2.add(new LopNguoi("vinh", "hs", 21, 223));
        hoGiaDinh2.add(new LopNguoi("hạnh", "cn", 21, 435));
        hoGiaDinh2.add(new LopNguoi("lâm", "hs", 17, 223));
        hoGiaDinh2.display();
        System.out.println();
        HoGiaDinh hoGiaDinh3 = new HoGiaDinh("NA",4);
        hoGiaDinh3.add(new LopNguoi("linh", "hs", 21, 223));
        hoGiaDinh3.add(new LopNguoi("mạnh", "cn", 21, 435));
        hoGiaDinh3.add(new LopNguoi("tài", "hs", 17, 223));
        hoGiaDinh3.add(new LopNguoi("vinh", "hs", 17, 2223));
        hoGiaDinh2.display();
        hoGiaDinh2.delete("linh");
        hoGiaDinh2.display();
        System.out.println("--------min-------");

        System.out.println(" xắp xếp hộ gđ theo số thành viên ");



        System.out.println("-----tim--------");
        int i = hoGiaDinh2.timKiem("vinh");
        if (i == -1) {
            System.out.println("khong co nguoi");
        } else {

            System.out.println(hoGiaDinh2.getGiaDinh().get(i));
        }
    }
}

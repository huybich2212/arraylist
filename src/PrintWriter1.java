import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriter1 {
    public static void main(String[] args) throws Exception {
//        File file1 = new File("hello2.txt");
//        if (file1.exists()){
//            System.out.println("file đã tồn tại");
//        }
//        PrintWriter writer = new PrintWriter(file1);
//        writer.write("hello anh đạt");
//        writer.close();

        Scanner scanner = new Scanner(new File("so.txt"));
       while (scanner.hasNext()) {
           int so = scanner.nextInt();
           System.out.println(so);
       }

    }
}

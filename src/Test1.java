import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception {
        File file2 = new File("so1.txt");
        if (file2.exists()) {
            System.out.println("file đã tồn tại");

        }
        Scanner scanner = new Scanner(file2);
        String[] arr = scanner.nextLine().split(",");
        double x = 0;
        x = -Double.parseDouble(arr[1]) /Double.parseDouble(arr[0]);
        System.out.println(x);


        PrintWriter writer = new PrintWriter("test.txt");
        writer.print(x);
        writer.close();
        List<Integer> list = new ArrayList<>();



    }

}

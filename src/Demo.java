import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("so1.txt"));
        double[] arr = new double[5];
        for (int i = 0; sc.hasNext(); i++) {
            double a = sc.nextDouble();
            arr[i] = a;
        }
        double tong = 0, tich = 1, min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
            tich *= arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }

        }

        PrintWriter printWriter = new PrintWriter("rs.txt");
        printWriter.println(tong);
        printWriter.println(tich);
        printWriter.println(max);
        printWriter.println(min);
        sc.close();
        printWriter.close();
    }
}

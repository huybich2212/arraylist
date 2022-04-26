import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("so1.txt"));
        double[] arr = new double[5];
        for (int i = 0; scanner.hasNext() ; i++) {
            double a = scanner.nextDouble();
            arr[i] = a;
        }
        double max= arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        PrintWriter printWriter = new PrintWriter("xyz.txt");
        printWriter.println(max);
        scanner.close();
        printWriter.close();
    }
}

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.File;
import java.io.Writer;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {
        File file1 = new File("hello1.txt");
        if (file1.exists()) {
//            System.out.println("ádasd");
        }

        PrintWriter writer = new PrintWriter(file1);
        writer.write("Hello world");
//        writer.flush();
        writer.close();




        File file = new File("so.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));
        while (scanner.hasNext()) {
            int so = scanner.nextInt();
            System.out.println(Integer.parseInt(String.valueOf(so)));
        }
    }

 }


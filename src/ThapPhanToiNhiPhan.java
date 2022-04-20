import java.util.Scanner;
import java.util.Stack;

public class ThapPhanToiNhiPhan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("nhập vào số thập phân");
        int num = in.nextInt();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /=2;
        }
        System.out.println("Giá trị nhị phân là :");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

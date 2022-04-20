import java.util.Scanner;
import java.util.Stack;

public class ChuoiDoiXung {
    public static void main(String[] args) {
        System.out.println("nhập vào chuỗi cần kiểm tra");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < inputString.length() ; i++) {
            stack.push(String.valueOf(inputString.charAt(i)));

        }
        String reverseString = "";
        while (!stack.isEmpty()){
            reverseString = reverseString + stack.pop();
        }
        if (inputString.equals(reverseString) ) {
            System.out.println("đây là chuõi đối xứng");
        }else {
            System.out.println("đây ko phải chuỗi đối xứng");
        }
    }
}

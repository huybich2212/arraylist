import java.util.Scanner;
import java.util.Stack;

public class KtChuoiDoiXung {
    public static void main(String[] args) {
        System.out.println("nhập vào chuỗi bạn muốn kiểm tra :");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(String.valueOf(inputString.charAt(i)));//chuyển từ String sang charA

        }
        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();

        }
        if (inputString.equals(reverseString)) {
            System.out.println("đây là chuỗi đối xứng");

        }else{
                System.out.println("đây ko phải là chuỗi đối xứng");
            }
        }
    }

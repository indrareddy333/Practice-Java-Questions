import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 153;
        int count = 0;
        int result1 = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        while (num > 0) {
            int num1 = num % 10;
            double result = Math.pow(num1, count);
            result1 += result;
            num /= 10;
        }
        System.out.println(result1);

        scan.close();
    }

}

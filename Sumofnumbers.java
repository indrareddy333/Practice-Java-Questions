import java.util.*;

public class Sumofnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println(
                "Enter the numbers you want to perform addition and enter any alphabet character to exit and print sum = ");
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            sum = num + sum;
        }
        System.out.println("sum is = " + sum);
        scan.close();

    }
}
import java.util.Scanner;

public class FindRepeat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number = ");
        long num = scan.nextLong();
        System.out.print("Enter a number to find mutiple occurencies in the given long number = ");
        int num1 = scan.nextInt();
        int count = 0;
        while (num > 0) {
            long rem = num % 10;
            if (rem == num1) {
                count++;
            }
            num /= 10;
        }
        System.out.println("count = " + count);
        scan.close();
    }

}

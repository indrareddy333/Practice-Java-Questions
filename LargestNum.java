import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Three number to find largest number among them : -");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && a > c) {
            System.out.println("largest number = " + a);
        } else if (b > c) {
            System.out.println("largest number = " + b);
        } else {
            System.out.println("largest number = " + c);
        }
        scan.close();

    }

}

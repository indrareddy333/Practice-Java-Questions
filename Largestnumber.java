import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num1 = scan.nextInt();
        System.out.print("Enter a number = ");
        int num2 = scan.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is Larger");
        } else {
            System.out.println(num2 + " is Larger");
        }
        scan.close();

    }
}